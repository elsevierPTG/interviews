package com.elsevier.education;

import java.util.*;
import com.elsevier.education.Exercise5.Singleton;
import static org.junit.Assert.*;
import org.junit.Test;

public class Exercise5Test {

    @Test
    public void testAsElement() {

        Singleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();

        //s1 and s2 should be the same instance, therefore they should have the same random number
        Integer val1 = s1.returnSomething();
        Integer val2 = s2.returnSomething();

        assertEquals(val1, val2);
    }
}
