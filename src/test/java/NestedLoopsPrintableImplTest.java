
import org.junit.Test;


public class NestedLoopsPrintableImplTest {

    private NestedLoopsPrintableImpl nestedLoopsPrintable = new NestedLoopsPrintableImpl();

    @Test
    public void firstData() {
        Integer[][] data = {{1,2,3}, {4,5,6}, {7,8,9}};
         nestedLoopsPrintable.print(data);
    }

    @Test
    public void secondData() {
        Integer[][] data = {{1,2,3}, {4,5,6,7,8}, {10}};
        nestedLoopsPrintable.print(data);
    }

    @Test public void thirdData() {
        Integer[][] data = {{null}, {} , {10} };
        nestedLoopsPrintable.print(data);

    }
    @Test public void fourthData() {
        Integer[][] data = {{null}};
        nestedLoopsPrintable.print(data);

    }

}