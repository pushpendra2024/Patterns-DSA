package patterns;

public class ThirdNum {
    public static void main(String[] args) {
        int n = 4;

        //Half Pyramid pattern

        for(int i = 0;i<=n;i++){

            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
