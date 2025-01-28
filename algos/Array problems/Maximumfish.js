
/* You are given a 0-indexed 2D matrix grid of size m x n, where (r, c) represents:

A land cell if grid[r][c] = 0, or
A water cell containing grid[r][c] fish, if grid[r][c] > 0.
A fisher can start at any water cell (r, c) and can do the following operations any number of times:

Catch all the fish at cell (r, c), or
Move to any adjacent water cell.
Return the maximum number of fish the fisher can catch if he chooses his starting cell optimally, or 0 if no water cell exists.

An adjacent cell of the cell (r, c), is one of the cells (r, c + 1), (r, c - 1), (r + 1, c) or (r - 1, c) if it exists. */

 




function findMaxFish(grid) {
    let direction = [[0,1], [0,-1], [1,0], [-1,0]];
    let maximumfish = 0;

  for(let i=0;i<grid.length;i++){
    for(let j=0;j<grid[i].length;j++){
        if(grid[i][j]>0){
            let stack=[[i,j]]
            let visited=new Set()
           let  fishcollected=0
           while(stack.length>0){
            let [x,y]=stack.pop()
            let key=`${x},${y}`
            if(!visited.has(key)){
                fishcollected+=grid[x][y]
                visited.add(key)
            }
            for(let k=0;k<4;k++){
                let newx=x+direction[k][0]
                let newy=y+direction[k][1]
                if(newx>=0 && newy>=0 && newx<grid.length && newy<grid[i].length && grid[newx][newy]>0 && !visited.has(`${newx},${newy}`)){
                    stack.push([newx,newy])
                }
            }
           }
          maximumfish=Math.max(maximumfish,fishcollected)
        }
    }
  }

    return maximumfish;
}