import java.util.Scanner;

public class Beecrowd1003 {
    public void somando(){
        System.out.println("Insira a:");
        Scanner prompt = new Scanner(System.in);
        int a = prompt.nextInt();
        System.out.println("Insira b:");
        int b = prompt.nextInt();
        
        int soma = a + b;

        System.out.println("SOMA = " + soma);

        prompt.close();
    }


}
