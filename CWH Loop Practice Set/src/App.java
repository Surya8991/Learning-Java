import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("CWH Loop Practice Set");
        Scanner sc = new Scanner(System.in);
        // Pgm1 Write a program to print the following pattern :
        // ****
        // ***
        // **
        // *

        // int n = 4;
        // for (int i = n; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("\n");
        // }

        // Question 2: Write a program to sum even numbers with number using a for loop.

        // int sum = 0;
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // for(int i=0;i<n;i++){
        // if(i%2==0){
        // sum+=i;
        // }
        // }
        // System.out.println("The sum is "+sum);
        // sc.close();

        // Question 3: Write a program to print the multiplication table of a given
        // number n.

        // System.out.println("Enter the number for the multiplication table");
        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // {
        // System.out.println(n+" * "+i+" = "+(n*i));
        // }
        // }

        // Question 4: Write a program to print a multiplication table of 10 in reverse
        // order.

        // System.out.println("Enter the number for the multiplication table to show in
        // reverse order");
        // int n = sc.nextInt();
        // for (int i = 10; i >= 1; i--) {
        // System.out.println(n + " * " + i + " = " + (n * i));
        // }

        // Question 5: Write a program to find the factorial of a given number using for
        // loops.
        // System.out.println("Enter the number for the factorial");
        // int n = sc.nextInt();
        // int fact=1;
        // for(int i = 0; i < n; i++)
        // {
        // fact*=(n-i);
        // }
        // System.out.println("The factorial of "+n+" is "+fact);

        // Question 6: Write a program to find the factorial of a given number using
        // while loops.

        // System.out.println("Enter the no.");
        // int n = sc.nextInt();
        // int i=0;
        // int fact=1;
        // while(i<n)
        // {
        // fact*=(n-i);
        // i++;
        // }
        // System.out.println("The factorial of "+n+" is "+fact);

        // Question 9: Write a program to calculate the sum of the numbers occurring in
        // the multiplication table of 8.
        System.out.println("Enter the number for the multiplication table");
        int n = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += (n * i);
        }
        System.out.println("The Sum of the numbers in the multiplication table is " + sum);

        sc.close();
    }

}
