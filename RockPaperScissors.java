import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String playOrNot = scan.nextLine();


        if (playOrNot.equals("yes")) {
            System.out.println("\nrock – paper – scissors, shoot!");
            String yourChoice = scan.nextLine();
            String computerChoice = computerChoice();
            String results = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, results);
        } else {
            System.out.println("Darn, some other time!");
        }

        scan.close();
    }


    public static String computerChoice() {
        double choice = Math.floor(Math.random() * 3);
        String finChoice = "";
        if (choice == 0) {
            finChoice = "rock";
        }
        if (choice == 1) {
            finChoice = "paper";
        }
        if (choice == 2) {
            finChoice = "scissors";
        }
        return finChoice;
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")
                || yourChoice.equals("paper") && computerChoice.equals("rock")
                || yourChoice.equals("sicssors") && computerChoice.equals("paper")) {
            result = yourChoice + " beats " + computerChoice + ". You Win!";
        }
        if (computerChoice.equals("rock") && yourChoice.equals("scissors")
                || computerChoice.equals("paper") && yourChoice.equals("rock")
                || computerChoice.equals("sicssors") && yourChoice.equals("paper")) {
            result = computerChoice + " beats " + yourChoice + ". You lose!";
        }
        if (computerChoice.equals(yourChoice)) {
            result = "It's a tie.";
        }

        return result;
    }

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }
}
