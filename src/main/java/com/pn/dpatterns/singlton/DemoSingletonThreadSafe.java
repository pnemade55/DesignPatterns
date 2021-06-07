package com.pn.dpatterns.singlton;

public class DemoSingletonThreadSafe {

    private static DemoSingletonThreadSafe INSTANCE;

    private DemoSingletonThreadSafe(){
    }

    public static DemoSingletonThreadSafe getInstance(){
        if(INSTANCE == null){
            synchronized (DemoSingletonThreadSafe.class){
                if(INSTANCE == null){  //double check because first few threads who might create the separate instances. To avoid extra overhead.
                    INSTANCE =  new DemoSingletonThreadSafe();
                }
            }
        }
        return INSTANCE;
    }
}
