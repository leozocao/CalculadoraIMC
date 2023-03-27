import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double altura;
        double peso;
        double imc;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da altura: ");
        altura = teclado.nextDouble();
        System.out.print("Digite o valor do peso: ");
        peso = teclado.nextDouble();

        imc = peso / (altura * altura);

        System.out.println(imc);

    }
}