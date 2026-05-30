package com.bala;
import java.util.*;
public class Lar {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=n%10;
    int h=0;
    while(n>0){
        int l=n%10;
        if(l>=i){
             h=l;
        }
        else{
            h=i;
        }
        n/=10;
    }
    System.out.println(h);
}
}