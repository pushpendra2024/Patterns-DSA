public class EightNum{
    public static void main(String arg[]){
        int n = 5;
        int number = 1;

        //floyd's triangle
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}