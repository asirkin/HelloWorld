public class namesBackwards {
    public static void main(String[] args) {
        String[] names = {"hello", "goodbye", "how are you?", "Gabby", "Greenfin"};
        backwards(names);
        int[][][][] thing = new int[4][4][4][4];
        int[][] multTable = new int[5][10];

    }

    public static void backwards(String[] names) {
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i] + " ");
        }
    }

}
