//import stuff here

//Your code here
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

//Class name does not match the file name
class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;
        double absval;
        double max;
        double min;
        System.out.print("\nEnter first number: ");
        n1 = sc.nextDouble();
        System.out.print("\nEnter second number: ");
        n2 = sc.nextDouble();
        double sum = n1 + n2;
        double difference = n1 - n2;
        double product = n1 * n2;
        double avg = (n1 + n2)/2;
        if (n1 > n2) {
             absval = n1 - n2;
        }
        else {
             absval = n2 - n1;
        }
        if (n1 > n2) {
             max = n1;
             min = n2;
        }
        else {
             max = n2;
             min = n1;
        }
        System.out.println("Original numbers are " + n1 + " and " + n2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Average = " + avg);
        System.out.println("Absolute value = " + absval);
        System.out.println("Maximum = " + max);
        System.out.print("Minimum = " + min);



        }
}
//Paste console output below:
/*
Enter first number: 13

Enter second number: 20
Original numbers are 13.0 and 20.0
Sum = 33.0
Difference = -7.0
Product = 260.0
Average = 16.5
Absolute value = 7.0
Maximum = 20.0
Minimum = 13.0

*/
