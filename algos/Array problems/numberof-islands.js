

let grid=[[1,1,0,0],[1,0,0,0],[0,0,1,0],[0,0,0,1]]

function numberofislands(grid){
    let directions=[[0,1],[0,-1],[1,0],[-1,0]]
let no_of_islands=0
let visited=new Set()
    for(let i=0;i<grid.length;i++){
        for(let j=0;j<grid[i].length;j++){
            if(grid[i][j]===1 && !visited.has(`${i},${j}`)){
            let stack=[[i,j]]
            visited.add(`${i},${j}`)
            no_of_islands++
           while(stack.length>0){
            let [a,b]=stack.pop()
            for(let k=0;k<directions.length;k++){
                let newi=a+directions[k][0]
                let newj=b+directions[k][1]
                if(newi>=0 && newj>=0 && newi<grid.length && newj<grid[0].length && grid[newi][newj]===1 && !visited.has(`${newi},${newj}`)){
                    stack.push([newi,newj])
                    visited.add(`${newi},${newj}`)
                }
            }
           }
            }
        }
    }
    return no_of_islands
}

console.log(numberofislands(grid))