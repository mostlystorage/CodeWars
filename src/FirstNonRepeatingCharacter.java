public class FirstNonRepeatingCharacter {
    public static String firstNonRepeatingLetter(String s){
        String tmp = s.toLowerCase();
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.indexOf(tmp.charAt(i)) == tmp.lastIndexOf(tmp.charAt(i))) return String.valueOf(s.charAt(i));
        }
        return "";
    }
}