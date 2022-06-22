package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vingtcents
 */

class Solution {
    public static void main(String[] arg){

        int[] input = new int[]{2,4,6,8,10,9,15};
        List<Object> list = new ArrayList<>();
        int left = 0;
        int right = input.length-1;
        int count = 0;
        for(int i=0; i< input.length-1; i++){
            count = 0;
            for(int j=i+1; j<= input.length-1; j++){
                if(input[i]<=input[j]){
                    count +=1 ;
                }
            }
            if (count == input.length-i-1){
                left += 1;
            }
            else{
                break;
            }
        }

        for(int i= input.length-1; i>=1; i--){
            count = 0;
            for(int j = i-1; j>=0; j--){
                if(input[i]>=input[j]){
                    count += 1;
                }
            }
            if (count == i){
                right -= 1;
            }
            else{
                break;
            }
        }

        System.out.println(right - left + 1);

    }
}

