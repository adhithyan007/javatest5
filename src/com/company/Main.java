package com.company;

import java.util.Arrays;
import java.util.Scanner;


class student {
    String Name;
    int ID;
    char Gender;
    int[] Marks = new int[4];
    double Total_Percentage;
    student(){
        Name ="Null";
        ID =-1;

        Gender ='t';
        Total_Percentage =5;
    }
    void details() {
        System.out.println(Name);
        System.out.println(ID);
        System.out.println(Gender);
        System.out.println(Arrays.toString(Marks));
        System.out.println(Total_Percentage);



    }
}
public class Main {
    static int n=0;
    public static void main(String[] args) {
        student[] std = new student[100];

        while (true) {
            Scanner Obj = new Scanner(System.in);

            System.out.println("*************");
            System.out.println("**            MENU           **");
            System.out.println("*                                   *");
            System.out.println("*        1. Enter Student Details   *");
            System.out.println("*        2. Find Students           *");
            System.out.println("*        3. Top Students            *");
            System.out.println("*        4. Show all Students       *");
            System.out.println("*        5. Exit                    *");
            System.out.println("*************");
            System.out.println("");
            System.out.println("**     Enter your Choice:    **");


            int o = Obj.nextInt();




            if(o ==1) {
                System.out.println("How many students: ");
                n = Obj.nextInt();
                for (int i=0;i<n;i++) {
                    System.out.println("Enter Name : ");
                    std[i].Name = Obj.next();
                    System.out.println("Enter Student ID : ");
                    std[i].ID = Obj.nextInt();
                    System.out.println("Enter Marks : ");
                    for (int ii = 0; ii < 4; ii++) {
                        std[i].Marks[i] = Obj.nextInt();

                    }

                    System.out.println("Enter Gender : ");
                    std[i].Gender = Obj.next().charAt(0);
                    std[i].Total_Percentage = (std[i].Marks[0] + std[i].Marks[1] + std[i].Marks[2] + std[i].Marks[3]) / 4;
                    System.out.println(std[i].Total_Percentage);
                }
            }


            else if(o ==2) {
                for (int i = 0; i < n; i++) {
                    std[i].details();
                }
            }

            else if(o ==3) {
                System.out.println(std[1].Name);
                System.out.println(std[2].Total_Percentage);
                System.out.println(std[2].Name);
            }
        }

    }

}