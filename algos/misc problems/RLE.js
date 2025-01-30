function RLE(n){
    let ogstr="1"
    for(let i=1;i<n;i++){
        let count=1
        let newstr=""
        for(let j=0;j<ogstr.length;j++){
            if(j+1<ogstr.length && ogstr[j+1]===ogstr[j]){
                count++
            }else{
                newstr+=`${count}${ogstr[j]}`
                count=1
            }
        }
        ogstr=newstr
    }
    return ogstr
}

