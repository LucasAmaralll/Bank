import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Banco {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println("Bem Vindo, para começarmos digite os dados da conta");
        System.out.println("Digite seu nome completo: ");
        Scanner scanner = new Scanner(System.in);
        String nomeCompleto = scanner.nextLine();
        System.out.println("Selecione o tipo de conta que deseja acessar:\n 1 - Corrente \n 2 - Poupança");
        Scanner contaScanner = new Scanner(System.in);
        int tipoConta = contaScanner.nextInt();
        double saldoInicial = new Random().nextDouble() * 1000000;

        // Dados da conta

        System.out.println("************************************");
        System.out.println("Nome: " + nomeCompleto);
        if (tipoConta == 1) {
            System.out.println("Conta Corrente");
        } else if (tipoConta == 2){
            System.out.println("Conta Poupança");
        } else {
            System.out.println("Opção inválida, tente novamente");
        }
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoFormatado = formatoMoeda.format(saldoInicial);
        System.out.println("Saldo: " + saldoFormatado);
        System.out.println("************************************");

        // Menu de manipulação
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor 
                4 - Sair
                """;
        System.out.println(menu);
        Scanner operacaoScanner = new Scanner(System.in);
        int opcao = operacaoScanner.nextInt();

        while (opcao != 4) {
            if (opcao == 1) {
                System.out.println("Seu saldo é de: " + formatoMoeda.format(saldoInicial));
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja transferir: ");
                Scanner valorTransferenciaScanner = new Scanner(System.in);
                double valorTransferencia = valorTransferenciaScanner.nextDouble();
                double novoSaldo = saldoInicial - valorTransferencia;
                saldoInicial = novoSaldo;
                String saldoAtualizado = formatoMoeda.format(novoSaldo);
                if (valorTransferencia > saldoInicial) {
                    System.out.println("Débito realizado, cuidado você está utilizando o cheque especial, seu saldo atualizado é de: " + saldoAtualizado);
                } else {
                    System.out.println("Transferência realizada, o saldo atual é de: " + saldoAtualizado);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja depositar: ");
                Scanner valorDepositoScanner = new Scanner(System.in);
                double valorDeposito = valorDepositoScanner.nextDouble();
                double novoSaldo = saldoInicial + valorDeposito;
                saldoInicial = novoSaldo;
                String saldoAtualizado = formatoMoeda.format(novoSaldo);
                System.out.println("Depósito realizada, o saldo atual é de: " + saldoAtualizado);
            } else if (opcao == 4) {
                System.out.println("Saindo do programa. Obrigado!");
                break;
            } else {
                System.out.println("Opção inválida");
            }
            System.out.println(menu);
            opcao = operacaoScanner.nextInt();
        }

    }
}
