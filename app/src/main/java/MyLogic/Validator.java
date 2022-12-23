
package MyLogic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {
     private static Validator validator = null;


    private Validator() {
    }

    public static Validator getValidator() {
        if (validator == null) {
            synchronized (Validator.class) {
                if (validator == null) {
                    validator = new Validator();
                }
            }
        }
        return validator;
    }
    public boolean isPhoneValid(String s) {
        Pattern p = Pattern.compile("^\\d{11}$");
        Matcher m = p.matcher(s);
        return (m.matches());
    }
}
