function tamgiac(n) {
    const canh =20;
   let dodaicanhmoi = (Math.pow(2,n-1)) * canh;
    
return dodaicanhmoi;
}

let result = tamgiac(7);
console.log("Kết quả là:", result);