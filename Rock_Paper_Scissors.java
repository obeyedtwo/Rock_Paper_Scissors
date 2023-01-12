import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] options = {"rock", "paper", "scissors"};
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        while (true) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = sc.nextLine();
            int computerChoice = (int)(Math.random() * 3);
            System.out.println("Computer chose " + options[computerChoice] + ".");
            
            if (userChoice.equals(options[computerChoice])) {
                System.out.println("It's a tie!");
            } else if (userChoice.equals("rock") && options[computerChoice].equals("scissors")
                    || userChoice.equals("paper") && options[computerChoice].equals("rock")
                    || userChoice.equals("scissors") && options[computerChoice].equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
    }
}
