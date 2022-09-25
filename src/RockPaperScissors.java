import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        while (true) {
            String[] rps = {"r", "p", "s"};
            String computer = rps[new Random().nextInt(rps.length)];
            Scanner scanner = new Scanner(System.in);
            String player;
            while (true) {
                System.out.println("Choose [r]ock, [p]aper or [s]cissors:");
                player = scanner.nextLine();
                if (player.equals("r") || player.equals("p") || player.equals("s")) {
                    break;
                }
                System.out.println(player + "Invalid Input. Try again...");
            }
            System.out.println("The computer chose " + computer);
            if (player.equals(computer)) {
                System.out.println("The game was a draw");
            } else if (player.equals("r")) {
                if (computer.equals("p")) {
                    System.out.println("You lose!");
                } else if (computer.equals("s")) {
                    System.out.println("You win!");
                }
            } else if (player.equals("s")) {
                if (computer.equals("r")) {
                    System.out.println("You lose!");
                } else if (computer.equals("p")) {
                    System.out.println("You win!");
                }
            } else if (player.equals("p")) {
                if (computer.equals("s")) {
                    System.out.println("You lose!");
                } else if (computer.equals("r")) {
                    System.out.println("You win!");
                }
            }
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")){
                break;
            }
        }
    }
    }

