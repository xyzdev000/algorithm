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

/* 
 * [point]
 *  1 ≤ p의 길이 ≤ 18
 *  int형 불가
 *  int: 10자리 / long: 19자리
 *
 */

