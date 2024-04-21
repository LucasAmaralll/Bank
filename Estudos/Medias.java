package Estudos;
public class Medias {
    public static void main(String[] args) {
        // Exercicio calcular média
        int nota1 = 9;
        int nota2 = 10;

        double media = (nota1 + nota2) / 2;
        System.out.println("A média é de " + media);

        // Exercicio casting
        double variavelDouble = 9.2;
        int variavelInt = (int) variavelDouble;

        System.out.println(variavelInt);

        // Exercicio Concatenação
        char letra = 'L';
        String palavra = "Lucas";

        System.out.println(palavra + " começa com " + letra);

        // Exercicio calculo valor total

        double precoProduto = 14.80;
        int quantidade = 7;

        double valorTotal = precoProduto * quantidade;

        System.out.println("O valor total é de: " + valorTotal);

        // Calculo Dolar
        double dolarHoje = 4.94;
        int valorEmDolares = 5;

        double valoremReais = valorEmDolares * dolarHoje;

        System.out.println("O valor em reais é de R$" + valoremReais);

        // Exercicio do desconto

        double precoOriginal = 14.80;
        double percentualDesconto = 0.15;

        double desconto = precoOriginal * percentualDesconto;

        System.out.println("O valor do desconto é de R$" + desconto);



    }
}
