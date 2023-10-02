public class Task02 {
    
    public static void main(String[] args) {
        
        // ArithmeticException
        // int[] intArray = new int[10];
        // int d = 0;

        // ArrayIndexOutOfBoundsException
        // int[] intArray = new int[5];
        // int d = 2;

        // valid
        int[] intArray = new int[10];
        int d = 2;

        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}