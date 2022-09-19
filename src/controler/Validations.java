/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author lihin
 */
public class Validations {

    public static Boolean validateNoNumSymb(String a) {
        String pattern = "^[a-zA-Z\\s]*$";
        return !(a.matches(pattern));
    }

    public static Boolean validateNoSpace(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }

    public static Boolean validateOnlyNum(String a) {
        return (a.matches("^\\d+"));
    }

    public static Boolean validateUserName(String a) {
        return (a.charAt(0) == ' ');
    }

    public static Boolean validateUserNamePattern(String a) {
        return !(a.matches("^[a-zA-Z0-9._-]{3,15}$"));//Length >=3,Valid characters: a-z, A-Z, 0-9, points, dashes and underscores.
    }

    /*public static Boolean ValidatePasswordLenghth(String a) {
        return !((a.length() >8) && (a.length() < 15));
    }*/
    public static Boolean validatePassword(String a) {
        //Minimum eight characters, at least one uppercase letter, one lowercase letter and one number:  
        return !(a.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,15}$"));
    }

    public static Boolean validateConfPassMatch(String a, String b) {
        return !(a.matches(b));
    }

    public static Boolean validateEmail(String a) {
        return !(a.matches("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$"));
    }

    public static Boolean validateOldId(String a) {
        return (a.matches("^(?:19|20)?\\d{2}(?:[0-35-8]\\d\\d(?<!(?:000|500|36[7-9]|3[7-9]\\d|86[7-9]|8[7-9]\\d)))\\d{4}(?i:v|x)$"));
    }

    public static Boolean validateNewId(String a) {
        return ((a.length() == 12) && (a.matches("^\\d+")));
    }

    public static Boolean validateContact(String a) {
        return !(a.matches("^(?:0|94|\\+94|0094)?(?:(11|21|23|24|25|26|27|31|32|33|34|35|36|37|38|41|45|47|51|52|54|55|57|63|65|66|67|81|91)(0|2|3|4|5|7|9)|7(0|1|2|4|5|6|7|8)\\d)\\d{6}$"));
    }

}
