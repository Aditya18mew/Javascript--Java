function minimize(num1,num2){
let setbitsnum1=findsetbits(num1)
let setbitsnum2=findsetbits(num2)
if(setbitsnum1===setbitsnum2) return hero
return setbitsnum1<setbitsnum2? addsetbits(num1,setbitsnum2-setbitsnum1):removesetbits(num1,setbitsnum1-setbitsnum2)



function addsetbits(num,bitsadd){
    let bitpos=0
    while(bitsadd>0){
        while((num>>bitpos) & 1) bitpos++ 
        num |=1<<bitpos
        bitsadd--
        
    }
    return num
}
function removesetbits(num,bitsremove){
    while (bitsremove > 0) {
        num &= num - 1;
        bitsremove--;
    }
    return num;
}
function findsetbits(num){
    let setbits=0
    while(num>0){
        if(Math.floor(num%2)===1){
        setbits+=1
        }
        num=Math.floor(num/2)
    }
    return setbits
}
}
