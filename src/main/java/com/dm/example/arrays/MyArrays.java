package com.dm.example.arrays;

import java.util.Arrays;

/**
 * 面向对象定义数组
 */
public class MyArrays {

    private int[] elements;

    public MyArrays(){
        this.elements = new int[0];
    }

    public int size(){
        return elements.length;
    }


    /**
     * 展示元素
     */
    public void show(){
        System.out.println(Arrays.toString(elements));
    }

    /**
     * 追加元素
     * @param element
     * @return
     */
    public void add(int element){

        int[] newArray = new int[elements.length+1];

        for (int i = 0; i < elements.length; i++){
            newArray[i] = elements[i];
        }

        newArray[elements.length] = element;
        elements = newArray;
    }

    /**
     * 删除
     * @param index
     */
    public void del(int index){
        if(index < 0 || index > elements.length - 1){
            throw new RuntimeException("下标越界");
        }
        int[] newArray = new int[elements.length-1];
        for(int i = 0; i < newArray.length; i++){
            if(i < index){
                newArray[i] = elements[i];
            }else{
                newArray[i] = elements[i+1];
            }
        }
        elements = newArray;
    }

    /**
     * 修改
     * @param index
     * @param element
     */
    public void set(int index,int element){
        if(index < 0 || index > elements.length - 1){
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
    }

    /**
     * 根据下标获取
     * @param index
     * @return
     */
    public int get(int index){
        if(index < 0 || index > elements.length - 1){
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }

    public static void main(String[] args) {
        MyArrays arrays = new MyArrays();
        //1.新增
        arrays.add(1);
        arrays.add(2);
        arrays.add(3);
        arrays.show();
        //2.删除
        arrays.del(0);
        arrays.show();
        //3.修改
        arrays.set(0,5);
        arrays.show();
        //4.查询
        System.out.println(arrays.get(1));
        //5.判断是否非空
        System.out.println(arrays.isEmpty());
    }

}
