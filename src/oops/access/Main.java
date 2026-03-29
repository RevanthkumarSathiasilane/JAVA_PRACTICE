package oops.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(34,"revanth");

        // need to do a few thing:
        //1. access the data members
        //2. modify the data members
//        ArrayList<Integer> list = new ArrayList<>();
//        list.DEFAULT_CAPACITY;
        obj.getNum();
        System.out.println(obj.num);
    }
}
