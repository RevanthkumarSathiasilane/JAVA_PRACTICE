package com.cloning;

public class Human implements Cloneable{
    String name;
    int age;
    int[] arr;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{1,2,3,4,5,6,7};
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException//need to specify throws beacuse whatever inside
//            //that also has throws CustomException; simply intimating the method, that it has an Exception
//     {
//         // this is a shallow copy
//        return super.clone();
//    }

       @Override
    public Object clone() throws CloneNotSupportedException//need to specify throws beacuse whatever inside
            //that also has throws CustomException; simply intimating the method, that it has an Exception
     {
         // this is a deep copy
        Human twin = (Human)super.clone();//this is actually shallow  copy
         //make a deep copy
         twin.arr = new int[twin.arr.length];
         for(int i=0;i<twin.arr.length;i++){
             twin.arr[i] = this.arr[i];
         }
         return twin;
    }
}
