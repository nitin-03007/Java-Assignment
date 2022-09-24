import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
class Game {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int user_input;
    int guess;
    int rand_no;
    int play_again;

    public Game() {
        rand_no = random.nextInt(1, 100);
    }

    public void setUser_input() {
        System.out.println("Enter Your Guess Between 1 to 100 : ");
        user_input = sc.nextInt();
    }
    public void score(){
        System.out.println("YOU GUESSED IT RIGHT!! ");
        System.out.println("You Did it in " + guess + " Guesses");
        System.out.println("The Number is: "+rand_no);
    }
    public void play_again(){
        System.out.println("Wanna Play Again!! \n If Yes then Press '1' or Any Other Key to Exit");
        play_again=sc.nextInt();
        if (play_again==1){
            isCorrectNumber();
        }
        else {
            System.out.println("Thanks for Playing!! See You Again");
        }
    }

    public void isCorrectNumber() {
        setUser_input();
        guess=0;
        while (user_input != rand_no) {
            if (user_input > rand_no) {
                System.out.println("Your Guess is High, Try to Guess Lower Number");
            } else if (user_input < rand_no) {
                System.out.println("Your Guess is Low, Try to Guess Higher Number");
            } else {
                System.out.println("Invalid Input");
            }
            guess++;
            setUser_input();
        }
        score();
        play_again();

    }
}

public class Guess_Number {
    public static void main(String[] args) {
        Game player=new Game();
        player.isCorrectNumber();
    }
}
