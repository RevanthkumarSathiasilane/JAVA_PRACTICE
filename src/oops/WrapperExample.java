package oops;

public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;//int
        Integer b = 20;//int

        swap(a,b);

        System.out.println(a+" "+b);

//        final int BONUS = 20;
//        BONUS = 25;//can't modify it!!


         final A revanth = new A("Revanth");
         revanth.name = "other name";//can modify but,


        //when a non-primitive is final you can't reassign it.
        //revanth = new A("new object");//can't modify it!!

        A obj;
        for(int i=0;i<1000000000;i++){
            obj = new A("RandomName");
        }

    }
    static void swap(Integer a,Integer b){//int
        Integer temp = a;//int
        a = b;
        b = temp;
    }
}
class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed!!");
    }
}
