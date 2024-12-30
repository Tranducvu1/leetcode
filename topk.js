/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    const map = new Map()
    for(let num of nums){
        map.set(num, (map.get(num) || 0 )+1);
    }
    const sortArray = Array.from(map.entries())
    sortArray.sort((a,b) => b[1] - a[1])
    return sortArray.slice(0,k).map(item => item[0])
};