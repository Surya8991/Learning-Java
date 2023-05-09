import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Add 3 numbers
        int a=5;
        int b=6;
        int c=7;
        int sum=a+b+c;
        System.out.println("The Sum of 3 numbers: "+sum);
//        Pgm to calculate CGPA of 3 subjects
        int sub1=68;
        int sub2=79;
        int sub3=92;
        float cgpa= (float) (((sub1+sub2+sub3)/3)*0.1);
        System.out.println(cgpa);
//        Pgm to greet the user
        System.out.println("Enter Your name");
        String name=sc.nextLine();
        System.out.println("Hello "+name+" have a good day!");
// Pgm to convert Kms to miles
        System.out.println("Enter Km's Value to convert to miles");
        int kmValue=sc.nextInt();
        float res= (float) (kmValue*0.621);
        System.out.println("The converted value of Kms to miles is "+ res);
//  To check if the no. is integer or not
        System.out.println("Enter your number");
        System.out.println(sc.hasNextInt());
    }
}