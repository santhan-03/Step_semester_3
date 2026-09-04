import java.util.*;

public class RockPaperScissors {

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove))
            return "Draw";

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0, losses = 0, draws = 0;

        System.out.print("Enter number of rounds: ");
        int n = sc.nextInt();

        String[] player = new String[n];
        String[] computer = new String[n];
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Round " + (i + 1) +
                    " - Enter Rock, Paper or Scissors: ");

            player[i] = sc.next();

            computer[i] = moves[random.nextInt(3)];

            result[i] = playRound(player[i], computer[i]);

            System.out.println("Computer: " + computer[i]);
            System.out.println("Result: " + result[i]);
            System.out.println();

            if (result[i].equals("Player Wins"))
                wins++;
            else if (result[i].equals("Computer Wins"))
                losses++;
            else
                draws++;
        }

        System.out.println("----- Final Summary -----");
        System.out.println("Round\tPlayer\tComputer\tResult");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" +
                    player[i] + "\t" +
                    computer[i] + "\t\t" +
                    result[i]);
        }

        double winPercentage = (wins * 100.0) / n;

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win %: " + winPercentage + "%");

        sc.close();
    }
}