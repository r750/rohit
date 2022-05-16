public class swapNumber {
    public static void main(String[] args) {
        int temp;
        int x=33;
        int y=44;
        System.out.println("Before swap :");
        System.out.println("x = " + x + " and y = " + y);

        //swapping
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swap :");
        System.out.println("x = " + x + " and y = " + y);


    }
}
