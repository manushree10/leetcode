class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String combine = s1 + " " + s2;
        
        String[] words = combine.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> res = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                res.add(key);
            }
        }

        return res.toArray(new String[0]);

    }
}