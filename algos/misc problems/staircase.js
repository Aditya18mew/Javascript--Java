

function staircase(n){
    if(n===2) return 2
    if(n===1) return 1
    if(n>1) return staircase(n-1)+staircase(n-2)

    
    
}

console.log(staircase(6))