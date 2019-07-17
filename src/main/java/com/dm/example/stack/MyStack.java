package com.dm.example.stack;

import java.util.Arrays;

/**
 * 面向对象数组实现栈
 * 特点先进后出，类似一个箱子
 *  | | |
 *  |   |
 *  |___|
 *  |___|
 */
public class MyStack {

    private int[] elements;

    public MyStack(){
        elements = new int[0];
    }

    /**
     * 进栈
     * @param element
     */
    public void push(int element){
        int[] newArray = new int[elements.length+1];
        for(int i = 0; i< elements.length; i++){
            newArray[i+1] = elements[i];
        }
        newArray[0] = element;
        elements = newArray;
    }

    /**
     * 展示列表元素
     */
    public void show(){
        System.out.println(Arrays.toString(elements));
    }

    /**
     * 出栈
     */
    public void pop(){
        int[] newArray = new int[elements.length-1];
        for(int i = 0;i< newArray.length; i++){
            newArray[i] = elements[i+1];
        }
        elements = newArray;
    }

    /**
     * 栈顶
     * @return
     */
    public int topStack(){
        return elements[0];
    }

    /**
     * 栈底
     * @return
     */
    public int bottomStack(){
        return elements[elements.length-1];
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("栈顶"+stack.topStack());
        System.out.println("栈底"+stack.bottomStack());
        stack.show();
        stack.pop();
        stack.show();
    }


}
