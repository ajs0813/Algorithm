function solution(n_str) {
    var answer = '';
    
    if(n_str.startsWith(0)){
        answer = String(Number(n_str));
    } else{
        answer = String(n_str);
    }
    
    return answer;
}