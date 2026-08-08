package com.interview;
import java.util.*;
public class SortAListDesc {
    public static void main(String[] args) {
         List<Integer> list =Arrays.asList(3,5,1,6);
         int val = list.stream()
                 .distinct()
                 .sorted(Comparator.reverseOrder())
                 .skip(2)
                 .findFirst()
                 .get();
        System.out.println(val);
//        List<Integer> list = Arrays.asList(2,4,5,5,6);
//       int max =  list.stream()
//               .distinct()
//               .sorted(Comparator.reverseOrder())
//               .findFirst()
//                .get();
//        System.out.println(max);
    }
}
