/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 Brandon Powell
 */
/*
Exercise 22 - Comparing Numbers

Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output

Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint

Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges

Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.

 */
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number ");
        String str1 = in.nextLine();
        int number1= Integer.parseInt(str1);

        System.out.print("Enter the second number ");
        String str2 = in.nextLine();
        int number2= Integer.parseInt(str2);

        System.out.print("Enter the Third number ");
        String str3 = in.nextLine();

        int number3= Integer.parseInt(str3);
        int counter1=0,counter2=0,counter3=0;

        do {
            number1--;
            counter1++;
        }while (number1!=0);

        do {
            number2--;
            counter2++;
        }while (number2!=0);

        do {
            number3--;
            counter3++;
        }while (number3!=0);


        if ((counter1>counter3) && (counter1>counter2)){
            System.out.print("The largest number is "+counter1);
        }
        else if ((counter2>counter1) && (counter2>counter3)){
            System.out.print("The largest number is "+counter2);
        }
        else{
            System.out.print("the largest number is "+counter3);
        }


    }
}
