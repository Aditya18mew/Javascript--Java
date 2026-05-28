const stringMatching = function(words) {
    let newarr=[]
    for(let i=0;i<words.length;i++){
        for(let j=0;j<words.length;j++){
            if(issubstring(words[j],words[i]) && i!==j){
                if(!newarr.includes(words[i])){
                    newarr.push(words[i])
                }
            }
        }
    }

    return newarr

    function issubstring(s1,s2){
        for(let i=0;i<=s1.length-s2.length;i++){
            let check=true
            for(let j=0;j<s2.length;j++){
                if(s1[i+j]!==s2[j]){
                    check=false
                    break
                }
            }
            if(check) return true
        }
       return false
        
    }  
};