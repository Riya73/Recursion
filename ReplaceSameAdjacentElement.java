package Recursion;

public class ReplaceSameAdjacentElement {
     public static String replaceAdjacent(String str, int index) {
        if (index >= str.length() - 1) {
            return str;
        }
        
        StringBuilder sb = new StringBuilder(str);
        if (sb.charAt(index) == sb.charAt(index + 1)) {
            sb.setCharAt(index + 1, '#');
        }
        
        return replaceAdjacent(sb.toString(), index + 1);
    }
  public static String replaceAdjacent1(String str, int index) {
        if (index >= str.length() - 1) {
            return str;
        }
        
        if (str.charAt(index) == str.charAt(index + 1)) {
            str = str.substring(0, index + 1) + '#' + str.substring(index + 2);
        }
        
        return replaceAdjacent1(str, index + 1);
    }
    public static void main(String[] args) {
        String str = "aaabbbccc";
        System.out.println(replaceAdjacent(str, 0));

        String result = replaceAdjacent1(str, 0);
        System.out.println(result);
    }
}
