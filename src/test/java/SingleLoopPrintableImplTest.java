import org.junit.Test;


public class SingleLoopPrintableImplTest {

    SingleLoopPrintableImpl singleLoopPrintable = new SingleLoopPrintableImpl();


    @Test
    public void firstData() {
        int[][] data = {{1,2,3}, {4,5,6}, {7,8,9}};
        singleLoopPrintable.print(data);
    }

    @Test
    public void secondData() {
        int[][] data = {{1,2,3}, {4,5,6,7,8},{10}};
        singleLoopPrintable.print(data);
    }

    @Test public void thirdData() {
        int[][] data = {null, {} , {10} };
        singleLoopPrintable.print(data);

    }
    @Test public void fourthData() {
        int[][] data = null;
        singleLoopPrintable.print(data);

    }

}
