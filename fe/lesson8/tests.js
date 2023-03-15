const arr = [];
for (let i=0; i<5; i++) {
    arr.push(Math.floor(Math.random() * 100) - 50);
}
console.log(arr);
console.log(arr.filter(el => !(el%2)).reduce((acc, val) => acc + val, 0))


const generate = function(numRows) {
    let arr = [[1]];
    for (let i=1; i<numRows; i++) {
        let tmpRow = [0, ...arr[i-1], 0];
        let innerArr = [];
        for (let j=0; j<tmpRow.length-1; j++) {
            innerArr.push(tmpRow[j] + tmpRow[j+1]);
        }
        arr.push(innerArr);
    }
    return arr;
};
console.log(generate(5));