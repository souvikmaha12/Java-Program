package Qualifier;
import java.util.*;
public class palin {

public static void main(String[] args) {
        String s = "babad";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);

                String rev = "";
                for (int k = sub.length() - 1; k >= 0; k--) {
                    rev = rev + sub.charAt(k);
                }

                if (sub.equals(rev) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        System.out.println(longest);
    }
}
