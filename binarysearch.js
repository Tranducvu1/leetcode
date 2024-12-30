/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let low = 0;
    let hight = nums.length - 1;
    while(low <= hight){
        let mid = Math.floor((low+hight) /2);
        if(nums[mid] === target){
            return mid;
        }
        if(nums[mid] < target){
            low = mid +1;
        } else {
            hight = mid -1;
        }
    }
      return -1;
};