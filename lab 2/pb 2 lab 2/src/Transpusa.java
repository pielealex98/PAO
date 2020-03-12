public class Transpusa {

    public boolean isTranspusa() {
        int mat[][] = new int[][]{{1, 7, 0}, {7, 4, -5}, {3, -5, 6}};
        int auxMat[][] = new int[4][4];
        for(int i = 0 ; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++)   {
                auxMat[j][i] = mat[i][j];
            }
        }
        for(int i = 0 ; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++)   {
                if(auxMat[i][j] != mat[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Transpusa a = new Transpusa();
        System.out.println(a.isTranspusa());
    }
}
