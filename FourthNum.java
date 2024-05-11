package patterns;

public class FourthNum {
    public static void main(String[] args) {
        int n = 4;

        // print inverted pyramid pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
