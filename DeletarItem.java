package traba;

import java.util.Scanner;

public class DeletarItem {
    public void delete(DadosEstoque DadosEstoque, Scanner input){
        System.out.println("Apagar registro");
        System.out.println("Digite o nome do produto a ser apagado: ");
        String nome = input.nextLine();
        boolean encontrado = false;
        for (int lin = 0; lin < DadosEstoque.getH(); lin++) {
            if (nome.equals(DadosEstoque.getData()[lin][0])) {
                encontrado = true;
                // Remover o registro
                for (int col = 0; col < 4; col++) {
                    DadosEstoque.getData()[lin][col] = null;
                }
                System.out.println("Registro apagado com sucesso.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }
}
