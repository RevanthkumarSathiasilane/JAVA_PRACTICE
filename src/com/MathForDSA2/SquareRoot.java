package com.MathForDSA2;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.printf("%.3f",squareRoot1(n,p));
    }
    static double squareRoot1(int n,int p){
        int s = 0;
        int e = n;
        double root = 0.0;
        while(s<e){
            int m = s+(e-s)/2;
            if(m*m == n) return m;
            if(m*m>n) e=m-1;
            else{
                root = m;
                s=m+1;
            }
        }
        double incr = 0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
