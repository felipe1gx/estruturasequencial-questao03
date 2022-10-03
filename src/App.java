import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner console = new Scanner(System.in);
        int n1, n2, soma;

        System.out.println("Digite o primeiro número: ");
        n1 = console.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = console.nextInt();

        soma = n1 + n2;
        
        System.out.println("A soma entre os números é de: " + soma);
    }
}
