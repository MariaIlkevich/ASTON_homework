package com.example;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static junit.framework.Assert.assertTrue;

public class AppTest
{
    public AppTest(String testName)
    {
        super();
    }
    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }
    public void testApp()
    {
        assertTrue( true );
    }
}
