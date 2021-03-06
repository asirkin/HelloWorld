//This program uses user input to calculate the average temperature for n number of days. Also Identifies how many of those days exceed the average
import java.util.*;
public class WeatherAnalysis {
    public static void main(String[] args) {
        input();
    }
    public static void input() {
        Scanner input = new Scanner(System.in); //This scanner will take in all user input and later store them in variables
        System.out.print("How many days' temperatures? ");
        int days = input.nextInt();
        int[] data = new int[days]; //Initialize an array of the size of the int 'days'
        int csum = 0; //Initialize cumulative sum variable
        for(int i = 1; i <= days; i++) {
            System.out.print("Day " + i + "'s " + "high temp: ");
            data[i - 1] = input.nextInt(); //Store a given day's data in the index of that day - 1 in the array
            csum += data[i - 1]; //Add the value of each index to the cumulative sum
        }
        traverse(days, csum, data);
    }
    public static void traverse (int days, int csum, int[] data) {
        double eday = days;
        double avg = csum / eday;
        avg = (Math.round(avg * 10.0)) / 10.0; //Round the average to the tenths place
        System.out.println("Average temp = " + avg);
        int daysAbove = 0; //Second cumulative sum variable to store number of days above average
        for(int i = 0; i <= days - 1; i++) {
            if(data[i] > avg) {
                daysAbove++;
            }
        }
        sort(daysAbove, data);
    }
    public static void sort(int daysAbove, int[] data) {
        System.out.println(daysAbove + " days were above average.");
        System.out.println("\nTemperatures: " + Arrays.toString(data)); //Print the entire populated array
        Arrays.sort(data); //Sorts array in least to greatest order
        int max = data[data.length - 1], max1 = data[data.length - 2], min = data[0], min1 = data[1]; //declares int variables for max and min values
        System.out.println("Two coldest days: " + min + ", " + min1);
        System.out.println("Two hottest days: " + max + ", " + max1);
    }
}