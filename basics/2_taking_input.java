/*
Reading input from console
1) Create a Scanner object 
- Scanner input = new Scanner(System.in);

2) Use the method nextDouble() to obtain a double value. See below example
- System.out.print("Enter a double value: ");
- Scanner input = new Scanner(System.in);
- double d = input.nextDouble(); 

3) Defining constants : Constants in java are defined by word final.We cannot change values assigned to these constants.
Syntax :- final <datatype> <name> = <value>. See below example
- final double PI = 3.14159;
- final int SIZE = 3;

*/

import java.util.Scanner;

public class App 
{ 
  public static void main(String[] args)
  {
    // defining constant
    final double PI = 3.14159;
    
    // taking input from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a double value: ");
    double d = input.nextDouble();
    System.out.println("You entered:" + d);
    // we use the same scanner object to take the second input
    System.out.println("Enter an integer value: ");
    int i = input.nextInt();
    System.out.println("You entered:" + i);
    
    //reading a string from the console
    System.out.println("Enter three words seperated by spaces:");
    String s1 = input.next();
    String s2 = input.next();
    String s3 = input.next();
    System.out.println("s1 is" + s1);
    System.out.println("s2 is" + s2);
    System.out.println("s3 is" + s3);
    
    //reading a character from the console
    System.out.println("Enter a character:");
    String s = input.nextLine();
    char ch = s.charAt(0);
    System.out.println("The character is" + ch);
  }
}

