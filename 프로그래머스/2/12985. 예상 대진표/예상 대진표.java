class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        int cnt = 0;


        while(true){
            double check1 = Math.ceil((double)a/2);
            double check2 = Math.ceil((double)b/2);
            cnt++;
            a = (int)check1;
            b = (int)check2;
            if(check1 == check2){
                break;
            }
        }

        answer = cnt;
        return answer;
    }
}