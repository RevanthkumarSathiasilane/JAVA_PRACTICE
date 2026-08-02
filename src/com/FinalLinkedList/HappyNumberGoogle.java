package com.FinalLinkedList;

public class HappyNumberGoogle {
    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
    }

    static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);
        if (slow == 1) return true;
        return false;
    }

    static int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += (rem * rem);
            number /= 10;
        }
        return ans;
    }


}
