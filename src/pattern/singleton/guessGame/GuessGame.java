package pattern.singleton.guessGame;

import java.util.Random;
import java.util.Scanner;

//mozna rowniez utworzyc jako enum
public class GuessGame {

    private static GuessGame instance;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int score = 0;

    //prywatny konstruktor!
    private GuessGame() {
    }

    public void play() {
        for (int i = 0;  i < 10; i++) {
            int randomNumber = random.nextInt(9);
            System.out.println("Podaj cyfre od 0 do 9: ");
            int guessNumber = scanner.nextInt();

            if (randomNumber == guessNumber) {
                System.out.println("Trafiona!");
                score++;
            }
            else {
                System.out.println("Poprawna liczba to: " + randomNumber);
            }
        }

        System.out.println("Twój wynink to: " + getScore());
    }

    public static GuessGame getInstance() {
        if(instance==null) {

            //zabezpiecza przed wielowatkowoscia
            synchronized (GuessGame.class) {
                if(instance==null) {
                    instance = new GuessGame();
                }
            }
        }
        return instance;
    }

    //pomaga podczas serializacji
    public Object readResolve() {
        return getInstance();
    }

    public int getScore() {
        return score;
    }
}
