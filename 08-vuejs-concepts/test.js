function finMax(nums){
    let max = Number.NEGATIVE_INFINITY
    for(let num of nums){
        if(num > max)
            max = num
    }
    console.log(max)
    return max
}
finMax([,1,2,3,4])