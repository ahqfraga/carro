import carro.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("--- ESCOLHA AS CARACTERÍSTICAS DO CARRO ---");

    System.out.print("Qual a cor desejada?: ");
        String cor = scanner.nextLine();

    System.out.print("Quantas portas o veículo possui? (2 ou 4): ");
        int portas = scanner.nextInt();


    Carro novoCarro = new Carro(4,16,4);
    novoCarro.setCor(cor);
    novoCarro.setPortas(portas);


    System.out.println("-- CARRO CRIADO COM SUCESSO --");
    System.out.println("- Cor: " + novoCarro.getCor());
    System.out.println("- Portas: " + novoCarro.getPortas());
    System.out.println("- Rodas: "+ novoCarro.getRodas());
    System.out.println("- Parafusos: "+ novoCarro.getParafusos());
    System.out.println("- Setas: " + novoCarro.getSetas());

    }

}
