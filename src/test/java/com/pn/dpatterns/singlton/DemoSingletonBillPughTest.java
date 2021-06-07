package com.pn.dpatterns.singlton;

import org.junit.Assert;
import org.junit.Test;

public class DemoSingletonBillPughTest {

    @Test
    public void testGetInstance() {
        DemoSingletonBillPugh instance = DemoSingletonBillPugh.getInstance();
        DemoSingletonBillPugh instance1 = DemoSingletonBillPugh.getInstance();
        DemoSingletonBillPugh instance2 = DemoSingletonBillPugh.getInstance();
        DemoSingletonBillPugh instance3 = DemoSingletonBillPugh.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
        Assert.assertEquals(instance, instance1);
        Assert.assertEquals(instance1, instance2);
        Assert.assertEquals(instance2, instance3);
        Assert.assertEquals(instance, instance3);
    }

}
