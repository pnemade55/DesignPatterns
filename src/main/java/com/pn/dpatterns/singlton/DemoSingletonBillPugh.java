package com.pn.dpatterns.singlton;

public class DemoSingletonBillPugh {
    private  DemoSingletonBillPugh(){
    }

    private static class HelperSingleton{
        private static final DemoSingletonBillPugh INSTANCE= new DemoSingletonBillPugh();
    }

    public static DemoSingletonBillPugh getInstance(){
        return HelperSingleton.INSTANCE;
    }

}
