function solution(friends, gifts) {
    var answer = 0;
    let aToB = new Map(); // 선물 줄 놈과 받을 놈

    for(let i = 0; i < friends.length; i++) {
        let aToBGifts = new Map(); // 받은 놈이 몇개의 선물을 받았나 기록
        for(let j = 0; j < friends.length; j++) {
            aToBGifts.set(friends[j], 0);
        }
        aToB.set(friends[i], aToBGifts);
    }

    // 선물 주고 받기
    for(let i = 0; i<gifts.length; i++){
        let giftsList = gifts[i].split(" ");
        aToB.get(giftsList[0]).set(giftsList[1], aToB.get(giftsList[0]).get(giftsList[1]) +1 );
    }

    // 선물 지수 구하기
    let giftsPoint = new Map;
    for(let i = 0; i < friends.length; i++) {
        let me = friends[i];

        let giveSum = 0;
        let receiveSum = 0;
        
        // 내가 다른 친구들에게 준 선물 총합
        for(let value of aToB.get(me).values()){
            giveSum += value;
        }

        // 내가 다른 친구들에게 받은 선물 총합
        for(let who of friends){
            receiveSum += aToB.get(who).get(me);
        }

        giftsPoint.set(friends[i], giveSum - receiveSum);
    }

    // 다음달에 받을 선물 구하기
    let nextMonthGifts = new Map();
    for(let i = 0; i < friends.length; i++) {
        nextMonthGifts.set(friends[i], 0);
    }

    for(let i = 0; i < friends.length; i++){
        for(let j = i+1; j < friends.length; j++){

            let meToFriend = aToB.get(friends[i]).get(friends[j]);
            let friendToMe = aToB.get(friends[j]).get(friends[i]);

            if(meToFriend > friendToMe){
                nextMonthGifts.set(friends[i], nextMonthGifts.get(friends[i])+1);
            } else if(meToFriend < friendToMe){
                nextMonthGifts.set(friends[j], nextMonthGifts.get(friends[j])+1);
            } else if (meToFriend === friendToMe){
                let mePoint = giftsPoint.get(friends[i]);
                let friendPoint = giftsPoint.get(friends[j]);

                if(mePoint > friendPoint){
                    nextMonthGifts.set(friends[i], nextMonthGifts.get(friends[i])+1);
                } else if(mePoint < friendPoint){
                    nextMonthGifts.set(friends[j], nextMonthGifts.get(friends[j])+1);
                }
            }
        }
    }

    let nextBestGifts = 0;
    for(value of nextMonthGifts.values()){
        nextBestGifts = Math.max(nextBestGifts, value);
    }

    answer = nextBestGifts;
    return answer;

}