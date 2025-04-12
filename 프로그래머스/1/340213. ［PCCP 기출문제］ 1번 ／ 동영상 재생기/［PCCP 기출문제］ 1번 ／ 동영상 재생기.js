function solution(video_len, pos, op_start, op_end, commands) {
    let answer = '';
    let secVlen = timeFormat(video_len);
    let posTime = timeFormat(pos);

    if(posTime >= timeFormat(op_start) && posTime <= timeFormat(op_end)){
        posTime = timeFormat(op_end);
    }

    for(let i = 0; i < commands.length; i++){
        if(commands[i] === "next"){
            posTime = posTime + 10;
            if(posTime > secVlen){
                posTime = secVlen;
            }
            if(posTime >= timeFormat(op_start) && posTime <= timeFormat(op_end)){
                posTime = timeFormat(op_end);
            }
        } else if (commands[i] === "prev"){
            posTime = posTime - 10;
            if(posTime < 0){
                posTime = 0;
            }
            if(posTime >= timeFormat(op_start) && posTime <= timeFormat(op_end)){
                posTime = timeFormat(op_end);
            }
        }
    }

    if(posTime >= timeFormat(op_start) && posTime <= timeFormat(op_end)){
        posTime = timeFormat(op_end);
    }

    answer = timeFormat2(posTime);

    return answer;
}

function timeFormat(time) {
    let timeArr = time.split(":");
    let fullSec = Number(timeArr[0]*60) + Number(timeArr[1]);
    return fullSec;
}

function timeFormat2(time2){
    let min = Math.floor(time2/60);
    let sec = time2 - min*60;
    if(min < 10){
        min = "0" + min;
    }
    if(sec === 0){
        sec = sec + "0";
    } else if(sec > 0 && sec < 10){
        sec = "0" + sec;
    }
    return min + ":" + sec;
}