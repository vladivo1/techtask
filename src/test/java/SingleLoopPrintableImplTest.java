import org.junit.Test;


public class SingleLoopPrintableImplTest {

    SingleLoopPrintableImpl singleLoopPrintable = new SingleLoopPrintableImpl();


    @Test
    public void firstData() {
        Integer[][] data = {{1,2,3}, {4,5,6}, {7,8,9}};
        singleLoopPrintable.print(data);
    }

    @Test
    public void secondData() {
        Integer[][] data = {{1,2,3}, {4,5,6,7,8},{10}};
        singleLoopPrintable.print(data);
    }

    @Test public void thirdData() {
        Integer[][] data = {{null}, { } , {10} };
        singleLoopPrintable.print(data);

    }
    @Test public void fourthData() {
        Integer[][] data = {{null}};
        singleLoopPrintable.print(data);

    }

}
