package uzd14;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] words = new String[]{"flower", "flow", "flight"};
        String[] words2 = new String[]{"dog", "racecar", "car"};

        longestCommonPrefix(words);
        longestCommonPrefix(words2);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        else if (strs.length == 1) return strs[0];
        int stopsAt = strs[0].length();

        topLoop:
        for (int i = 0; i < strs[0].length(); i++) { //letters in one word
            char currLetter = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) { //all 200 words
                if (strs[j].length() - 1 < i) {
                    stopsAt = i;
                    break topLoop;
                }
                if (strs[j].charAt(i) != currLetter) {
                    stopsAt = i;
                    break topLoop;
                }
            }
        }
        return strs[0].substring(0, stopsAt);
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        if (strs.length == 1) return strs[0];
        for (int i = 0; i < strs.length; i++) {
            for (int k = 0; k < strs[i].length(); k++) {
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[i].length() <= k || strs[j].length() <= k || strs[i].charAt(k) != strs[j].charAt(k)) {
                        return sb.toString();
                    }
                }
                sb.append(strs[i].charAt(k));
            }
            return sb.toString();
        }
        return "";
    }
}
