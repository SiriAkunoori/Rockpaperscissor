import java.util.*;
public class RockpaperScissor{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            String[]  input ={"rock","paper","scissior"};
            while(true){
                System.out.println("enter your choice in ( rock,paper,scissor)");
                String userChoice =scanner.nextLine();
                String computerChoice=input[random.nextInt(3)];
                System.out.println("computer choice:"+computerChoice);
                if (userChoice.equals(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if ((userChoice.equals("rock") && computerChoice.equals("scissor")) ||
                        (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (userChoice.equals("scissor") && computerChoice.equals("paper"))) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }
        }
    }
}
