import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class FlashcardApp {
    private static Map<Integer, Flashcard> flashcards = new HashMap<>();

    public static void main(String[] args) {
        flashcards.put(0, new Flashcard("What are the components that make up the signature of a method?", "Put your answer here"));
        flashcards.put(1, new Flashcard("What is method overloading?", "Put your answer here"));
        flashcards.put(2, new Flashcard("What is method overriding?", "Put your answer here"));
        flashcards.put(3, new Flashcard("What is the difference between a class and an object?", "Put your answer here"));
        flashcards.put(4, new Flashcard("What are the pillars of OOP programming?", "Put your answer here"));

        System.out.println("\n=============================================================================================");
        System.out.println("========================================Welcome to===========================================\n");
        delay(500);
        System.out.println("/$$$$$$$$ /$$                     /$$                                           /$$");
        delay(500);
        System.out.println("| $$_____/| $$                    | $$                                          | $$");
        delay(500);
        System.out.println("| $$      | $$  /$$$$$$   /$$$$$$$| $$$$$$$   /$$$$$$$  /$$$$$$   /$$$$$$   /$$$$$$$  /$$$$$$$");
        delay(500);
        System.out.println("| $$$$$   | $$ |____  $$ /$$_____/| $$__  $$ /$$_____/ |____  $$ /$$__  $$ /$$__  $$ /$$_____/");
        delay(500);
        System.out.println("| $$__/   | $$  /$$$$$$$|  $$$$$$ | $$  \\ $$| $$        /$$$$$$$| $$  \\__/| $$  | $$|  $$$$$$ ");
        delay(500);
        System.out.println("| $$      | $$ /$$__  $$ \\____  $$| $$  | $$| $$       /$$__  $$| $$      | $$  | $$ \\____  $$");
        delay(500);
        System.out.println("| $$      | $$|  $$$$$$$ /$$$$$$$/| $$  | $$|  $$$$$$$|  $$$$$$$| $$      |  $$$$$$$ /$$$$$$$/");
        delay(500);
        System.out.println("|__/      |__/ \\_______/|_______/ |__/  |__/ \\_______/ \\_______/|__/       \\_______/|_______/");

        Scanner userInput = new Scanner(System.in);
        boolean running = true;

        System.out.print("\nPress enter to start learning! >>> ");
        userInput.nextLine();
        Random random = new Random();

        while (running) {
            int randomKey = random.nextInt(flashcards.size());

            printQuestion(randomKey);

            System.out.print("\nPress enter to continue >>> ");
            userInput.nextLine();

            printAnswer(randomKey);

            System.out.print("\nPress enter to continue or 0 to exit >>> ");

            if (userInput.nextLine().equals("0")) {
                running = false;
            }
        }
    }

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void printQuestion(int key) {
        System.out.println("\n" + flashcards.get(key).getQuestion());
    }

    public static void printAnswer(int key) {
        System.out.println("\n" + flashcards.get(key).getAnswer());
    }
}