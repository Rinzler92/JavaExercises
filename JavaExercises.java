/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexercises;

import java.util.*;

/**
 *
 * @author Home
 */
public class JavaExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*       System.out.println("Hello\nPhil O'Brien");
        int x = 74;
        int y = 36;
        System.out.println(x + y);
        int a = 50;
        int b = 3;
        System.out.println(a / b);
        int c = -5;
        int d = 8;
        int e = 6;
        System.out.println( c + d * e);
        int f = 55;
        int g = 9;
        System.out.println((f + g) % g);
        int h = 20;
        int i = -3;
        int j = 5;
        System.out.println( h + i * j / d);
        int k = 15;
        int l = 2;
        System.out.println( j + k / b * l - d % b);    
        int width = 0;
        int length = 40;

        try {
            int Ratio = length / width;
            System.out.println(Ratio);

        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero");
        }
    }
}*/
  

   

       

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Shape Area Calculator");

            while (true) {

                System.out.println();
                System.out.println("-=-=-=-=-=-=-=-=-=-");
                System.out.println();
                System.out.println("1) Triangle");
                System.out.println("2) Rectangle");
                System.out.println("3) Circle");
                System.out.println("4) Quit");
                System.out.println();

                System.out.print("Which shape: ");

                int shape = keyboard.nextInt();
                System.out.println();

                if (shape == 1) {
                    area_triangle(5, 6);
                } else if (shape == 2) {
                    area_rectangle(4, 5);
                } else if (shape == 3) {
                    area_circle(4);
                } else if (shape == 4) {
                    quit();
                    break;
                }

            }

        }

        public static double area_triangle(int base, int height) {

            Scanner keyboard = new Scanner(System.in);

            System.out.print("Base: ");
            base = keyboard.nextInt();

            System.out.print("Height: ");
            height = keyboard.nextInt();

            System.out.println();

            int A = (base * height) * 2;

            System.out.println("The area is " + A + ".");

            return A;

        }

        public static int area_rectangle(int length, int width) {

            Scanner keyboard = new Scanner(System.in);

            System.out.print("Length: ");
            length = keyboard.nextInt();

            System.out.print("Width: ");
            width = keyboard.nextInt();

            System.out.println();

            int A = length * width;

            System.out.println("The area is " + A + ".");

            return A;
        }

        public static double area_circle(int radius) {

            Scanner keyboard = new Scanner(System.in);

            System.out.print("Radius: ");
            radius = keyboard.nextInt();

            System.out.println();

            double A = Math.PI * radius * radius;

            System.out.println("The area is " + A + ".");

            return A;

        }

        public static String quit() {

            System.out.println("GoodBye");
            return null;

        }

    }
