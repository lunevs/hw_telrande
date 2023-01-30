const utils = [
    {
        id: 1,
        name: "sdf sdfsdf sd",
        number: 2342342,
        meaning: " dgdfgdjfhg dfhg dhfg dfgd fgdf gdkfh gdjf gdhfg dhf gdhfk gdkf gdjf jdhf gdfkdgjf gjdf jdf gdhf ghdf gdkfgd fgj dfgh dfgdk fg djfgdfgk"
    },
    {
        id: 2,
        name: "df dsdfsd fs df sd",
        number: 345345,
        meaning: " dgdfgdjfhg dfhg dhfg dfgd fgdf gdkfh gdjf gdhfg dhf gdhfk gdkf gdjf jdhf gdfkdgjf gjdf jdf gdhf ghdf gdkfgd fgj dfgh dfgdk fg djfgdfgk"
    },
    {
        id: 3,
        name: "hjkhj hjk hjkhjkh",
        number: 8686786,
        meaning: " dgdfgdjfhg dfhg dhfg dfgd fgdf gdkfh gdjf gdhfg dhf gdhfk gdkf gdjf jdhf gdfkdgjf gjdf jdf gdhf ghdf gdkfgd fgj dfgh dfgdk fg djfgdfgk"
    },
    {
        id: 4,
        name: "tbtbtbt  tbtbt bt bt bt ",
        number: 96456,
        meaning: " dgdfgdjfhg dfhg dhfg dfgd fgdf gdkfh gdjf gdhfg dhf gdhfk gdkf gdjf jdhf gdfkdgjf gjdf jdf gdhf ghdf gdkfgd fgj dfgh dfgdk fg djfgdfgk"
    },
    {
        id: 5,
        name: "uyiyuiyuiyu u yu iyuiyu i",
        number: 4567686786,
        meaning: " dgdfgdjfhg dfhg dhfg dfgd fgdf gdkfh gdjf gdhfg dhf gdhfk gdkf gdjf jdhf gdfkdgjf gjdf jdf gdhf ghdf gdkfgd fgj dfgh dfgdk fg djfgdfgk"
    },
];

const newArr = utils.map(el => {
    return {
        ...el,
        meaning: el.meaning.substring(0, 10)
    }
});
console.log(newArr)

let i = 10
while ( i --> 0 ) {
    console.log(i)
}