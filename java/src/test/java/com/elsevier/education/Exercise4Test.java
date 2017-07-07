package com.elsevier.education;
import com.elsevier.education.Exercise4.*;
import org.junit.Test;
/**
 * Created by davenportj on 7/6/2017.
 *
 * This test shows that count++ is a non-atomic operation- that it actually
 * consists of several steps that can be interrupted. One would expect from
 * the below code that two threads which both increment counter ten times
 * would at the end print 20- but in fact that usually doesn't happen. The
 * processSomething() method helps ensure that the threads will interrupt
 * each other at odd times.
 *
 */
public class Exercise4Test {
  @Test
  public void threadTest() throws InterruptedException {
    Counter counter = new Counter();
    ThreadRunner threadRunner = new ThreadRunner(counter);
    Thread t1 = new Thread(threadRunner, "t1");
    Thread t2 = new Thread(threadRunner, "t2");
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(counter.getCount());

  }

  public static class ThreadRunner implements Runnable {
    private Counter counter;

    @Override
    public void run() {
      for (int i = 0; i < 10; i++) {
        counter.increment();
        processSomething(i);
      }
    }
    public ThreadRunner(Counter counter) {
      this.counter = counter;
    }
    public void processSomething(int i) {
      try {
        Thread.sleep(i * 100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
