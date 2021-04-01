package src.demo.singleton;

public class Singleton {


    private Singleton(){

    }

 /** 饿汉式，方法在需要实例的时候，才会创建
 *

    private static Singleton singleton = null;

    static Singleton getSingleton(){

        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }*/


/** 懒汉式，在类装载之后就会被实例化
 *
    private final static Singleton singleton = new Singleton();

    public Singleton getSingleton(){
        return singleton;
    }*/


   /** 线程安全模式

    private volatile static Singleton singleton;

    public Singleton getSingleton(){

        if (singleton == null){

            synchronized (Singleton.class){

                if (singleton == null){
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }*/



}
