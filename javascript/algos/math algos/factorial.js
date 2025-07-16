
// time complexcity O(n)

function fact(n){
    if(n<0){
        return "n should be positive real number"
    }
    if(n===0){
        return 1
    }
    let facto=1
for(let i=1;i<=n;i++){
   facto=facto*i
}
   return facto
}




