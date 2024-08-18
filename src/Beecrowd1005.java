import java.util.Scanner;

public class Beecrowd1005 {
    public void mediapond(){

        Scanner prompt = new Scanner(System.in);

        System.out.println("Digite a:");
        int a = prompt.nextInt();
        System.out.println("Digite b:");
        int b = prompt.nextInt();

        double media = ((a*3.5) + (b*7.5))/11;

        System.out.printf("MEDIA = %.5f", media );
        prompt.close();
    }
}

