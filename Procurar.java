package traba;

import java.util.Scanner;

abstract class Procuraabs {
    public void pesquisa(DadosEstoque DadosEstoque, Scanner input) {
        System.out.println("Pesquisa");
        System.out.println("Digite o nome do produto: ");
        String nome = input.nextLine();
        boolean encontrado = false;
        for (int lin = 0; lin < DadosEstoque.getH(); lin++) {
            if (nome.equals(DadosEstoque.getData()[lin][0])) {
                encontrado = true;
                System.out.println("Produto encontrado:");
                for (int col = 0; col < 4; col++) {
                    System.out.print(DadosEstoque.getData()[lin][col] + " ");
                }
                System.out.println();
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }
}
class Procurar extends Procuraabs{}
