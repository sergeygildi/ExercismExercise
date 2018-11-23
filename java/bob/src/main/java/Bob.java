import javafx.scene.layout.CornerRadii;

public class Bob {


    private static final String ELSE = "Whatever.";
    private static final String NO_TEXT = "Fine. Be that way!";
    private static final String YELL = "Whoa, chill out!";
    private static final String YELL_WITH_QUESTION = "Calm down, I know what I'm doing!";
    private static final String QUESTION = "Sure.";

//    public static void main(String[] args) {
//        System.out.println(new Bob().hey("?"));
//        System.out.println(new Bob().hey("ASDASD"));
//        System.out.println(new Bob().hey("ASDADSSADA?"));
//        System.out.println(new Bob().hey(""));
//        System.out.println(new Bob().hey("asd."));
//    }

    public String hey(String phrase) {

        if (isEmptyAndBlank(phrase)) {
            return NO_TEXT;
        }

        if (isYell(phrase)) {
            if (isQuestion(phrase)) {
                return YELL_WITH_QUESTION;
            }
            return YELL;
        }

        if (isQuestion(phrase)) {
            return QUESTION;
        }

        return ELSE;
    }

    private boolean isYell(String s){

        boolean containLetters = false;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                containLetters = true;
                if (Character.isLowerCase(c)) {
                    return false;
                }
            }
        }
        return containLetters;
    }

    private static boolean isQuestion(String s) {
        return s.trim().endsWith("?");
    }

    private static boolean isEmptyAndBlank(String s) {

        if (s == null || s.length() == 0) {
            return true;
        }

            for (char c : s.toCharArray()) {
                if (!Character.isWhitespace(c)) {
                    return false;
                }
            }

        return true;
    }
}