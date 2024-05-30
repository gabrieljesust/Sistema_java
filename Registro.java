package traba;

import java.util.Scanner;

interface Inventario{
    void registrareSalvar(DadosEstoque DadosEstoque, Scanner input);
}
class Registro implements Inventario{
    public void registrareSalvar(DadosEstoque DadosEstoque, Scanner input) {
        System.out.println("Registrar novo item");
        while (DadosEstoque.getH() < 100) {
            System.out.println("Entre com nome do produto (digite 'fechar' para voltar ao menu): ");
            DadosEstoque.getData()[DadosEstoque.getH()][0] = input.nextLine();
            if (DadosEstoque.getData()[DadosEstoque.getH()][0].equals("fechar")) {
                break;
            }
            System.out.println("Entre com código do produto :");
            DadosEstoque.getData()[DadosEstoque.getH()][1] = input.nextLine();
            System.out.println("Entre com data de validade : ");
            DadosEstoque.getData()[DadosEstoque.getH()][2] = input.nextLine();
            System.out.println("Entre com valor do produto :");
            DadosEstoque.getData()[DadosEstoque.getH()][3] = input.nextLine();
            DadosEstoque.setH(DadosEstoque.getH() + 1);
        }
        DadosEstoque.salvarRegistro();
    }
}
