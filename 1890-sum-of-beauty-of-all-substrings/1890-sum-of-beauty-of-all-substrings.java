class Solution {
    public int beautySum(String s) {
        char[] chrs = s.toCharArray();
        int res = 0;
        for (int i = 0; i < chrs.length; i++) {
            res += getSum(chrs, i);
        }
        return res;
    }

    public int getSum(char[] chrs, int i) {
        int[] counts = new int[26];
        counts[chrs[i] - 'a']++;
        int max = 1;
        int min = 1;
        int res = 0;
        for (int j = i + 1; j < chrs.length; j++) {
            int count = counts[chrs[j] - 'a']++;
            if (count == max)
                max++;
            if (count == 0) {
                min = 1;
            } else if (count == min) {
                min++;
                for (int k = 0; k < 26; k++) {
                    if (counts[k] != 0 && counts[k] < min) {
                        min--;
                        break;
                    }
                }
            }
            res += max - min;
        }
        return res;
    }
}
