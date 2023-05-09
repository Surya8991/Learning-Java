import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Rock Paper Scrissor Game 🤩");
        System.out.println("0. Rock\n 1. Paper \n 2. Scissors");
        System.out.println("Please enter No. of rounds:");
        int rounds = scanner.nextInt();
        int user_score = 0;
        int comp_score = 0;
        // Game Logic
        for (int i = 0; i < rounds; i++) {
            System.out.println("Please enter your choice");
            int user_Choice = scanner.nextInt();
            int comp_Choice = random.nextInt(3);
            if (user_Choice > 2) {
                System.out.println("Please enter a valid choice");
            } else if (user_Choice == comp_Choice) {
                System.out.println("It's a tie");
            } else if (user_Choice == 1 && comp_Choice == 0) {
                System.out.println("User win This Round Because Paper Wins over Rock" + " User: " + user_Choice + " Comp: "+ comp_Choice);
                user_score++;
            } else if (user_Choice == 0 && comp_Choice == 2) {
                System.out.println("User win This Round Because Rock Wins over Scissors" + " User: " + user_Choice + " Comp: "+ comp_Choice);
                user_score++;
            } else if (user_Choice == 2 && comp_Choice == 1) {
                System.out.println("User win This Round Because Scissors Wins over Paper" + " User: " + user_Choice + " Comp: "+ comp_Choice);
                user_score++;
            } else if (user_Choice == 0 && comp_Choice == 1) {
                System.out.println("Comp win This Round Because Paper Wins over Rock" + " User: " + user_Choice + " Comp: "+ comp_Choice);
                comp_score++;
            } else if (user_Choice == 2 && comp_Choice == 0) {
                System.out.println("Comp win This Round Because Rock Wins over Scissors" + " User: " + user_Choice + " Comp: "+ comp_Choice);
                comp_score++;
            } else if (user_Choice == 1 && comp_Choice == 2) {
                System.out.println("Comp win This Round Because Scissors Wins over Paper" + " User: " + user_Choice + " Comp: "+ comp_Choice);
                comp_score++;
            }
        }
        System.out.println("Game Ended " + " User Score: " + user_score + " Comp Score: " + comp_score);
        if (comp_score > user_score) {
            System.out.println("Computer Wins in the Game");
        } else if (comp_score < user_score) {
            System.out.println("User Wins in the Game");
        } else {
            System.out.println("Draw");
        }
        scanner.close();
    }
}