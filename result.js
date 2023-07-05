var ansMap = new Array(55);

var ptsMap = new Array(55);

ansMap[0] = '43';

ptsMap[0] = 1;

ansMap[1] = '43';

ptsMap[1] = 1;

ansMap[2] = '40';

ptsMap[2] = 1;

ansMap[3] = '47';

ptsMap[3] = 1;

ansMap[4] = '47';

ptsMap[4] = 1;

ansMap[5] = '42';

ptsMap[5] = 1;

ansMap[6] = '43';

ptsMap[6] = 1;

ansMap[7] = '4b';

ptsMap[7] = 1;

ansMap[8] = '48';

ptsMap[8] = 1;

ansMap[9] = '49';

ptsMap[9] = 1;

ansMap[10] = '4f';

ptsMap[10] = 1;

ansMap[11] = '4e';

ptsMap[11] = 1;

ansMap[12] = '4f';

ptsMap[12] = 1;

ansMap[13] = '4a';

ptsMap[13] = 1;

ansMap[14] = '4d';

ptsMap[14] = 1;

ansMap[15] = '54';

ptsMap[15] = 1;

ansMap[16] = '53';

ptsMap[16] = 1;

ansMap[17] = '53';

ptsMap[17] = 1;

ansMap[18] = '51';

ptsMap[18] = 1;

ansMap[19] = '56';

ptsMap[19] = 1;

ansMap[20] = '51';

ptsMap[20] = 1;

ansMap[21] = '57';

ptsMap[21] = 1;

ansMap[22] = '54';

ptsMap[22] = 1;

ansMap[23] = '5a';

ptsMap[23] = 1;

ansMap[24] = '5d';

ptsMap[24] = 1;

ansMap[25] = '58';

ptsMap[25] = 1;

ansMap[26] = '59';

ptsMap[26] = 1;

ansMap[27] = '5e';

ptsMap[27] = 1;

ansMap[28] = '5c';

ptsMap[28] = 1;

ansMap[29] = '5d';

ptsMap[29] = 1;

ansMap[30] = '5d';

ptsMap[30] = 1;

ansMap[31] = '43';

ptsMap[31] = 1;

ansMap[32] = '41';

ptsMap[32] = 1;

ansMap[33] = '42';

ptsMap[33] = 1;

ansMap[34] = '47';

ptsMap[34] = 1;

ansMap[35] = '47';

ptsMap[35] = 1;

ansMap[36] = '42';

ptsMap[36] = 1;

ansMap[37] = '43';

ptsMap[37] = 1;

ansMap[38] = '4a';

ptsMap[38] = 1;

ansMap[39] = '4b';

ptsMap[39] = 1;

ansMap[40] = '4b';

ptsMap[40] = 1;

ansMap[41] = '48';

ptsMap[41] = 1;

ansMap[42] = '48';

ptsMap[42] = 1;

ansMap[43] = '4c';

ptsMap[43] = 1;

ansMap[44] = '4d';

ptsMap[44] = 1;

ansMap[45] = '4c';

ptsMap[45] = 1;

ansMap[46] = '52';

ptsMap[46] = 1;

ansMap[47] = '53';

ptsMap[47] = 1;

ansMap[48] = '53';

ptsMap[48] = 1;

ansMap[49] = '57';

ptsMap[49] = 1;

ansMap[50] = '57';

ptsMap[50] = 1;

ansMap[51] = '54';

ptsMap[51] = 1;

ansMap[52] = '54';

ptsMap[52] = 1;

ansMap[53] = '55';

ptsMap[53] = 1;

ansMap[54] = '5a';

ptsMap[54] = 1;


function TranslateAnswer(s, answerIndex) {

    var value;

    var newString;

    var code;

    var i;



    value = (answerIndex % 31) + 1;

    newString = "";

    for (i = 0; i < s.length; i += 2) {

        code = parseInt(s.substring(i, i + 2), 16);

        newString += String.fromCharCode(code ^ value);

    }


    console.log((answerIndex+1)+" Answer:", newString)
    return (newString);

}

function getAswers(){
    ansMap.forEach((s,index) => {
        TranslateAnswer(s,index)
    });
}

getAswers()