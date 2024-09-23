function solution(n, control) {
    var answer = 0;
    
    for(var i = 0; i< control.length; i++){
        if(control[i]==='w'){
            n++;
        }
        if(control[i]==='s'){
            n--;
        }
        if(control[i]==='d'){
            n+=10;
        }
        if(control[i]==='a'){
            n-=10;
        }
    }
    
    answer = n;
    
    return answer;
}