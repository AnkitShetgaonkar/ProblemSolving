package com.company;


/***
 Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 Note: You may not slant the container and n is at least 2.

 */
public class Main {

    public int maxArea(int[] height) {
        int p = 0;
        int q = height.length-1;
        int maxArea = 0;
        while(p<q){
            int temp = Math.min(height[p],height[q])*(q-p);
            if(height[p]<height[q]){
                p++;
            }else{
                q--;
            }
            if(maxArea<temp){
                maxArea  = temp;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.maxArea(new int[]{1,2,4,3}));
    }
}
