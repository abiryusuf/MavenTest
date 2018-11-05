package com.qa.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void Sum() {
        System.out.println("Sum");
        int a = 10;
        int b = 20;
        Assert.assertEquals(30, a + b);
    }

    @Test
    public void Sub() {
        System.out.println("Sub");
        int a = 10;
        int b = 20;
        Assert.assertEquals(10, b - a);
    }

    @Test
    public void div() {
        System.out.println("div");
        int a = 10;
        int b = 20;
        Assert.assertEquals(2, b / a);

    }

}
