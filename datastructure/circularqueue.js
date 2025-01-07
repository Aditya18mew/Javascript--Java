
class circularqueue{
    constructor(capacity){
      this.items=new Array(capacity)
        this.capacity=capacity
        this.length=0
    }
    enqueue(value){
        this.items.push(value)
        this.length++
    }
    dequeue(){
        let item=this.items.shift()
        this.length--
        return item
    }

    isfull(){
       return this.length===this.capacity
    }
    print(){
        console.log(this.items)
    }
    peek(){
        if(this.items.length!==0){
            return this.items[0]
        }else{
            return null
        }
    }
}
