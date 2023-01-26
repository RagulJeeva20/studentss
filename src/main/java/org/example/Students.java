package org.example;


import java.util.Scanner;
public class Students
{
    String name;
    int grade;
    int gpa;
    Scanner s=new Scanner(System.in);
    Scanner c=new Scanner(System.in);

    Students()
    {
        System.out.println("enter your name:");
        String a=c.next();
        name=a;
        System.out.println("Enter your Grade From one to five Level");
        int b=s.nextInt();
        grade=b;
        System.out.println("enter your GPA :");
        int d=s.nextInt();
        gpa=d;
        System.out.println("If you want to update your Gps: \n 1.yes \n 2.NO");
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
        System.out.println("Enter your Updated Gpa:");
        int e=s.nextInt();
        gpa=e;
        show();
    }
    void show()
    {
        System.out.println(name+ " have scored" + " Grade Level Of "+ grade + " and GPA of "+ gpa);
    }

    public static void main(String[] args)
    {
        Students ragul=new Students();
        ragul.show();
    }
}
