package com.shuati;

public class LC_11_Container_with_most_water {
    public int maxArea(int[] height) {
        int first = 0;
        int last = height.length - 1;
        int max = 0, temp;

        while (first < last){
            if (height[first] <= height[last]){
                temp = height[first] * (last - first);
                first++;
            } else{
                temp = height[last] * (last - first);
                last--;
            }
            max = max < temp ? temp : max; // this one is faster than math.max
        }
        return max;
    }
}
