/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    if(s.lenngth === " ") return false;
    let charLenght = s.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();
    let revserse = charLenght.split('').reverse().join('')
   return charLenght === revserse;
};