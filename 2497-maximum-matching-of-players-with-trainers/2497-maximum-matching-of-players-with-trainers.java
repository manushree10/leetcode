class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        int cnt=0;
        int p=players.length;
        int t=trainers.length;
        
        while(i<p && j<t)
                if(players[i]<=trainers[j])
                {
                    cnt++;
                    i++;
                    j++;
                }
                else{
                    j++;
                }
                 
                
           
        return cnt++;
    }
}