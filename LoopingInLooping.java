public class LoopingInLooping {
    public static void main(String[] args) {
        int a = 0, b = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (a < 3) {
                    System.out.print("S ");
                } else {
                    System.out.print("O ");
                }
                a++;
            }
            b++;
            a=b;
            System.out.println();
        }
    }
}
