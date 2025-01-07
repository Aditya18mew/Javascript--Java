
//time complexcity O(log n)

function power(n){

while(n>=2){
    if(n===2){
        return true
    }
    n=n/2
    
}
    return false
}


console.log(power(35))

// time complexcity O(1)

function bitwisepowercheck(n){
    if(n<1){
        return false
    }
    return (n & n-1 & n-2 )===0
}


console.log(bitwisepowercheck(27))
