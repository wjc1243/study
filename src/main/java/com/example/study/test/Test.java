package com.example.study.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        String s = "abbbccccddeeffffaaaddzzz";
        char[] sc = new char[26];
        for (int i = 0; i < s.length(); i++) {
            sc[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < sc.length; i++) {
            if(sc[i] == 3){
                System.out.println((char)(i + 'a'));
            }
        }

        int[] a = {14,-2,4,-3,5,7,2,-39,22};
        System.out.println(maxSum(a));

        String[] s1 = {"1", "2", "3", "4", "5"};
        String[] s2 = {"3", "4", "5", "6", "7"};
        intersect(s1, s2);

        Person[] ps = {new Person(1L, "333", 18), new Person(2L, "222", 19), new Person(3L, "111", 20)};
        Arrays.sort(ps, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(Arrays.asList(ps));
    }

    private static Set<String> intersect(String[] s1, String[] s2){
        List<String> l = new ArrayList<>();
        Set<String> common = new HashSet<String>();
        for(String str: s1){
            if(!l.contains(str)){
                l.add(str);
            }
        }
        for(String str: s2){
            if(l.contains(str)){
                common.add(str);
            }
        }
        return common;
    }

    private static int maxSum(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
