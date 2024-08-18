import java.util.Scanner;

public class Beecrowd1004 {
    public void produto(){

        System.out.println("Insira a:");
        Scanner prompt = new Scanner(System.in);

        int a = prompt.nextInt();
        System.out.println("Insira b:");
        int b = prompt.nextInt();

        int prod = a * b;

        System.out.println("PROD = " + prod);
        prompt.close();
    }
}
