//  time complexcity O(n*n)

function fibo(n){
    let a=[0,1]
let str=""
for(let i=0;i<n;i++){
    let [b,c]=a.slice(-2)
    str+=b+" "
   a.push(c)
   a.push(b+c)

}
return str

}



console.log(fibo(7))

  // time complexcity O(n)

function fibono(n){
    let a=[0,1]
    for(let i=2;i<n;i++){
        a[i]=a[i-1]+a[i-2]
    }
    return a

}










