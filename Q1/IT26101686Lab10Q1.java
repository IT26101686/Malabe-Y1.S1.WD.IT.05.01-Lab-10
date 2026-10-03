import java.util.Scanner;

public class IT26101686Lab10Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mark: ");
        int mark = input.nextInt();

        // Validate mark using assertion
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        input.close();
    }
}