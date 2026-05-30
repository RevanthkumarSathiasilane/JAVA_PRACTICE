package com.bala;
import java.util.*;
public class Countfactors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                s+=1;
            }
        }
        System.out.println(s);
    }
}
