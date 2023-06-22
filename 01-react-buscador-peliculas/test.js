// const ROMANOS = { 'X': 10, "XI": 9, "V": 5, "VI": 4, "I": 1 }

// const convertToRomanFromNumbers = (number) => {
//     let localNumber = number
//     let romano = []
//     Object.keys(ROMANOS).forEach(key => {
//         while (localNumber >= ROMANOS[key]) {
//             romano.push(key)
//             localNumber = localNumber - ROMANOS[key]
//         }
//     })
//     console.log("romano ", romano)
// }

// convertToRomanFromNumbers(39)

// const myFunction = () => {

// }

// const convertToNumbersFromRoman = (roman) => {
//     let arrRoman = roman.split("");
//     let finalSum = 0;
//     while(arrRoman.length > 0){
//         let roman = arrRoman.shift()
//         if(ROMANOS.hasOwnProperty(roman))
//             finalSum = finalSum + ROMANOS[roman]
//     }
//     console.log(finalSum)
//     return finalSum 
// }
// convertToNumbersFromRoman('VII')

// // Test Cases
// describe("convertToNumbersFromRoman", () => {
//     it("should convert 'X' to 10", () => {
//       expect(convertToNumbersFromRoman("X")).toBe(10);
//     });
  
//     it("should convert 'XI' to 11", () => {
//       expect(convertToNumbersFromRoman("XI")).toBe(11);
//     });
  
//     it("should convert 'V' to 5", () => {
//       expect(convertToNumbersFromRoman("V")).toBe(5);
//     });
  
//     it("should convert 'VI' to 6", () => {
//       expect(convertToNumbersFromRoman("VI")).toBe(6);
//     });
  
//     it("should convert 'I' to 1", () => {
//       expect(convertToNumbersFromRoman("I")).toBe(1);
//     });
// });

const myArr = [1,2,3,4]
const intToString = "1"
const myString = ""+myArr

console.log("My arr String", ""+myString)
console.log("My arr ", myArr)
console.log("My int to string ", intToString, +intToString)