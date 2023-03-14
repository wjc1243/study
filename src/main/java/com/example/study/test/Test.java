package com.example.study.test;

import com.example.study.study.Node;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree(1, new Tree(2, new Tree(4, null, null), new Tree(5, null, null)), new Tree(3, new Tree(6, null, null), new Tree(7, null, null)));
        List<Integer> list = new ArrayList<>();
        helper(tree, list);
        System.out.println(list);
    }

    private static void helper(Tree tree, List list){
        list.add(tree.val);
        if(tree.left != null){
            helper(tree.left, list);
        }
        if(tree.right != null){
            helper(tree.right, list);
        }
    }

    private static void helper2(Tree tree, List list){
        Deque<Integer> queue = new LinkedList<>();

    }
}
