//This program works to randomly pair up elements of an array without replacement
import java.util.*;
public class RandomHatV2 {
    public static void main(String[] args) {
        userInput();
    }

    public static void userInput() {
        Scanner ui = new Scanner(System.in);
        System.out.println("How many teams are you scrambling? ");
        int quantity = ui.nextInt();
        if (quantity % 2 == 1) { //checks that the quantity of teams entered are oddly divisible
            do {
                System.out.println("Please enter an even number: "); //This block will re-run until the quantity entered is even
                quantity = ui.nextInt();
            } while (quantity % 2 == 1);
        }
        int[] teams = new int[quantity]; //Creates the array of specified size "quantity"
        permutation(teams, quantity); //creates a permutation of teh elements of array teams
    }

    public static void permutation(int[] teams, int quantity) {
        int count = 0; //helps to track which number element of the array is being accessed
        for (int i = 0; i < teams.length; i++) {
            int random = (int) (Math.random() * quantity);
            if (teams[random] == 0) { //Tests whether or not the element of the array has been accessed
                count++;
                if (count % 2 == 1) {
                    System.out.print("Team " + (random + 1) + " with "); //prints if it is an odd index of the array
                } else {
                    System.out.print("Team " + (random + 1) + "\n"); //prints if it is an even index of the array
                }
                teams[random] = 1; //modifies the value of the currently accessed element to mark it as having been accessed so it is not accessed a second time
            } else {
                do {
                    random = (int) (Math.random() * quantity);
                } while (teams[random] == 1);
                count++;
                if (count % 2 == 1) {
                    System.out.print("Team " + (random + 1) + " with ");
                } else {
                    System.out.print("Team " + (random + 1) + "\n");
                }
                teams[random] = 1;
            }
        }
    }
}