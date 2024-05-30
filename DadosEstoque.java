package traba;

import java.io.FileWriter;

public class DadosEstoque{
    private String[][] data;
    private int h;

    public DadosEstoque() {
        data = new String[100][4];
        h = 1;
    }

    public String[][] getData() {
        return data;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public void salvarRegistro() {
        try {
            FileWriter myWriter = new FileWriter("Nomedata.txt");
            for (int lin = 0; lin < h; lin++) {
                for (int col = 0; col < 4; col++) {
                    myWriter.write(data[lin][col] + ",");
                }
                myWriter.write("\n");
            }
            myWriter.close();
        } catch (Exception e) {
            System.out.println("erro de gravacao");
        }
    }
}
