function volon(n) {
    let totalvolon = n;
    let volon = n;
    while (volon >= 10) {
        let newvolon = Math.floor(volon / 10) * 3;
        totalvolon += newvolon;
        volon = (volon % 10) ;

    }
    return totalvolon;
}
let result = volon(10);
console.log("Kết quả là:", result);