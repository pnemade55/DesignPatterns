package com.pn.dpatterns.singlton;

import org.junit.Assert;
import org.junit.Test;

public class DemoSingletonThreadSafeTest {

    @Test
    public void testGetInstance() {
        DemoSingletonThreadSafe demoSingletonThreadSafe = DemoSingletonThreadSafe.getInstance();
        DemoSingletonThreadSafe demoSingletonThreadSafe2 = DemoSingletonThreadSafe.getInstance();
        DemoSingletonThreadSafe demoSingletonThreadSafe3 = DemoSingletonThreadSafe.getInstance();
        DemoSingletonThreadSafe demoSingletonThreadSafe4 = DemoSingletonThreadSafe.getInstance();
        System.out.println(demoSingletonThreadSafe);
        System.out.println(demoSingletonThreadSafe2);
        Assert.assertEquals(demoSingletonThreadSafe, demoSingletonThreadSafe2);
        Assert.assertEquals(demoSingletonThreadSafe2, demoSingletonThreadSafe3);
        Assert.assertEquals(demoSingletonThreadSafe3, demoSingletonThreadSafe4);
        Assert.assertEquals(demoSingletonThreadSafe, demoSingletonThreadSafe4);
    }

}
