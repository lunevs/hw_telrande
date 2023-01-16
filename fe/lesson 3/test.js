const lengthOfLastWord = function(s) {
    console.log(s);
    let wordLen = -1;
    let i = 0;
    for (i = s.length-1; i >= 0; i--) {
        if (s[i] === " ") {
            if (wordLen !== -1) {
                wordLen -= i;
                break;
            }
        } else {
            if (wordLen === -1) {
                wordLen = i;
            }
        }
    }
    console.log(i);
    if (i === -1)
        return wordLen + 1;
    else
        return wordLen;
};

console.log(lengthOfLastWord("Hello World"))
console.log(lengthOfLastWord("   fly me   to   the moon  "))
console.log(lengthOfLastWord("luffy is still joyboy"))
console.log(lengthOfLastWord("a"))