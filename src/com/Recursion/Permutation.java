package com.Recursion;
import java.util.*;
/*
Permutation:
"abc" - 3!= 6 [ abc,acb,bac,bca,cab,cba] = 6 possibilities;
 */
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permutation("",str);
    }
    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }
}
