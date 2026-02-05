package projects;

public class D2Array {
        public static void main(String[] args) {
                String format = "%10.2f\n";
                int[][] arrayInt = new int[3][5];
                int[] playerScore = new int [3];
                int total = 0;
                for (int i = 0; i < arrayInt.length;i++){
                        total = 0;
                        for (int j = 0; j < arrayInt[0].length;j++){
                                arrayInt[i][j] = randomScore();
                                total +=  arrayInt[i][j];
                        }
                        playerScore[i] = total;
                }
                for (int i = 0; i < arrayInt.length;i++){
                        System.out.print("player " + (i+1));
                        for (int j = 0; j < arrayInt[0].length;j++){
                                System.out.print(" |"+String.format("%03d", arrayInt[i][j])+"|");
                        }
                        System.out.println();
                }
                System.out.println();
                int k = 1;
                for (int score : playerScore) {
                        System.out.println("player "+k+" total :" + score);
                        k++;
                }

        }
        public static int randomScore() {
                return (int) (Math.random() * 100)+ 1;
        }
}
