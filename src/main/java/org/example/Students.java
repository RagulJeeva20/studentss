package org.example;


import java.util.Scanner;
public class Students
{
    String name;
    int Grade;
    int Gpa;
    Scanner s=new Scanner(System.in);
    Scanner c=new Scanner(System.in);

    Students()
    {
        System.out.println("enter your name:");
        String a=c.next();
        name=a;
        System.out.println("Enter your Grade From one to five Level");
        int b=s.nextInt();
        Grade=b;
        System.out.println("enter your GPA :");
        int d=s.nextInt();
        Gpa=d;
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
        Gpa=e;
        show();
    }
    void show()
    {
        System.out.println(name+ " have scored" + " Grade Level Of "+ Grade + " and GPA of "+ Gpa);
    }

    public static void main(String[] args)
    {
        Students ragul=new Students();
    }
}