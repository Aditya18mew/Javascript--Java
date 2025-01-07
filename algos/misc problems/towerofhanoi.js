function tower(n,from,to,using){
    if(n===1){
        console.log(`move the 1 disc from ${from} to ${to}`)
        return
    }
    tower(n-1,from,using,to)
    console.log(`move the ${n} disc from ${from} to ${using}`)
    tower(n-1,using,to,from)
}


tower(3,"a","b","c")