/**
 * @param {string[]} tokens
 * @return {number}
 */
var evalRPN = function(tokens) {
    this.stack = [];
    for(let i=0;i< tokens.length ; i++){
        let token = tokens[i];
        if (!['+', '-', '*', '/'].includes(token)) {
             stack.push(parseInt(token));
        } else{
             let num2 = stack.pop();
            let num1 = stack.pop(); 
            if (token === '+') result = num1 + num2;
            if (token === '-') result = num1 - num2;
            if (token === '*') result = num1 * num2;
            if (token === '/') result = Math.trunc(num1 / num2); 
            stack.push(result);
        }
    }
   return stack.pop()
};