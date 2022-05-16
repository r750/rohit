public class largestAmong {
    public static void main(String[] args) {
        int x= 25;
        int y= 5;
        int z=35;
     int large;
        if(x>y && x>z) {
            large = x;
        } else if (y>z) {
            large = y;
        } else {
            large = z;
        }

        System.out.print(large + " is the largest.");
    }
}



