package org.example;


import java.util.Scanner;
import  java.util.logging.*;
public class Students
{
    String name;
    int grade;
    int gpa;
    Scanner s=new Scanner(System.in);
    Scanner c=new Scanner(System.in);
    Logger l=Logger.getLogger("tyler");

    Students()
    {
        l.info("enter your name:");
        String a=c.next();
        name=a;
        l.info("Enter your Grade From one to five Level");
        int b=s.nextInt();
        grade =b;
        l.info("enter your GPA :");
        int d=s.nextInt();
        gpa =d;
        l.info("If you want to update your Gps: \n 1.yes \n 2.NO");
        int sel=s.nextInt();
        if (sel==1)
        {
            update();
        }
        if (sel ==2)
        {
            show();
        }
    }
    void update()
    {
        l.info("Enter your Updated Gpa:");
        int e=s.nextInt();
        gpa =e;
        show();
    }
    void show()
    {
        l.log(Level.INFO, () ->name+ " have scored" + " Grade Level Of "+ grade + " and GPA of "+ gpa);
    }

    public static void main(String[] args)

    {
        Students ragul=new Students();
        ragul.show();
    }
}
