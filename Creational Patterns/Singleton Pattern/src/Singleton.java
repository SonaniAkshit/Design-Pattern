public class Singleton {

    private static Singleton singleInstance;

    private Singleton() {}

    public static Singleton getSingletoninstance(){
        if(singleInstance==null){
            synchronized (Singleton.class){
                if(singleInstance==null){
                    singleInstance=new Singleton();
                }
            }
        }
        return singleInstance;
    }
}