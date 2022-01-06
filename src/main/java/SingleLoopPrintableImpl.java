
public class SingleLoopPrintableImpl implements MatrixPrintable {

    public void print(Integer[][] data) {

        for (int row = 0, col = 0; row < data.length; ) {


            System.out.print(data[row][col++] + " ");

            if (data[row].length == 0) {
                row++;
                continue;
            }
            if (col == data[row].length) {
                System.out.println();
                col = 0;
                row++;
            }
        }
    }
}
