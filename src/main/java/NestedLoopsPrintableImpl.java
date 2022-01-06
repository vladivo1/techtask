
public class NestedLoopsPrintableImpl implements MatrixPrintable {

    public void print(int[][] data) {

        if (data == null) {
            System.out.println(data);
            return;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                System.out.println(data[i]);
                continue;
            }
            else if (data[i].length == 0) {
                System.out.println("empty");
                continue;
            }

            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("You used Nested Loops");
    }
}
