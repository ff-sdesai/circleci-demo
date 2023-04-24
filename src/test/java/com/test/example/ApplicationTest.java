package com.test.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationTest {

    @Test
    public void test1() {
        System.out.println( "Running test1" );
        Assert.assertEquals( false, false );
    }

    @Test
    public void test2() {
        System.out.println( "Running test2" );
        Assert.assertEquals( "test2", "test2" );
    }

}
