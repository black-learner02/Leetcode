class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;

           while(j < s.length()) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            max = Math.max(max, map.get(ch));

            int len = j - i + 1;
            if (len - max > k) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
                max=map.get(s.charAt(i));
            }

            res = Math.max(res, j - i + 1);
            j++;
        }

        return res;
    }
}
