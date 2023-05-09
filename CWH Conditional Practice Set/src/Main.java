import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("CWH Practice Set 4");
        // Problem 1
        // What will be the output of this program:
        //
        // int a = 10;
        // if (a=11)
        // System.out.println(“I am 11”);
        // else
        // System.out.println(“I am not 11”);
        // Sol

        // int a = 10;
        // if (a == 11)
        // System.out.println("I am 11");
        // else
        // System.out.println("I am not 11");

        // Problem 2
        // Write a program to find out whether a student is pass or fail; if it requires
        // a total of 40% and at least 33% in each subject to pass. Assume 3 subjects
        // and take marks as input from the user.
        // Solution

        // System.out.println("Enter Eng Marks");
        // int Eng = sc.nextInt();
        // System.out.println("Enter Math Marks");
        // int Math = sc.nextInt();
        // System.out.println("Enter Science Marks");
        // int Science = sc.nextInt();
        // float result = (Eng + Math + Science) / 3;
        // if (result > 40 && Eng > 33 && Science > 33 && Math > 33) {
        // System.out.println("Pass");
        // } else {
        // System.out.println("Fail");
        // }

        // Problem 3
        // Calculate income tax paid by an employee to the government as per the slabs
        // mentioned below:
        // Income Slab Tax
        // 2.5L – 5.0L 5%
        // 5.0L – 10.0L 20%
        // Above 10.0L 30%
        // Note that there is not tax below 2.5L. Take the input amount as input from
        // the user.
        // Solution

        // System.out.println("Enter Salary in lakhs");
        // float Salary=sc.nextFloat();
        // if(Salary>10){
        // System.out.println("Tax Index is 30% for the Salary: "+Salary+" lakhs");
        // }
        // else if(Salary>=5 && Salary<=10){
        // System.out.println("Tax Index is 20% for the Salary: "+Salary+" lakhs");
        // }
        // else if(Salary>=2.5 && Salary<=5){
        // System.out.println("Tax Index is 5% for the Salary: "+Salary+" lakhs");
        // }
        // else{
        // System.out.println("No Tax for the Salary: "+Salary+" lakhs");
        // }

        // Write a Java program to find out the day of the week given the number [1 for
        // Monday, 2 for Tuesday … and so on!]
        // Solution

        // System.out.println("Enter the day of the week");
        // int day = sc.nextInt();
        // switch(day){
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Invalid day");
        // break;
        // }

        // Problem 5 Write a Java program to find whether a year entered by the user is
        // a leap year or not.
        // Solution

        // System.out.println("Enter year: ");
        // int year = sc.nextInt();
        // if (year % 4 == 0 && year % 100!= 0 || year % 400 == 0) {
        // System.out.println("Leap year");
        // } else {
        // System.out.println("Not a leap year");
        // }

        // Question 6:Write a program to find out the type of website from the URL:
        // .com – commercial website
        // .org – organization website
        // .in – Indian website

        System.out.println("Enter Website");
        String website = sc.next();
        if (website.endsWith(".com"))
            System.out.println("This is a Commercial Website: " + website);
        else if (website.endsWith(".org"))
            System.out.println("This is a Organization Website: " + website);
        else if (website.endsWith(".in"))
            System.out.println("This is a Indian Website: " + website);
        else
            System.out.println("Invalid Website: " + website);

        sc.close();
    }
}