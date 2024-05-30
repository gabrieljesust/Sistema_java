package traba;

public class MostrarDadosEstoque {
    public void checar(DadosEstoque DadosEstoque) {
        System.out.println("Estoque");
        for (int lin = 0; lin < DadosEstoque.getH(); lin++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(DadosEstoque.getData()[lin][col] + " ");
            }
            System.out.println();
        }
    }
}
