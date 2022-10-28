import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class GuessTheMovie {
    public static void main(String[] args) throws FileNotFoundException {

        boolean guessedAll = false;
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        String selectedMovie = "";
        String movieWithSpace = "";
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (Math.random() < 0.5) {
                selectedMovie = line.replaceAll("\\s", "");
                movieWithSpace = line;
                break;
            }
        }
        //now let's start guessing
        Scanner guesses = new Scanner(System.in);
        int guessWrong = 0;
        String wrongLetters = "";
        System.out.println(selectedMovie);
        char[] dashChar = new char[selectedMovie.length()];
        for (int s=0; s< selectedMovie.length(); s++) {
            dashChar[s] = '_';
        }
        int start = 10;
        if (start <= selectedMovie.length()) {
            start = selectedMovie.length();
        }
        for (int i=start; i>0; i--) {
            System.out.print("Your are guessing:" + String.valueOf(dashChar));
            System.out.println();
            System.out.println("You have guess (" +  guessWrong + ") wrong letters: " + wrongLetters);
            System.out.print("Guess a letter: " );
            String guess = guesses.next();
            if (selectedMovie.contains(guess)) {
                int idBegin = selectedMovie.indexOf(guess);
                dashChar[idBegin] = guess.charAt(0);
                for (int j = idBegin; j < selectedMovie.length(); j ++) {
                    if (guess.charAt(0) == selectedMovie.charAt(j)) {
                        dashChar[j] = guess.charAt(0);
                    }
                }
            }
            else {
                guessWrong+=1;
                wrongLetters = wrongLetters + " " + guess;
            }
            if(String.valueOf(dashChar).equals(selectedMovie)) {
                System.out.println("You win!");
                System.out.println("You have guessed " + "'" + movieWithSpace + "'" + " correctly.");
                break;
            }
        }


    }
}
