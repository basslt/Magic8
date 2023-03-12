import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random userQuestion = new Random();
        String[] answers = {"Without a doubt", "Yes, Definitely", "Most likely", "Outlook Good", "Outlook Uncertain",
                "All signs point to yes", "Ask Again Later", "Don't Count on it", "Outlook not Good", "Very Doubtful","I'm Unsure"};

        System.out.println("Welcome to the Magic Eight Ball!");
        System.out.println("Please ask a yes or no question and I'll give you an answer");
        System.out.println("Type Quit to exit");

        while (true) {
            System.out.print("Ask A question: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.println(answers[userQuestion.nextInt(answers.length)]);

        }

        scanner.close();
    }




    }







