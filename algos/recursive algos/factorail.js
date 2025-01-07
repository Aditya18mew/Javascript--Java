// time complexcity O(n)

function recursivefacto(n){
if(n===0){
    return 1
}
return n*recursivefacto(n-1)
}


