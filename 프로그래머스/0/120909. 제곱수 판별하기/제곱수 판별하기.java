class Solution {
    public int solution(int n) {
        int answer = 2;
        int cnt=1;
        while(true){
            if(cnt*cnt==n){
                answer=1;
                break;
            }
            else if(cnt>1000)
                break;
            cnt++;
        }
        return answer;
    }
}