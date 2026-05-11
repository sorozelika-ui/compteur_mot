import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
        //  File Scanner
        File file = new File("expensives.rtf");
        Scanner fileScanner = new Scanner(file);

        int totalMots = 0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();

            // séparer la ligne avec l'espace
            String[] mots = line.split(" ");

            // compter les mots
            int compteur = mots.length;
        }
    }
    }
}