let words1 = ["amazon","apple","facebook","google","leetcode"]
let words2 = ["lo","eo"]

function checkStringsubset(words1,words2){
let output=[]
function freqmap(word){
    let localmap=new Map()
    for(let i=0;i<word.length;i++){
        localmap.set(word[i],(localmap.get(word[i]) || 0)+1)
    }
    return localmap
}


let words2map=new Map()
for(let i=0;i<words2.length;i++){
    let localmap=freqmap(words2[i])
for(let [char,freq] of localmap){
    words2map.set(char,Math.max(words2map.get(char) || 0,freq))
} 
}

for(let i=0;i<words1.length;i++){
    let localmap=freqmap(words1[i])
  let isuniversal=true
  for(let [char,freq] of words2map){
    if((localmap.get(char) || 0)<freq){
isuniversal=false
break;
    }
  }
  if(isuniversal){
    output.push(words1[i])
  }
}
return output
}


console.log(checkStringsubset(words1,words2))