package conta;

import java.util.Scanner;

public class Main {
    /**
     * Programa principal
     * @param args
     */
    public static void main(String[] args) {
        int numero = 0;
        String agencia;
        String cliente;
        double saldo = 0.00;

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta: ");
        try {
            numero = Integer.parseInt(in.nextLine());
        } catch (Exception e) {
            System.out.println("Não é possível converter");
        }
        System.out.println("Por favor, digite o número da agência: ");
        agencia = in.nextLine();
        System.out.println("Por favor, digite seu Nome: ");
        cliente = in.nextLine();
        System.out.println("Por favor, digite seu saldo (ex: 1500.00) ");
        try {
            saldo = Double.parseDouble(in.nextLine());
        } catch (Exception e) {
            System.out.println("Não é possível converter, utilize ponto");
        }
        ContaTerminal ct = new ContaTerminal(numero, agencia, cliente, saldo);
        System.out.println(ct);
    }
}