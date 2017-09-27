package com.elsevier.education;

import java.util.*;
import com.elsevier.education.Exercise5.Singleton;
import static org.junit.Assert.*;
import org.junit.Test;

public class Exercise5Test {

    @Test
    public void testSingleton() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        assertEquals(s1, s2);

        s1.doSomething();
        s2.doSomething();
    }
}
