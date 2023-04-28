/*
 TOPICS COVERED
 1) Arrays basics
 2) Creating arrays of objects of user defined classes 
 3) Passing arrays as function arguments
 4) Returning arrays from functions
 5) Taking user input using Scanner class object
 */



import java.util.Scanner;

class Student
{
    int roll_no;
    String name;
    Student(int roll_no,String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello, World!");
        
        /*TOPICS
        1) Arrays
        2) Scanner object
        */
        /* Arrays */
        /*The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types).*/
        int n = 20;
        // declaring integer array
        int[] intArray = new int[n];
        for(int i=0;i<n;i++)
            intArray[i]=i;
        // printing above array
        for (int i = 0; i < intArray.length; i++)
            System.out.println("Element at index " + i + " : " + intArray[i]);

        // declaring string array
        String[] StringArray = new String[n];
        for(int i=0;i<n;i++)
        StringArray[i]="pavan";
        // printing above array
        for (int i = 0; i < StringArray.length; i++)
            System.out.println("Element at index " + i + " : " + StringArray[i]);
        System.out.println("--------------------------");
        
        // declaring double array
        double[] doubleArray = new double[n];
        for(int i=0;i<n;i++)
        {
            doubleArray[i]=0.0;
        }
        // printing above array
        for (int i = 0; i < doubleArray.length; i++)
            System.out.println("Element at index " + i + " : " + doubleArray[i]);
        System.out.println("--------------------------");

        // declaring float array
        float[] floatArray = new float[n];
        for(int i=0;i<n;i++)
        {
            floatArray[i]=0.000f;
        }
        // printing above array
        for (int i = 0; i < floatArray.length; i++)
            System.out.println("Element at index " + i + " : " + floatArray[i]);
        System.out.println("--------------------------");

        // creating an array of student objects
        Student[] students = new Student[5];
        students[0] = new Student(1,"pavan");
        students[1] = new Student(2,"havish");
        students[2] = new Student(3,"pradeep");
        students[3] = new Student(4,"venkat");
        students[4] = new Student(5,"rajesh");
        for(int i=0;i<students.length;i++)
        System.out.println(students[i].roll_no + ":" + students[i].name);
        System.out.println("--------------------------");

        // multi-dimensional array
        int[][] MultiIntArray = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            MultiIntArray[i][j]=i+j;
        }
        // printing the above array
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            System.out.println(MultiIntArray[i][j]);
        }
        System.out.println("--------------------------");

        // passing arrays as arguments to methods
        sum(intArray); // sum is defined as a function below
        System.out.println("--------------------------");

        // returning arrays from methods
        int[] array = ReturnArray();
        // print the above array returned from the function
        for(int i=0;i<array.length;i++)
        System.out.println(array[i]);
        System.out.println("--------------------------");

        /* Taking User input using scanner object */
        System.out.println("Enter name , age and salary:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        double salary = input.nextDouble();
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("salary:" + salary);
        //reading a character from the console
        System.out.println("Enter a character:");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character is" + ch);
        /*
            nextBoolean()	Reads a boolean value from the user
            nextByte()	Reads a byte value from the user
            nextDouble()	Reads a double value from the user
            nextFloat()	Reads a float value from the user
            nextInt()	Reads a int value from the user
            nextLine()	Reads a String value from the user
            nextLong()	Reads a long value from the user
            nextShort()	Reads a short value from the user
        */
    }

    public static void sum(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        sum = sum + arr[i];
        System.out.println("sum:"+sum);
    }

    public static int[] ReturnArray()
    {
        int[] array = new int[2];
        array[0] = 0;
        array[1]=1;
        return array;
    }

}
