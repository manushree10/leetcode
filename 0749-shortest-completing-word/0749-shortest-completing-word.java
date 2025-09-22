class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String s=licensePlate.replaceAll("[\\s\\d]","").toLowerCase();

         Map<Character, Integer> plateMap = new HashMap<>();
        for (char c : s.toCharArray()) {
           
                plateMap.put(c, plateMap.getOrDefault(c, 0) + 1);
            
        }

        String result = "";
        for (String word : words) {
            if (isValid(word, plateMap)) {
                if (result.isEmpty() || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }

    private boolean isValid(String word, Map<Character, Integer> plateMap) {
        Map<Character, Integer> wordMap = new HashMap<>();
        for (char c : word.toLowerCase().toCharArray()) {
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : plateMap.entrySet()) {
            char ch = entry.getKey();
            int needed = entry.getValue();
            if (wordMap.getOrDefault(ch, 0) < needed) {
                return false;
            }
        }
        return true;
    }
}
 
       
    