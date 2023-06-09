package Recursion;

public class AddStarBetweenSameElements {
     public static String addStars(String str, int index) {
        if (index >= str.length() - 1) {
            return str;
        }
        
        StringBuilder sb = new StringBuilder(str);
        if (sb.charAt(index) == sb.charAt(index + 1)) {
            sb.insert(index + 1, '*');
        }
        
        return addStars(sb.toString(), index + 1);
    }

    public static String addStars1(String str, int index) {
        if (index >= str.length() - 1) {
            return str;
        }
        
        if (str.charAt(index) == str.charAt(index + 1)) {
            str = str.substring(0, index + 1) + '*' + str.substring(index + 1);
        }
        
        return addStars1(str, index + 1);
    }

    public static void main(String[] args) {
        String str = "aabbcc";
        
        String result = addStars(str, 0);
        System.out.println(result);
        
        result = addStars1(str, 0);
        System.out.println(result);
    }
}
