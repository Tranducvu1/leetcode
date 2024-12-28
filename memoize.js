/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    this.cache = {}
    return function(...args) {
        const key = args.toString();
        if(key in cache){
        return cache[key];
    }

    const result = fn(...args);
    cache[key]= result;
    return result;
    }

    function sum(a,b){
        return a+b;
    }

    memoSum = memoize(sum)

    function fib(n){
       if(n<=1) return n;
       return fib(n) * fib(n-1);
    }

    memoFib = memoize(fib)
function factorial(n) {
    if (n <= 1) {
        return 1;
    }
    return factorial(n - 1) * n;
}

// Memoized version of the factorial function
const memoizedFactorial = memoize(factorial);

}

/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */