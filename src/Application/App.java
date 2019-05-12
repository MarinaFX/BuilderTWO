package Application;

import ClientDirector.Client;

import java.util.Scanner;

public class App {
    private static String nome;
    private static String email;
    private static String endereco;
    private static int telefone;

    public static void main(String[] args) {
        System.out.println("Bem vindo!");
        App.coletaInformacoes();
        App.instanciaContatos();
    }

    private static void coletaInformacoes() {
        Scanner in = new Scanner(System.in);


        System.out.println("Insira seus dados abaixo:");
        System.out.println("Insira seu nome: ");
        nome = in.nextLine();

        System.out.println("Insira seu e-mail: ");
        email = in.nextLine();

        System.out.println("Insira seu endereço: ");
        endereco = in.nextLine();

        System.out.println("Insira seu telefone: ");
        telefone = in.nextInt();

    }

    private static void instanciaContatos() {
        Client client = new Client();
        client.main(nome, email, endereco, telefone);
        App.encerraPrograma(client);
    }

    private static void encerraPrograma(Client client) {
        try {
            System.out.println("Obrigada!");
            System.out.println("Suas informações foram gravadas!");
            client.imprimeContatos();
            System.out.println("Encerrando Programa");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(350);
            System.out.println("======FIM======");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
