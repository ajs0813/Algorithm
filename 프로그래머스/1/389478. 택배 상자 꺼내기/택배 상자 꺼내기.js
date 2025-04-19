function solution(n, w, num) {
    let answer = 0;
    let totalFloor = Math.ceil(n/w); // 총 상자가 쌓인 층수 ex) 4층
    let numFloor = Math.ceil(num/w); // 꺼낼 상자의 층수 ex) 2층

    let cnt = totalFloor - numFloor;
    // 총 상자가 쌓인 4층과 자신이 있는 곳까지 최소 3층 + 자기층까지는 빼야함

    // 이제 내가 빼야할 상자 맨 위에도 상자가 있나 없나 검증해야 함
    let numCol = colCheck(num, w ,numFloor); // 8번 택배 기준 4번열

    let lastFloorBoxCnt = n - (w*(totalFloor-1)); // 22 - 18 = 4
    let lastFirstBox = n - lastFloorBoxCnt + 1; // 22 - 4 + 1 = 19

    for(let i = lastFirstBox; i <= n; i++){
        if(numCol === colCheck(i, w, Math.ceil(i/w))){
            cnt++;
            break;
        }
    }

    answer = cnt
    return answer;
}

function colCheck(num, w, numFloor){
    let numCol = 0;
    let num_index = num-1; // 0부터 시작해야 %로 위치 알 수 있어서
    if(numFloor % 2 === 1){ // 층수가 홀수층이면 좌측부터 카운트 되고 1~6
        numCol = (num_index%w);
    } else {
        numCol = w - (num_index%w) -1; // 층수가 짝수층이면 우측부터 카운트 되니깐 12~7
    }
    return numCol;
}