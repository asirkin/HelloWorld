import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //These scan and store user input for size and range of arrays
        System.out.println("What size array would you prefer? ");
        int x = input.nextInt();
        System.out.println("What range of numbers would you prefer? ");
        int y = input.nextInt();
        int[] array = new int[x]; //initialize array of size user specifies
        Random rand = new Random(); //Create random object
        for(int i = 0; i <= x - 1; i++) { //For loop runs for size of array
            int num = rand.nextInt(y) + 1; //Populates array within range of user input
            array[i] = num; //modifies index of 'i' within array
        }
        System.out.println(Arrays.toString(array)); //Use toString method to print entire array
    }

    public static void weather() {
        //This method asks the user for
        Scanner input = new Scanner(System.in);
        System.out.println("How many days?");
        int days = input.nextInt();

    }
}
