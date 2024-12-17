import java.util.Arrays;

class RowMax implements Runnable {
    private int[] row;
    private int[] maxOfRow; // хранит максимальные значения в каждой строке
    private int rowIndex;
    private int rowMax = -1000;


    public RowMax(int[] row, int[] maxOfRow, int rowIndex) {
        this.row = row;
        this.maxOfRow = maxOfRow;
        this.rowIndex = rowIndex;
    }

    @Override
    public void run() {
        for (int num : row) {
            if(num > rowMax) {
                rowMax = num;
            }
        }
        maxOfRow[rowIndex] = rowMax;
    }
}
