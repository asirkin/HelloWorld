public class RandomHat {
    public static void main(String[] args) {
        int[] teams = new int[8];
        int count = 0;
        for(int i = 0; i < teams.length; i++) {
            int random = (int)(Math.random() * 8);
            if(teams[random] == 0) {
                count++;
                if(count % 2 == 1) {
                    System.out.print("Team " + (random + 1) + " with ");
                } else {
                    System.out.print("Team " + (random + 1) + "\n");
                }
                teams[random] = 1;
            } else {
                do {
                    random = (int)(Math.random() * 8);
                } while (teams[random] == 1);
                count++;
                if(count % 2 == 1) {
                    System.out.print("Team " + (random + 1) + " with ");
                } else {
                    System.out.print("Team " + (random + 1) + "\n");
                }
                teams[random] = 1;
            }
        }
    }
}