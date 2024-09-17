package Pattern;

public class TrainagleRightUlta {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            for (int k=n-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            for (int j=i;j>0;j--)
            {
                System.out.print(" *");
            }


            System.out.println();
        }

    }
}
