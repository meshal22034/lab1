package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
two numbers , takes two numbers as input
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1");
        int number1 = sc.nextInt();
        System.out.println("enter number2");
        int number2 = sc.nextInt();
        System.out.println(number1 + "+" + number2 + "= " + (number1 + number2));
        System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
        System.out.println(number1 + "x" + number2 + "=" + (number1 * number2));
        System.out.println(number1 + "%" + number2 + "=" + (number1 % number2));
        /*
        Write a Java program that takes a number as input and prints its multiplication table up to
10.
         */
        System.out.println("enter umber");
        int number = sc.nextInt();
        int mult = 1;
        for (int i = 1; i <= 10; i++) {
            mult = number * i;
            System.out.println(mult);
        }

        /*
        Write a Java program to print the area and perimeter of a circle
         */
        System.out.println("enter rad");
        double rad = sc.nextInt();
        double area = 3.14 * rad * rad;
        double per = 2 * 3.14 * rad;
        System.out.println(area);
        System.out.println(per);
        /*
       Java program to find out the average of a set of integers
         */
        int cun = 0;
        double ave;
        for (int i = 1; i <= 6; i++) {
            System.out.println("iNumber");
            int iNumber = sc.nextInt();
            cun += iNumber;
        }
        ave = cun / 6;
        System.out.println(ave);

          /*
         Write a Java program that accepts three integers as input, adds the first two integers
together, and then determines whether the sum is equal to the third integer.
           */
        System.out.println("enter fIN ");
        int fIN = sc.nextInt();
        System.out.println("enter sIN");
        int sIN = sc.nextInt();
        System.out.println("enter tIN");
        int tIN = sc.nextInt();
        int sum = fIN + sIN;
        if (sum == tIN) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
      /*
         Write a Java program to reverse a word.
       */
        System.out.println("enter word");
        String w = sc.nextLine();
        for (int i = w.length() - 1; i >= 0; i--) {
            System.out.print(w.charAt(i));
        }
        /*
        Java program to check whether the given number is even or odd
         */
        System.out.println("plese enter numb");
        int numb = sc.nextInt();
        if (numb % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
       /*
       Java program to convert the temperature in Centigrade to Fahrenheit

        */
        System.out.println("enter tC");
        float tC = sc.nextFloat();
        double fahr = (tC * 1.8) + 32;
        System.out.println(fahr);
        /*
        Write a Java program that takes a string and a number from the user,then prints the
character in the given index.
         */

        System.out.println("enter stri");
        String stri = sc.nextLine();
        System.out.println("enter ninde");
        int ninde = sc.nextInt();
        char letter = stri.charAt(ninde);
        System.out.println(letter);
    /*
    Write a Java program to print the area and perimeter of a rectangle.
     */
        System.out.println("enter width");
        float width = sc.nextFloat();
        System.out.println("enter hight");
        float height = sc.nextFloat();
        double area1 = width * height;
        double perimeter = 2 * (width + height);
        System.out.println(area1);
        System.out.println(perimeter);
        /*
        Write a Java program to compare two numbers.
         */
        System.out.println("enter firstNumber");
        int firstNumber = sc.nextInt();
        System.out.println("enter sNumber");
        int sNumber = sc.nextInt();
        if (firstNumber != sNumber) {
            System.out.println(firstNumber + " != " + sNumber);
        }
        if (firstNumber < sNumber) {
            System.out.println(firstNumber + " < " + sNumber);
        }

        if (firstNumber <= sNumber) {
            System.out.println(firstNumber + " <= " + sNumber);
        }
        /*
        Write a Java program to convert seconds to hours, minutes and seconds
         */
        System.out.println("Enter Number for Seconds:");
        int seconds = sc.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(hours + ":" + minutes + ":" + remainingSeconds);
        /*
        Write a Java program that accepts four integers from the user and prints equal if all
four are equal, and not equal otherwise
         */
        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Three Number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter Fourth Number: ");
        int num4 = sc.nextInt();
        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("All four Number are equal..");
        } else {
            System.out.println("All four Number are not equal...");
        }
         /*
         Write a Java program that reads an integer and check whether it is negative, zero, or
positive.
          */
        System.out.println("Enter Of Number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num == 0) {
            System.out.println("Number is Zero");
        } else {
            System.out.println("Number is negative");
        }
      /*
      Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered  (End loop use -1 ,
Don’t count -1)
       */
        int numberPositive = 0;
        int numberNegative = 0;
        int zero = 0;

        for (int i = 1; i <= 100; i++) {

            System.out.print("Enter number: ");
                int numm =sc.nextInt();
                if (numm == -1) {
                    break;
                }
                if (numm > 0) {
                    numberPositive++;
                } else if (numm < 0) {
                    numberNegative++;
                } else {
                    zero++;
                }
            }
            System.out.println("Positive: " + numberPositive);
            System.out.println("Negative: " + numberNegative);
            System.out.println("Zero: " + zero);
            /*
            Write a program that prompts the user to input an integer and then outputs the
number with the digits reversed
             */
        System.out.print("Enter a number: ");
        String nam= sc.next();
        for (int i = 0; i < nam.length(); i++) {
            if (nam.charAt(i) < '0' || nam.charAt(i) > '9') {
                throw new NumberFormatException();
            }
        }
        String reverse = "";
        for (int i = nam.length() - 1; i >= 0; i--) {
            reverse = reverse + nam.charAt(i);
        }
        System.out.println( reverse);
        /*
Write a program to enter the numbers till the user wants and at the end the
program should display the largest and smallest numbers entered
         */
        int largNumber = 0;
        int smallNumber = 0;
        for (int i = 0; i < 100; i++) {
            System.out.print("Enter numberr: ");
            int numberr = sc.nextInt();
            if (numberr == -1) {
                break;
            }
            if (i == 0) {
                largNumber = numberr;
                smallNumber = numberr;
            }
            if (numberr > largNumber) {
                largNumber = numberr;
            }
            if (numberr < smallNumber) {
                smallNumber = numberr;
            }
        }
        System.out.println( largNumber);
        System.out.println( smallNumber);
        /*
        Determine and print the number of times the character ‘a’ appears in the input
entered by the user.
         */
        System.out.print("enter num0 ");
        int num0 = sc.nextInt();
        int largest = num0;
        int smallest = num0;
        System.out.print("do u want (1 = Yes, 0 = No): ");
        int choice = sc.nextInt();
        while (choice == 1) {
            System.out.print("enter num0");
            num0 = sc.nextInt();
            if (num0 > largest) {
                largest = num0;
            }
            if (num0 < smallest) {
                smallest = num0;
            }
            System.out.print("do u want (1 = Yes, 0 = No): ");
            choice = sc.nextInt();
        }
        System.out.println(largest);
        System.out.println(smallest);
     }

}