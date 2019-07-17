package com.dm.example.arrays;

/**
 * 数组查找元素方法
 */
public class findArrays {

    /**
     * 线性遍历方法，复杂度最高，性能最低
     * @param nums
     * @param element
     * @return
     */
    public int normal(int[] nums,int element){
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == element){
                return i;
            }
        }
        return -1;
    }

    /**
     * 二分法查找，性能高，条件是数组必须是有序排列
     * @param nums
     * @param element
     * @return
     */
    public int binary(int[] nums, int element){
        int start = 0;
        int end = nums.length;
        int  middle;
        while(true){
            middle = (start + end) / 2;
            if(element == nums[middle]){
                break;
            }else{
                if(element > middle){
                    start = middle;
                }else{
                    end = middle;
                }
            }
        }
        return middle;
    }

    public static void main(String[] args) {
        int[] dm = new int[]{1,3,4,5,9,10};
        findArrays find = new findArrays();
        System.out.println(find.normal(dm,3));
        System.out.println(find.binary(dm,9));
    }


}
