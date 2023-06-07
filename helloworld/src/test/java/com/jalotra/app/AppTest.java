package com.jalotra.app;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest {
    private static App appObject;

    @BeforeClass
    public static void setup(){
        appObject = new App();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Test
    public void testadd2numbers_Passes(){
        int a = 5;
        int b = 2;

        int result = appObject.add2numbers(a, b);
        assertTrue(result == 7);

    }

    @Test
    public void testadd2numbers_Fails(){
        int a = 5;
        int b = 2;

        int result = appObject.add2numbers(a, b);
        assertTrue(result == 8);

    }
}
