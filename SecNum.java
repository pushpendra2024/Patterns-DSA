package patterns;

public class SecNum {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        //Hollow pattern
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= m; j++) {
                //cell(i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}