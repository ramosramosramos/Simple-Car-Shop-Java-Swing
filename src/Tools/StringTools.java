
package Tools;

/**
 *
 * @author User
 */
public class StringTools {

    public static String[] splitter(String input, String delimiter) {
        if (input == null || delimiter == null) {
            throw new IllegalArgumentException("Input string and delimiter cannot be null");
        }
        return input.split(delimiter);
    }
}
