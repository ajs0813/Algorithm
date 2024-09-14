function solution(arr, delete_list) {
    var answer = [];
    
    for(var i = 0; i<arr.length; i++){
        for(var j = 0; j<delete_list.length; j++){
            if(arr[i] == delete_list[j]){
                arr[i] = 0;
            }
        }
    }
    
    for(var i =0; i<arr.length; i++){
        if(arr[i] != 0){
            answer.push(arr[i]);
        }
    }
    
    return answer;
}