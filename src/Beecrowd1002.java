
import java.util.Scanner;

public class Beecrowd1002 {
    public void area(){
        System.out.println("Insira o valor do raio:");
        Scanner prompt = new Scanner(System.in);
        double raio = prompt.nextInt();
        double area = 3.14159 * raio * raio;

        System.out.printf("A=%.4f", area);
        
        prompt.close();
    }

}
