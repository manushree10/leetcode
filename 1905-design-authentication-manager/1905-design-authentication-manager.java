class AuthenticationManager {
    HashMap<String,Integer> mp;
    int ttl;

    public AuthenticationManager(int timeToLive) {
        mp = new HashMap<>();
        ttl = timeToLive;
    }
    
    public void generate(String tokenId, int currentTime) {
        mp.put(tokenId, currentTime);
    }
    
    public void renew(String tokenId, int currentTime) {
        if (mp.containsKey(tokenId) && currentTime - mp.get(tokenId) < ttl) {
            mp.put(tokenId, currentTime);
        }
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int cnt = 0;
        HashMap<String, Integer> temp = new HashMap<>(mp);
        for (Map.Entry<String, Integer> a : temp.entrySet()) {
            if (currentTime - a.getValue() < ttl) {
                cnt++;
            } else {
                mp.remove(a.getKey());
            }
        }
        return cnt;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */