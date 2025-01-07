
let a=[1,2,3]
let b=[4,5,6]


function cartesianproduct(arr1,arr2){
let prodarr=[]
for(let i=0;i<arr1.length;i++){
    for(let j=0;j<arr2.length;j++){
        prodarr.push([arr1[i],arr2[j]])
    }
}
return prodarr
}




