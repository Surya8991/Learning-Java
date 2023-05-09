import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        CWH Practice test 2
//        Result of float a=7/4 * 9/2
        float a=7/4.0f * 9/2.0f;
        System.out.println(a);
//        Encrypt a string with +8 and decrypt a string with -8
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
//        Pgm to compare the user input is greater than the initial input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println(num>8);
//        Write the following expression in a java program
//        (v^2-u^2)/(2*a*s)
        System.out.println(7*49/7+35/7);
    }
}