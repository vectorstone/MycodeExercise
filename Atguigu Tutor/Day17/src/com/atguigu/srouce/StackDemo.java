package com.atguigu.srouce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/*
栈结构:先进后出
push(E e): 将元素存入到栈结构
pop(): 从栈结构里拿出数据
peek(): 从栈结构里获取到数据
*/
public class StackDemo {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("hello1");
        stack.push("hello2");
        stack.push("hello3");
        stack.push("hello4");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Stack<Integer> s = new Stack<>();
        s.push(9);
        s.push(7);
        s.push(5);
        s.push(2);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());


        LinkedList<String> list = new LinkedList<>();
        list.push("hello1");
        list.push("hello2");
        list.push("hello3");
        list.push("hello4");

        System.out.println(list.pop());

    }
}

class MyStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public void push(E e) {
        list.add(e);
    }

    public E pop() {
        return list.remove(list.size() - 1);
    }
}
