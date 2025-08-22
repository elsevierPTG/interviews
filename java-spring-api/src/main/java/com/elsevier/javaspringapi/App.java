package com.elsevier.javaspringapi;

import java.util.List;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

// Controller
@RestController
public class QuestionController {

	@Autowired
	private final QuestionService questionService;
	@Autowired
	private final UserRepository userRepository;
	@Autowired
	private QuestionAnswerRepository questionAnswerRepository;
	private Logger log = LoggerFactory.getLogger(QuestionController.class);

	public QuestionController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@PostMapping("/submitQuestion")
	public QuestionAnswer submitQuestion(@RequestBody QuestionAnswer req) {
		log.info("Submitting question {}", req);
		return questionService.submitQuestion(req);
	}

	@PostMapping("/users/{userId}/exams/{examId}/scoreExam")
	public double scoreExam(@PathVariable String userId, @PathVariable String examId) {
		log.info("Score exam {} for user {}", examId, userId);
		return questionService.scoreExam(examId);
	}

	@GetMapping("/getinstitutions/answers")
	public List<QuestionAnswer> getInstituitionAnswers(@RequestParam List<Long> institutionIds) {
		List<QuestionAnswer> questionAnswers;
		for (Long institutionId : institutionIds) {
			log.info("Get all answers for institution {}", institutionId);
			List<User> allByInstitutionId = userRepository.getAllByInstitutionId(institutionId);

			for (User user : allByInstitutionId) {
				log.info("User: {}", user);
				questionAnswers = questionAnswerRepository.getQuestionAnswerByUser(user.id);
			}
		}
		return questionAnswers;
	}

	@GetMapping("/users/{userId}/exams/{examId}/deleteExam")
	public void deleteExam(@PathVariable Long userId, @PathVariable Long examId) {
		int count = questionAnswerRepository.deleteByExamId(examId);
	}
}

// Service
public interface QuestionService {

	QuestionAnswer submitQuestion(QuestionAnswer answer);

	double scoreExam(long examId);
}

@Service
public class QuestionServiceImpl implements QuestionService {

	private static final Logger LOGGER = LoggerFactory.getLogger(QuestionService.class);

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private QuestionRepository questionRepo;
	@Autowired
	private QuestionAnswerRepository answerRepo;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public QuestionAnswer submitQuestion(QuestionAnswer answer) {
		LOGGER.info("Submitting question for user {}", answer.user.id);
		User user = userRepo.findById(answer.userId).orElse(null);
		if (user == null) {
			return null;
		}
		LOGGER.info("Submitting question {}", answer.question.id);
		Question question = questionRepo.findById(answer.questionId).orElse(null);
		if (question == null) {
			LOGGER.warn("Submitted question is {}", question);
			throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		boolean isCorrect = question.getCorrectAnswer().equalsIgnoreCase(answer.submittedAnswer);
		answer.isCorrect = isCorrect;
		LOGGER.info("Submitted question is correct? {}", isCorrect);

		return answerRepo.save(answer);
	}

	@Transactional
	public double scoreExam(String examId) {
		String sql = "SELECT * FROM question_answer WHERE examId = " + examId;
		List<Boolean> answers = jdbcTemplate.query(
				sql,
				ids.toArray(),
				(rs, rowNum) -> {
					return rs.getBoolean("correct");
				}
		);
		return new ScoreSummer(answers).getScore();
	}
}

class ScoreSummer {

	public static List<Boolean> answers;

	public ScoreSummer(List<Boolean> answers) {
		this.answers = answers;
	}

	public double getScore() {
		double score = 0;
		double total = 0;
		for (Boolean answer : answers) {
			if (answer) {
				score += 1;
			}
			total++;
		}
		return score / total;
	}
}

// Repositories
interface UserRepository extends JpaRepository<User, Long> {

	List<User> getAllByInstitutionId(Long institutionId);

}

interface QuestionRepository extends JpaRepository<Question, Long> {

}

interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, Long> {

	int deleteByExamId(Long examId);
}

// Entities
@Entity
class Institution {

  @Id
	@GeneratedValue
	public int id;
	public String name;
	public String address;
	public String secretKey;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<User> users;

	@Override
	public String toString() {
		return "Institution{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", secretKey='" + secretKey + '\'';
	}
}

@Entity
class User {

	@Id
	@GeneratedValue
	public int id;
	public String username;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<Institution> institutions;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<QuestionAnswer> questionAnswers;


}

@Entity
class Question {

	@Id
	@GeneratedValue
	public int id;
	public String content;
	public String correctAnswer;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<QuestionAnswer> questionAnswers;

}

@Entity
class QuestionAnswer {

	@Id
	@GeneratedValue
	public int id;

	public Long examId;

	@ManyToOne(fetch = FetchType.EAGER)
	public User user;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Question question;

	public String submittedAnswer;
	public boolean correct;

}