class queues{
    constructor(){
        this.array=[] 
    }


    enqueue(value){
        this.array.push(value)
    }
    dequeue(){
        this.array.shift()
    }
    size(){
        return this.array.length
    }
    isempty(){
       if( this.array.length===0)
       {
        return true
       }else{
        return false
       }
    }
    print(){
        for(let i in this.array){
            console.log(this.array[i])
        }
    }
}




class queued{
    constructor(){
  this.items={}
  this.end=0
  this.front=0
    }

    enqueue(value){
        this.items[this.end]=value
        this.end++
    }
    dequeue(){
      let item=  this.items[this.front]
       delete this.items[this.front]
       this.front++
       return item
    }

    isempty(){
        return this.end-this.front===0
    }
    size(){
        return this.end-this.front
    }
    peek(){
        return this.items[this.front]
    }
    print(){
        console.log(this.items)
    }
}

module.exports=queued



let doubleylinkedlist=require("./doubleylinkedlist")

class queue{
    constructor(){
        this.queuelist=new doubleylinkedlist()
    }

    set(value){
         this.queuelist.append(value)
    }
    remove(){
        this.queuelist.removefromstart()
    }
    isempty(){
        this.queuelist.isempty()
    }
    getsize(){
        this.queuelist.getsize()
    }
    print(){
        this.queuelist.print()
    }
    get(index){
        this.queuelist.get(index)
    }
}



let linkedlist= require("./singleylinkedlist")
class linkedqueue{
    constructor(){
        this.list=new linkedlist()
    }
    push(value){
        this.list.append(value)
    }
    isempty(){
        return this.list.isempty()
    }
    getsize(){
        return this.list.getsize()
    }
    print(){
    this.list.print()
    }
    peek(){
        return this.list.head.value
    }
    shift(){
        this.list.removefromfront()
    }

}

let list=new linkedqueue()
