package oops;

public class Singleton {
    private static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        //check whether 1 object is created or not
        if(instance == null) instance =  new Singleton();
        return instance;
    }
}
