import java.util.Scanner;

public class Matrice {
    private int mat[][];
    private int rowN;
    private int colN;

    private void setRowN(int x) {
        this.rowN = x;
    }
    private void setColN(int x) {
        this.colN = x;
    }
    private int getRowN() {
        return this.rowN;
    }
    private int getColN() {
        return this.colN;
    }

    private void setMat() {
        mat = new int[getRowN()][getColN()];
        for (int i = 0; i < getRowN(); i++) {
            for(int j = 0; j < getColN(); j++) {
                Scanner keyboard = new Scanner(System.in);
                mat[i][j] = keyboard.nextInt();
            }
        }
    }

    public void printMat() {
        for(int i = 0 ; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++)   {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrice(int a, int b) {
        setRowN(a);
        setColN(b);
        setMat();
    }


    public Matrice add(Matrice m2) {
        Matrice sum = new Matrice(this.getRowN(),this.getColN());
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum.mat[i][j] = this.mat[i][j] + m2.mat[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Matrice a = new Matrice(2,2);
        Matrice b = new Matrice(2,2);
        a = a.add(b);
        a.printMat();
    }
}
