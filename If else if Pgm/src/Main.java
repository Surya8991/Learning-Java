import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter %");
        int n=sc.nextInt();
        if(n>60){
            System.out.println("Congratulations 🤩 You Passed in First Class and Your % is : "+n);
        }
        else if(n<60 && n>40){
            System.out.println("Congratulations 😆 You Passed in Second Class and Your % is : "+n);
        }
        else{
            System.out.println("Study Hard for Exams next Time , You have Failed 😌: Your % is : "+n);
        }
    }
}