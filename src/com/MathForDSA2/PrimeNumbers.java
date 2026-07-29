package com.MathForDSA2;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 500;
        System.out.println(prime1(n));
        boolean[] isPrime = new boolean[n+1];
        sieve(n,isPrime);
    }
    //brute-force:
    static boolean prime1(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
  // optimized:
    static void sieve(int n,boolean[] isPrime){
        for(int i=2;i*i<=n;i++){
            if(!isPrime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    isPrime[j] = true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!isPrime[i]) System.out.print(i+" ");
        }
    }
}
