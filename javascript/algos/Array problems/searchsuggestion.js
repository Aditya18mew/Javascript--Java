


function sani(searchword,products){
    let res=[];
    products.sort()

    let l=0;
    let r=products.length-1;

    for(let i=0;i<searchword.length;i++){
        let c=searchword[i];
     while(l<=r && (products[l].length<=i || products[l][i]!==c)){
        l++;
     }
     while(l<=r && (products[r].length<=i || products[r][i]!==c)){
        r--;
     }
     let remain=r-l+2
     let list=products.slice(l,l+Math.min(3,remain))
    
     res.push(list)

    }
    return res
}


let products=["mobile","mouse","moneypot","monitor","mousepad"]
let searchword="mouse"

console.log(sani(searchword,products))