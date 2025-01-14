/* Given a string s, return the longest palindromic substring in s. */

let longestPalindrome = function(s) {
    let str=""
    let [startindex,endindex]=getindex(s)
    for(let i=startindex;i<=endindex;i++){
        str+=s[i]
    }
    return str
    
    
    function getindex(s){
    let index=[0,0]
    for(let i=0;i<s.length;i++){
        let startindex=i
        let endindex=i
        while(startindex>=0 && endindex<s.length && s[startindex]===s[endindex]){
          if(endindex-startindex>index[1]-index[0]){
             index[0]=startindex
             index[1]=endindex
          }
          startindex--
          endindex++
        }
        startindex=i
        endindex=i+1
        while(startindex>=0 && endindex<s.length && s[startindex]===s[endindex]){
          if(endindex-startindex>index[1]-index[0]){
              index[0]=startindex
              index[1]=endindex
           }
           startindex--
           endindex++
        }
        }
    return index
    }
    };