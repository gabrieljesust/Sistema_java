package traba;

import java.util.Scanner;

public class Gerenciamento extends Registro{
    private Scanner input;
    private DadosEstoque DadosEstoque;
    
    public Gerenciamento() {
        input = new Scanner(System.in);
        DadosEstoque = new DadosEstoque();
    }
    
    public void start() {
        int status = 1;
        while (status <= 2) {
            System.out.println("1)Registrar novo item 2)Conferir estoque 3)Pesquisar produto 4)Apagar item registrado 5)Fechar programa");
            String escolha = input.nextLine();
    
            switch (escolha) {
                case "1":
                    new Registro().registrareSalvar(DadosEstoque, input);
                    break;
                case "2":
                    new MostrarDadosEstoque().checar(DadosEstoque);
                    break;
                case "3":
                    new Procurar().pesquisa(DadosEstoque, input);
                    break;
                case "4":
                    new DeletarItem().delete(DadosEstoque, input);
                    break;
                case "5":
                    System.out.println("Fim do programa");
                    status = 3;
                    break;
            }
        }
    }
}
