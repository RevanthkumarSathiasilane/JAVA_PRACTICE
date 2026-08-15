package com.HexWare.interviewprep;

public class DivisorException {
    public static void main(String[] args) {
        int a = 40;
        int b = 0;
        try{
            int c = divideIt(a,b);
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    static int divideIt(int a,int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("Can't divide");
        return a/b;
    }
}
