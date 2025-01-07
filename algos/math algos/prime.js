// time complexcity O(sqrt(n))

function prime(n){
    if(n<2){
        return false
    }
    for(let i=2;i<=Math.sqrt(n);i++){
        if(n%i===0){
            return false
        }
    }
    return true
}



console.log(prime(9))


//time complexcity O(n)
function primes(n){
    if(n<2){
        return false
    }
    for(let i=2;i<n;i++){
        if(n%i===0){
            return false
        }
    }
    return true
}