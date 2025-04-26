import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        
        int[] dom = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 12: ");
        
        try {
            int monthNumber = scanner.nextInt();
            
            String month = months[monthNumber - 1];
            int days = dom[monthNumber - 1];
            
            System.out.println(month + " has " + days + " days.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number, please enter a number between 1 and 12.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
