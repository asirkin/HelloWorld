import java.util.*;
public class frequentDigit {
    public static void main(String[] args) {
        int num = 293463743;
        System.out.println(findMode(num));
    }
    public static int findMode(int num) {
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(data);
        int[] digit = new int[10];
        for (int i = 0; i <= digit.length - 1; i++) {
            for (int j = 0; j <= data.length - 1; j++) {
                if (data[j] == i) {
                    digit[i]++;
                }
            }
        }
        int max = 0;
        int mode = 0;
        for (int i = 0; i < digit.length; i++) {
            if (digit[i] > max) {
                max = digit[i];
                mode = i;
            }
        }
        return mode;
    }
}