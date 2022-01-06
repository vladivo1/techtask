
public class SingleLoopPrintableImpl implements MatrixPrintable {
    public void print(int[][] data) {

        if (data == null) {
            System.out.println(data);
            return;
        }

        for (int row = 0, col = 0; row < data.length; ) {
            if (data[row] == null || data[row].length == 0) {
                System.out.println(data[row]);
                row++;
                continue;
            }

            System.out.print(data[row][col++] + " ");
            if (col == data[row].length) {
                System.out.println();
                col = 0;
                row++;
                }
            }
        System.out.println("You used Single Loop");
        }
    }


