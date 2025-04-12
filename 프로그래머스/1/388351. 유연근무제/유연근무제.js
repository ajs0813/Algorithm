function solution(schedules, timelogs, startday) {
    let answer = 0;
    let success_employee = schedules.length; // 사원 수
    

    for(let i = 0; i<timelogs.length; i++){
        let today = startday;
        let perception_time = timeFormat(schedules[i] + 10);
        for(let j = 0; j<timelogs[i].length; j++){
            if(today == 0){
                today++;
            }
            
            if(today<6 && timelogs[i][j] > perception_time){
                success_employee--;
                break;
            }

            today = (today +1 ) % 8 ;
        }
    }

    answer = success_employee;
    
    return answer;
}

function timeFormat(time){
    let hour = (time - (time % 100));
    let minute
    if((time-hour) > 59){
        minute = (time-hour)%60;
        hour=hour+100;
        
    } else {
        minute = (time-hour)%60;
    }

    answer = hour + minute;
    return answer;
}