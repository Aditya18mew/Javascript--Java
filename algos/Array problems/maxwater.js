function maxarea(height){
    let maxwater=0
    let x=0
    let y=height.length-1
    while(x<y){
        maxwater=Math.max(maxwater,Math.min(height[x],height[y])*(y-x))
        if(height[x]<=height[y]){
            x++
        }else{
            y--
        }
    }
    return maxwater
}