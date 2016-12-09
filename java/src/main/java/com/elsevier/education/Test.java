package com.elsevier.education;

import java.util.HashSet;

/**
 * Created by Rama Sudalayandi on 12/9/16.
 */
public class Test {
    public static void main(String[] args) {
        //test();
        testExercise4();
    }

    //Exercise 1,2
    private static void test() {
        //1
        Exercise1.Person person = new Exercise1.Person("Rama", "Sudalayandi", new HashSet<>(1));
        System.out.println(person);

        //2
        Exercise2.Car car = new Exercise2.Car(new Exercise2.Engine() {
            @Override
            public void spinWheels() {
                System.out.println("Moving...");
            }
        });
        car.moveForward();
    }

    // Exercise 4
    private static void testExercise4() {
        Exercise4.Counter counter = new Exercise4.Counter();

        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++)
                    System.out.println(counter.getCount());
            }
        };

        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++)
                    System.out.println(counter.getCount());
            }
        };

        new Thread(thread1).run();
        new Thread(thread1).run();
    }

}
