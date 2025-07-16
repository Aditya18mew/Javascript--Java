
//set -cannot contain duplicate values,no insertion order 


let set=new Set()

set.add()  // to add values
set.delete() // to delete
set.has() // to check if that value  exist
set.size  // gives size of set
set.clear() // to clear all


//many more 


//map

let mp=new Map()

mp.set(1,"a")
mp.set(2,"b") ///to set sometihng to map by giviny two parmaeter key and value
mp.get()  // to get something using key
mp.delete() //to delete any value using key
mp.size // to know the size of map
mp.clear()  // to clear all




let hashtable=require('./datastructure');

class map{
    constructor(size){
        this.minimap=new hashtable(size)
    }

   set(key,value){
    this.minimap.set(key,value)
   }
   get(key){
   console.log(this.minimap.get(key))
   }
   remove(key){
    this.minimap.remove(key)
   }
   display(){
    this.minimap.display()
   }

}










   


 





















