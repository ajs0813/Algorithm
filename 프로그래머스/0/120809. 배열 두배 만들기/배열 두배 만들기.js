function solution(numbers) {
    var answer = new Array(numbers.length);
    
    for(var i = 0; i < answer.length; i++){
        answer[i] = numbers[i]*2;
    }
    
    return answer;
}