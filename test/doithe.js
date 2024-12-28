function doikeo(n) {
    let numberSweet = n; 
    let cards = n;

    while (cards >= 10) {
      let numbernewSweet = Math.floor(cards / 10) * 2;
        numberSweet += numbernewSweet;
        cards = (cards % 10) ;
    }

    return numberSweet;
}


let result = doikeo(15); 
console.log("Kết quả là:", result);
