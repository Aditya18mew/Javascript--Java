function  punishmentnumber(n){
    let sum=0
    for(let i=1;i<=n;i++){
        let Square=i*i
        if(canpartition(Square,i)){
            sum+=Square
        }
    }
    return  sum
    
    function  canpartition( num,target){
       if(num<target || target< 0){
        return false
       }
       if(num===target){
        return true
       }
       return (canpartition(Math.floor(num/10),target-(num%10)) || canpartition(Math.floor(num/100),target-(num%100)) || canpartition(Math.floor(num/1000),target-(num%1000)))
    }
    
    }
  console.log(  punishmentnumber(37))