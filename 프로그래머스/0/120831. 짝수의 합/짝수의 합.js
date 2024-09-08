function solution(n) {
    var answer = 0;
    var start = 0;
    while(start<=n){
        if(start%2 ===0){
            answer += start;
        }
        start++;
    }
    
    
    return answer;
}