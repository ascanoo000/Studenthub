import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class homework12_30 {
    public static void main(String[] args) {
        int[] letterCount = new int[52];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String filename = input.nextLine();

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file); 
            while (fileScanner.hasNextLine()) { 
                String line = fileScanner.nextLine();
                for (char c : line.toCharArray()) {
                    if (c >= 'A' && c <= 'Z') { 
                        letterCount[c - 'A']++; 
                    } else if (c >= 'a' && c <= 'z') { 
                        letterCount[c - 'a' + 26]++; 
                    }
                }
            }
            fileScanner.close();

            for (int i = 0; i < 26; i++) {
                if (letterCount[i] > 0) {
                    System.out.println("Number of " + (char) ('A' + i) + "'s: " + letterCount[i]);
                }
            }
            for (int i = 0; i < 26; i++) {
                if (letterCount[i + 26] > 0) { 
                    System.out.println("Number of " + (char) ('a' + i) + "'s: " + letterCount[i + 26]);
                }
            }

        } catch (FileNotFoundException e) { 
            System.out.println("File not found: " + filename); 
        }

        input.close();
    }
}