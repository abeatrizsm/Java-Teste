import java.util.Scanner;

public class Beecrowd1001 {
    public void somar(){
        System.out.println("valor de a: ");
        Scanner prompt = new Scanner(System.in);
        int a = prompt.nextInt();
        System.out.println("valor de b: ");
        int b = prompt.nextInt();

        int x = a + b;

        System.out.println("X = " + x);
        prompt.close();
    }

}

