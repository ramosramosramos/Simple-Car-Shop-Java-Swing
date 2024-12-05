
package Tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
      public static boolean isValidUsername(String username) {
     
        String regex = "^(?=.*[0-9]).+$"; 
        
     
        Pattern pattern = Pattern.compile(regex);
        
   
        Matcher matcher = pattern.matcher(username);

        return matcher.matches();
    }
}
