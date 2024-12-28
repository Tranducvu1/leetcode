//cach 1 dùng chuỗi sắp xếp
/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const map = new Map()

    
    for(let str of strs ){
        const anagramsort = str.split('').sort().join('')
        
    if(!map.has(anagramsort)){
         map.set(anagramsort,[])
    }
    map.get(anagramsort).push(str);
    
    }
    return Array.from(map.values())
};

//cach 2 Sử dụng một mảng đếm tần suất của các ký tự trong chuỗi
/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const map = new Map()

    for(let str of strs ){
    const chartcount = new Array(26).fill(0)

       for(let char of str){
         chartcount[char.charCodeAt(0) - 97]++;
    }
    const key = chartcount.toString();
        
    if(!map.has(key)){
         map.set(key,[])
    }
    map.get(key).push(str);
    
    }
    return Array.from(map.values())
};