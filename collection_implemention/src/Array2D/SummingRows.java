package Array2D;

class SummingRows {
	
    public static void main(String[] args) {
        int [][] scores = {{ 1, 2, 3, 4, 5 },//15
        				   { 6, 7, 8, 1, 2 },//24
        				   { 16, 19, 16, 53, 24 },//128
        				   { 25, 24, 22, 24, 25 }};//120
        outputArray(scores);
    }

    public static void outputArray(int[][] array) {
        int sum= 0;
        int rowSize = array.length;//4
        int columnSize = array[0].length;//5
        System.out.println("rows=" + rowSize + "cols=" + columnSize);

        for (int i = 0; i < rowSize; i++) {
        	//sum =0;
            for (int j = 0; j < columnSize; j++) {
                sum += array[i][j];
            }
            System.out.println("Print the sum of rows = " + sum);
        }
    }
}