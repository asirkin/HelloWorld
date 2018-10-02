import java.util.*;
public class ArrayReversal {
    public static void main(String[] args) {
        int[] data = {5, 8, 7, 12, 67, 55, 79, 30, 4567, 213};
        //data = algorithm1(data);
        //System.out.println(Arrays.toString(data));
        algorithm2(data);
    }

    public static int[] algorithm1 (int[] data) {
        int[] temp = new int[data.length];
        for (int i = data.length - 1; i >= 0; i--) {
            temp[i] = data[data.length - 1 - i];
        }
        return(temp);
    }

    public static void algorithm2 (int alg[]) {
        int temp;
        int count = 0;
        for (int i = 0; i < alg.length / 2; i++) {
            temp = alg[i];
            alg[i] = alg[alg.length - i - 1];
            alg[alg.length - i - 1] = temp;
            count++;
        }
        System.out.println(Arrays.toString(alg));
    }
}
