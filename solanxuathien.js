function countDigitOne(n) {
    let count = 0;
    for (let i = 1; i <= n; i++) {
        count += i.toString().split('').filter(digit => digit === '1').length;
    }
    return count;
}
let result = countDigitOne(13);
console.log(result); // 6