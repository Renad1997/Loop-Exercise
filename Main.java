import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*1.Write a program that prints the numbers from 1 to 100 such that:
        //If the number is a multiple of 3, you need to print "Fizz" instead of that
        //number.
        //If the number is a multiple of 5, you need to print "Buzz" instead of that
        //number.
        //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
        //instead of that number.*/
        for (int i = 1; i <= 100; i++) {
            System.out.println("Enter the number: ");
            int number = input.nextInt();
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            }
        }
        /*2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse
string: xof nworb kciuq ehT*/
        String word = "The quick brown fox";
        String z = "";
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            z = ch + z;
        }
        System.out.println("Reverse string: " + z);
        /*3.Write a program to find the factorial value of any number entered
through the keyboard.*/
        System.out.println("Enter number:");
        int num = input.nextInt();
        int i = num;
        int factorial = 1;
        if (num == 0) {
            System.out.println("Error");
        }
        while (num / i != num) {
            factorial = factorial * i;
            i--;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
        /*4.Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another. (Do not use Java
built-in method)*/
        System.out.println("Enter number1:");
        int number1 = input.nextInt();
        System.out.println("Enter number2:");
        int number2 = input.nextInt();
        int power = 1;
        while (number2 != 0) {
            power = power * number1;
            number2--;
        }
        System.out.println(power);
     /*5.Write a program that reads a set of integers, and then prints the sum of
the even and odd integers.*/
        System.out.println("Enter the number1:");
        number1 = input.nextInt();
        System.out.println("Enter the number2:");
        number2 = input.nextInt();
        while (number1 <= number2) {
            if ((number1 % 2) == 0)
                System.out.println(number1 + "even");
            else
                System.out.println(number1 + "odd");
            number1++;
        }
        System.out.println(number1 + number2);
        /*6.Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number.*/
        System.out.println("Enter Prime number:");
        int prime = input.nextInt();
        for (int j = 2; j <= prime / 2; j++) {
            if (prime <= 1) {
                System.out.println(prime + "not prime");
            } else {
                System.out.println(prime);
            }
        }
        /*7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
another for loop to print the days (Days 1 -7) for each week.
Expected Output:
Week 1
Day1
Day2
Day3
Day4
Day5
Day6
Day7
Week 2
Day1
Day2*/
        int weeks = 4;
        int days = 7;
        for (int x = 1; x <= weeks; x++) {
            System.out.println("Week: " +x);
            for (int d = 1; d<= days; d++) {
                System.out.println("Day: " +d);
            }
        }
        /*8.Write a program thats check if the word is a palindrome or not. hint: A
string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left.*/
        String name="RAAR";
            if (name.equals(name)) {
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }

    }

