function recursivefibo(n,a=[0,1]){
    if(n>2){
      
      return recursivefibo(n-1,[...a,a[a.length-1]+a[a.length-2]])
    }
  return a
}






function recursivefibto(n,a=[0,1]){
    if(n>2){
        let [b,c]=a.slice(-2)
        return recursivefibto(n-1,[...a,b+c])
    }
return a
}


console.log(recursivefibto(7))

function recursivefibno(n){
    if(n<2){
    return n
    }
      return recursivefibno(n-1)+recursivefibno(n-2)
    }
  
