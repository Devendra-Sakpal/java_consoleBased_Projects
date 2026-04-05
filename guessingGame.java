import java.util.Random;
import java.util.Scanner;

public class guessingGame{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Random  rd= new Random();

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I have picked a number between 1 to 100");
        System.out.println("can you guess what is it?");
        System.out.println("(If you guess correct you won a game)");

        int target = rd.nextInt(100) + 1;
        int attempt=0;
        int guess=0;

        while (true) {
            System.out.println("Enter your guess:");
            guess = sc.nextInt();
            attempt++;

            if(guess<target){
                System.out.println("Too low! try again");
            } else if(guess>target){
                System.out.println("Too high! try again");
            }else{
                System.out.println("Congratulation! you guessed the correct");
                System.out.println("In"+" "+attempt+" attempts");
               
                break;
            }
            
        }
             System.out.println("thank you ! for playing game");

    }
}
