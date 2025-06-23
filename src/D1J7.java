public class D1J7 {
    public static void main(String[] args) {
        int[] nums = {10, 0, 20};

        try {
            int result = nums[0] / nums[1];
            System.out.println("Result: " + result);


            System.out.println(nums[5]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
        finally {
            System.out.println("This is the finally block.");
        }
    }
}
