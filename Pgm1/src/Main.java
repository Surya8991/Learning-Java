import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Eng Marks");
        int mark1 = sc.nextInt();
        System.out.println("Enter your Maths Marks");
        int mark2 = sc.nextInt();

        System.out.println("Enter your Hindi Marks");
        int mark3 = sc.nextInt();
        System.out.println("Enter your Science Marks");
        int mark4 = sc.nextInt();
        System.out.println("Enter your Social Marks");
        int mark5=sc.nextInt();
        int total=(mark1+mark2+mark3+mark4+mark5)/5;
        System.out.println("Percentage: "+total+"%");
    }
}