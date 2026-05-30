package com.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        //int c = a/b;//Runtime Exception : Arithmetic Exception
        try{
            String name = "Revanth";
            if(name.equals("Revanth")) throw new CustomException("name is Revanth");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This block will print continuously");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please don't divide by zero");
        }
        return a/b;
    }
}
