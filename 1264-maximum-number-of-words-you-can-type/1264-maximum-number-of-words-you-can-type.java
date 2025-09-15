class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character>br=new HashSet<>();
        int cnt=0;
        for(char c:brokenLetters.toCharArray())
        {
            br.add(c);
        }
        String[] words=text.split(" ");

        for(String word:words)
        {
            for(char c:word.toCharArray())
            {
                if(br.contains(c))
                {
                    cnt++;
                    break;
                }
            }
        }
        return words.length-cnt;
    }
}