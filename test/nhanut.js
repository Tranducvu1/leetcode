function nhanut(a) {
    let n = 1;
    let x = 1;
    
    while (n < a) {
        n=n+1;
        if (n * 2 < a) {
            n += (x * 2);
            a = a / 2;   
        } else {
            x = x * 1;  
            n += x;
            a = a - 1;  
        }
    }

    return n;
}

let result = nhanut(5);
console.log("Kết quả là:", result);
