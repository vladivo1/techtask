public class NestedLoopsPrintableImpl  implements  MatrixPrintable {

    public void print(Integer[][] data) {

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    System.out.print(data[i][j] + " ");
                }
                System.out.println();

            }

        System.out.println("You used NestedLoops");
    }
}
