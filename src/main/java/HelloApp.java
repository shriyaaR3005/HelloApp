/**
/**
* UC 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For
* Loop or Default Message The application should accept multiple names as 41
* command-line arguments and display a personalized greeting for each user using
* an enhanced for loop. If no names are provided, it should display "Hello, World!".
*
* Usage: java HelloApp [name1] [name2] [nameN]
* If names are provided, it will display "Hello, [Name1], [Name2], ...!" 
*
* If no names are provided, it will display "Hello, World!"

* 
* @author Shriyaa Ranjani R
 * @version 5.0
* @since UC1

*/
// Key Concepts for HelloApp UC5:
// 1. Command-line Arguments: Accessing multiple user inputs via args[] parameter
// 2. Array Iteration: Using enhanced for loop to traverse all arguments
// 3. Enhanced For Loop: Simplifies iteration over arrays without manual index management
// 4. StringBuilder: Efficiently building a string in a loop without creating multiple
//immutable string objects
// 5. Default Values: Providing a fallback when no arguments are provided
// 6. String Concatenation: Building the final greeting message
// Sample Code for HelloApp UC5:
// StringBuilder nameBuilder = new StringBuilder();
// boolean first true;
// for (String name args) {
//if (!first) {
// nameBuilder.append(", ");
// }
//nameBuilder.append(name);
//first false;
// }
 import java.util.Scanner;
public class HelloApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter names (or press Enter for default): ");
        String input = scanner.nextLine();
        // If no input
        if (input.trim().isEmpty()) {
            System.out.println("Hello, World!");
        } else {
            // Split input into names
            String[] namesArray = input.split(" ");
            StringBuilder names = new StringBuilder();
            for (String name : namesArray) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }
            System.out.println("Hello, " + names + "!");
        }
        scanner.close();
    }
}