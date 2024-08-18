import java.util.Scanner;

public class Beecrowd1007 {
    public void diferenca(){

        Scanner prompt = new Scanner(System.in);

        System.out.println("Insira a:");
        int a = prompt.nextInt();
        System.out.println("Insira b:");
        int b = prompt.nextInt();
        System.out.println("Insira c:");
        int c = prompt.nextInt();
        System.out.println("Insira d:");
        int d = prompt.nextInt();

        int diferenca = (a*b) - (c*d);

        System.out.println("DIFERENCA = " + diferenca);
        prompt.close();

    }

}
