import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int number= input.nextInt();
        double sum=0.0;
        double i=1;
        for (i=1;i<=number;i++)
        {
            double a=1/i;
             sum=sum+a;}
        System.out.print(sum);
    }
}
