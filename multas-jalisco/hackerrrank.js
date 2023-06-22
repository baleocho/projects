function timeConversion(s) {
    let hourFormatted = s.toString().slice(0, -2)
    let isAmOrPm = s.toString().slice(-2)
    let hourFormattedSplitted = hourFormatted.split(":")
    
    if(isAmOrPm == "PM")
        if(hourFormattedSplitted[0] != "12")
            hourFormattedSplitted[0] = parseInt(hourFormattedSplitted[0]) + 12
    
    if(isAmOrPm == "AM" && hourFormattedSplitted[0] == "12")
        hourFormattedSplitted[0] = "00"
    
    console.log( hourFormattedSplitted.join(":"))
}

function findMedian(arr) {
    // Write your code here
    arr.sort()
    if(arr.length % 2 != 0){
        console.log(arr[((arr.length - 1) / 2)] )
    }
    console.log( (arr[((arr.length) / 2)] + arr[((arr.length) / 2) -1]) / 2)

    console.log(arr)

}

findMedian([5,3,1,2,4,6])