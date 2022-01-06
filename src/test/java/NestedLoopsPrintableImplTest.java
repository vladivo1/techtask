
import org.junit.Test;


public class NestedLoopsPrintableImplTest {

    private NestedLoopsPrintableImpl nestedLoopsPrintable = new NestedLoopsPrintableImpl();

    @Test
    public void firstData() {
        int[][] data = {{1,2,3}, {4,5,6}, {7,8,9}};
         nestedLoopsPrintable.print(data);
    }

    @Test
    public void secondData() {
        int[][] data = {{1,2,3}, {4,5,6,7,8}, {10}};
        nestedLoopsPrintable.print(data);
    }

    @Test public void thirdData() {
        int[][] data = {null, {} , {10} };
        nestedLoopsPrintable.print(data);

    }
    @Test public void fourthData() {
        int[][] data = null;
        nestedLoopsPrintable.print(data);

    }

}