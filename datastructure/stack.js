let doubleylinkedlist=require("./doubleylinkedlist")
//stack filo


class stack{

   constructor(){
    this.stacklist=new doubleylinkedlist()
   }


   set(value){
    this.stacklist.append(value)
   }
   remove(){
    this.stacklist.removefromend()
   }
   print(){
    this.stacklist.print()
   }
   isempty(){
    this.stacklist.isempty()
   }
   getsize(){
    this.stacklist.getsize()
   }
   get(index){
    this.stacklist.get(index)
   }
}


let linkedlist=require("./singleylinkedlist") 

 class linkedliststack{
    constructor(){
        this.list=new linkedlist()
    }

push(value){
    this.list.append(value)
}
pop(){
    this.list.removefromend()
}
peek(){
  return  this.list.head.value
}
print(){
    this.list.print()
}
isempty(){
    return this.list.isempty()
}
getsize(){
    return this.list.getsize()
}

}