import jdk.jshell.execution.JdiDefaultExecutionControl;

public class StringIncrementer {
    public static String incrementString(String str) {
        int lastCharIndex = str.length() - 1;
        if (str.isEmpty() || !Character.isDigit(str.charAt(lastCharIndex))) return str + 1;
        else {
            StringBuilder stringBuilder = new StringBuilder(str);
            if (stringBuilder.charAt(lastCharIndex) == (char) 9) {
                if (!Character.isDigit(stringBuilder.charAt(lastCharIndex - 1))) {
                    stringBuilder.setCharAt(lastCharIndex, (char) 1);
                    stringBuilder.append(0);
                    return stringBuilder.toString();
                }
            } else {
                int tmp = stringBuilder.charAt(lastCharIndex);
                stringBuilder.setCharAt(lastCharIndex, (char) tmp++);
                return stringBuilder.toString();
            }
        }
        return "";
    }
}
