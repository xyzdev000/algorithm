class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plen = p.length(); 
        int tlen = t.length(); 
        for(int i=0; i<tlen-plen+1; i++) {
            long tnum = Long.parseLong(t.substring(i,i+plen));
            if(tnum <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}

