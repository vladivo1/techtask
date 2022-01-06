public class Main {

    public static void main(String[] args) {

       NestedLoopsPrintableImpl nestedLoopsPrintable = new NestedLoopsPrintableImpl();
        SingleLoopPrintableImpl singleLoopPrintable = new SingleLoopPrintableImpl();

        Integer[][] arr = {{1,2,3}, {4,5,8}, {5,6,7}};

        if (Math.random() < 0.5) {
            nestedLoopsPrintable.print(arr);

        } else {
            singleLoopPrintable.print(arr);
        }
    }

}
