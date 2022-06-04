public class Main {
    public static void main(String[] args) {
        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                 };

        int[][] transpoz = new int[matris[0].length][matris.length];

        for(int i = 0 ; i < matris.length ; i++){
            for(int j = 0 ; j < matris[0].length ; j++){
                transpoz[j][i] = matris[i][j];
            }
        }
        for(int[] row : transpoz){
            for(int i : row){
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}