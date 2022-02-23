import java.util.Scanner;
public class Main

{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

       /* for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        } */

       /* for (int i=1; i<=5; i++)
        {
            for (int k=5; k>=i; k--)
            {
                System.out.print("*");
            }
            for (int j=1; j<i; j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }*/

        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
