package com.dm.example.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 面向对象实现队列
 * 特点先进先出
 */
public class MyQueue {

    private int[] elements;

    public MyQueue(){
        elements = new int[0];
    }

    /**
     * 入队
     * @param element
     */
    public void push(int element){
        int[] newArray = new int[elements.length+1];
        for(int i = 0; i< elements.length; i++){
            newArray[i] = elements[i];
        }
        newArray[elements.length] = element;
        elements = newArray;
    }

    /**
     * 展示列表元素
     */
    public void show(){
        System.out.println(Arrays.toString(elements));
    }

    /**
     * 出队
     */
    public void pop(){
        int[] newArray = new int[elements.length-1];
        for(int i = 0;i< newArray.length; i++){
            newArray[i] = elements[i+1];
        }
        elements = newArray;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.show();
        queue.pop();
        queue.show();
    }


}
