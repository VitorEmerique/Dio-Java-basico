import model.Conta;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o numero da agencia");
        String agencia = sc.nextLine();
        System.out.println("Digite o nome do proprietário da conta");
        String nome = sc.nextLine();
        System.out.println("Digite o saldo da conta");
        Double saldo = Double.valueOf(sc.nextLine());

        Conta joao = new Conta(numero, agencia, nome, saldo);
        System.out.println(joao.toString());

    }
}
