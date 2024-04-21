package Estudos;
import java.util.Scanner;

public class Desafio {

    // Desafio positivo e negativo
    public static void main(String[] args) {
        System.out.println("Digite um numero positivo ou negativo");
        Scanner leitor = new Scanner(System.in);
        int numeroDigitado = leitor.nextInt();

        if (numeroDigitado >= 0){
            System.out.println("O número é positivo");
        }else {
            System.out.println("O número é negativo");
        }

        // Comparação dos dois números

        System.out.println("Digite o primeiro número: ");
        Scanner leitor1 = new Scanner(System.in);
        int primeiroNumero = leitor1.nextInt();
        System.out.println("Digite o segundo número: ");
        Scanner leitor2 = new Scanner(System.in);
        int segundoNumero = leitor2.nextInt();

        if (primeiroNumero == segundoNumero){
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");
        }

        if (primeiroNumero > segundoNumero){
            System.out.println("O primeiro número é maior que o segundo");
        } else {
            System.out.println("O segundo número é maior que o primeiro");
        }

        // Calculo da área com menu

        System.out.println("Selecione a opção desejada");
        System.out.println("1 - Calculo da área do quadrado");
        System.out.println("2 - Calculo da área do circulo");
        Scanner leitor3 = new Scanner(System.in);
        int escolha = leitor3.nextInt();
        
        if (escolha == 1){
            System.out.println("Digite a base do quadrado");
            Scanner leitor4 = new Scanner(System.in);
            double base = leitor4.nextDouble();
            System.out.println("Digite a altura do quadrado");
            Scanner leitor5 = new Scanner(System.in);
            double altura = leitor5.nextDouble();
            double area = base * altura;
            System.out.println("A área do quadrado é: " + area); 
        } else {
            System.out.println("Digite o raio do circulo");
            Scanner leitor6 = new Scanner(System.in);
            double raio = leitor6.nextDouble();
            double PI = 3.1416;
            double area2 = PI * (raio * raio);
            System.out.println("A área do circulo é: " + area2);
        }

        // Par ou impar

        System.out.println("Digite um número inteiro");
        Scanner leitor7 = new Scanner(System.in);
        int numeroInteiro = leitor7.nextInt();

        if (numeroInteiro % 2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

        // Fatorial

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

}
