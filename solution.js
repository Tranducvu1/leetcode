function solution(A){
    let count =0;
    const n = A.length;
    let used = new Array(n).fill(false);
    for(let i = 0; i < n; i++){
   if(!used[i]){
    let current = A[i];
    let next = A[(i+1) % n];
if(!used[(i+1) % n] && (current + next) % 2 === 0){
    count++;
    used[i] = true;
    used[(i+1) % n] = true;
    }
   }
    }
    return count;

}
// Time complexity: O(n)
// Space complexity: O(1)
let result = solution([4 ,2 ,5 ,8 ,7 ,3 ,7]);
console.log(result); // 2