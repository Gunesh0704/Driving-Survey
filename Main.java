package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the Age :- ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Yes, You can Drive......");
            System.out.println("But, You created Licence or not.....");
            System.out.println("If Yes then Enter 1 otherwise enter 0.....");
            int licence = a.nextByte();
            if(licence == 1){
                System.out.println("You are Eligible for Driving.....");
                System.out.println("You have your Vehicle or not.....");
                System.out.println("If Yes then Enter 1 otherwise enter 0.....");
                int vehicle = b.nextByte();
                if(vehicle == 1){
                    System.out.println("You have Vehicle Document or Not.....");
                    System.out.println("If Yes then Enter 1 otherwise enter 0.....");
                    int Document = c.nextByte();
                    if(Document == 1){
                        System.out.println("You can Drive vehicle without any Challans.....");
                    }
                    else{
                        System.out.println("You can't Drive Vehicle.\nFirstly make Documents then Drive Vehicle.....");
                    }
                }
                else{
                    System.out.println("Purchase Your Own Vehicle or Borrow Friends Vehicle with Vehicle's Document.....");
                }
            }
            else{
                System.out.println("You are not Eligible for Driving.....");
            }
        }
        else{
            System.out.println("No, You can't Drive yet......");
        }
    }
}
