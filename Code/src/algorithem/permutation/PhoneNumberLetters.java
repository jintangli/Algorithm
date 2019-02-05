package algorithem.permutation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jin on 1/30/2019.
 */
public class PhoneNumberLetters {

    public static  final String[] LETTERS =
            new String[]{ "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args){
        letterCombinations("234");
    }

    public static List<String> letterCombinations(String digits) {
        int len = digits.length();
        String[] chosen = new String[len];
        List<String> results = new ArrayList<>();
        String[] letters = new String[len];
        for(int i=0; i<len; i++){
            int number = Integer.parseInt(String.valueOf(digits.charAt(i)));
            letters[i] = LETTERS[number];
        }

        letterCombinationHelper(len, letters, chosen,  results, 0);


        return results;
    }

    public static void letterCombinationHelper(int len, String[] letters, String[] chosen, List<String> results,
                                               int level) {
        if (level == len) {
            StringBuilder sb = new StringBuilder();
            for (String str : chosen) {
                sb.append(str);
            }
            String str = sb.toString();
            System.out.print(str);
            System.out.println("");
            results.add(str);
        } else {
            String letter = letters[level];
            int size = letter.length();
            for (int i = 0; i < size; i++) {
                //	choose
                String str = String.valueOf(letter.charAt(i));
                chosen[level] = str;
                //	explore
                letterCombinationHelper(len, letters, chosen, results, ++level);
                    //	unchoose
                --level;
                chosen[level] = null;
                }

            }

    }
}


