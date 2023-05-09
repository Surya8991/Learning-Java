import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n>0){
System.out.println("Number is Greater than 0");
    }
else {
System.out.println("Number is less than 0");
}
sc.close();
}
}