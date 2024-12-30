
var MinStack = function() {
    this.stack = [];
    this.MinStack = []
};

/** 
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function(val) {
    this.stack.push(val);
    if(this.MinStack.length === 0 || val <= this.MinStack[this.MinStack.length -1]){
        this.MinStack.push(val);
    }
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
    let min = this.stack.pop();
    if(min === this.MinStack[this.MinStack.length -1]){
        this.MinStack.pop()
    }
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
    return this.stack[this.stack.length -1]
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
    return this.MinStack[this.MinStack.length -1]
};

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */