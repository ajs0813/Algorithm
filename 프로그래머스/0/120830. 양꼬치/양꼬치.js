function solution(n, k) {
    var answer = 0;
    var service = 0;
    if(n>=10){
        k = k - Math.floor(n/10);
    }
    
    var price = n*12000 + k*2000;
        
    answer = price;
    
    return answer;
}