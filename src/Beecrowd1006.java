import java.util.Scanner;

public class Beecrowd1006 {
    public void mediaprova(){

        Scanner prompt = new Scanner(System.in);

        System.out.println("Insira a:");
        double a = prompt.nextDouble();
        System.out.println("Insira b:");
        double b = prompt.nextDouble();
        System.out.println("Insira c");
        double c = prompt.nextDouble();

        double media = ((a*2) + (b*3) + (c*5))/10;

        System.out.printf("MEDIA = %.1f", media);
        prompt.close();
    }

}
