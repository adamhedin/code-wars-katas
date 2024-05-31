package org.example.codewarskatas;

public class WriteNumberInExpandedForm {
    public static String expandedForm(int num) {
        if (num < 10) {
            return String.valueOf(num);
        }
        String s = String.valueOf(num);
        String sNew = s.charAt(0) + s.substring(1).replaceAll(".", "0");
        if (s.charAt(0) == '0') {
            return expandedForm(num - Integer.parseInt(sNew));
        } else {
            if (Integer.parseInt(s.substring(1)) == 0) return sNew;
            return sNew + " + " + expandedForm(num - Integer.parseInt(sNew));
        }
    }


}
