package ua.cam.javaschool.homework.start.lesson1.lesson2;

import java.util.Scanner;

public class Newclas {
    public static final String Name = "Lesson_1.Rect.Rectangle";
    private int width, heigth;

    public Rectangle(int width,int heigth){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type side rectangle");
        this.width = sc.nextInt();
        this.heigth = sc.nextInt();
    }
    public void setWidth(int width){
        this.width = width;

    }
    public void setHeigth(int heigth){
        this.heigth = heigth;
    }
    public int square(){
        return heigth * width;
    }
}
