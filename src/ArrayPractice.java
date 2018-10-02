import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //These scan and store user input for size and range of arrays
        System.out.println("What size array would you prefer? ");
        int x = input.nextInt();
        System.out.println("What range of numbers would you prefer? ");
        int y = input.nextInt();
        int[] array = new int[x]; //initialize array of size user specifies
        for(int i = 0; i <= array.length - 1; i++) { //For loop runs for size of array
            double num1 = Math.random() * (y - 0); //Populates array within range of user input
            int num = (int)(num1);
            array[i] = num; //modifies index of 'i' within array
        }
        System.out.println(Arrays.toString(array)); //Use toString method to print entire array
    }
}
