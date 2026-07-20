class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder str = new StringBuilder("abcdefghijklmnopqrstuvwxyz0123456789");

        int i = 0, j = s.length() - 1;

        while (i < j) {

            while (i < j && str.indexOf(String.valueOf(s.charAt(i))) == -1) {
                i++;
            }

            while (i < j && str.indexOf(String.valueOf(s.charAt(j))) == -1) {
                j--;
            }

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}