package com.company;

import java.util.Scanner;

public class BMI {
    public static void main(String[] arg){
        //BMI = 体重（kg）/ 身高（m）^ 2

        Scanner BMI = new Scanner(System.in);
        System.out.println("Enter your weight(kg): ");
        float weight = BMI.nextFloat();
        System.out.println("Enter your height(m): ");
        float height = BMI.nextFloat();
        if(height < 2.5 && height >=0){
            float BMIValue = weight/(height*height);
            System.out.printf("Your BMI is %.1f, ",BMIValue);

            if(BMIValue < 18.5){
                System.out.println("过轻");
            }
            else if(BMIValue >= 18.5 && BMIValue < 25.0){
                System.out.println("正常");
            }
            else if(BMIValue >= 25 && BMIValue < 28){
                System.out.println("过重");
            }
            else if(BMIValue >= 28 && BMIValue < 32){
                System.out.println("肥胖");
            }
            else {
                System.out.println("非常肥胖");
            }
        }
        else{
            System.out.println("身高不属于正常范围！请重新填写。");
        }
    }
}
