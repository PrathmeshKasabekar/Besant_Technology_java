public class Exception_1 {

    // Instance variable
    int a = 10;

    // Method to access value of a
    static void access(Exception_1 e) {
        System.out.println(e.a);
    }

    public static void main(StringSession[] args) {

        Exception_1 e = new Exception_1();

        try {
            int[] arr = {1, 2};

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println(arr[2]);

            access(e);

        } catch (NullPointerException e1) {
            System.out.println("Null pointer caught");
            e1.printStackTrace();

        } catch (Exception e2) {  // superclass exception
            e2.printStackTrace();

        } finally {
            System.out.println("**Finally block**");
        }

        System.out.println("Value of a is printed successfully");
    }
}