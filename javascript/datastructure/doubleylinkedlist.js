

class Node{
    constructor(value){
this.value=value
this.next=null
this.prev=null
    }
}



class doubleylinkedlist{
    constructor(){
        this.head=null
        this.tail=null
        this.size=0

    }

    isempty(){
        return this.size===0
    }
    getsize(){
        return this.size
    }
    prepend(value){
        let node=new Node(value)
        if(this.isempty()){
            this.head=node
            this.tail=node
        }else{
            node.next=this.head
            this.head.prev=node
            this.head=node
        }
        this.size++
    }
    removefromstart(){
        let value=0
        if(this.isempty()){
            return
        }
        
        if(this.size===1){
            value=this.head.value
            this.head=null
            this.tail=null
           
        }else{
            value=this.head.value
            let curr=this.head
            this.head=this.head.next
            curr.next=null
            this.head.prev=null  

        }
        this.size--
        return value
    }
    insert(index,value){
        if(index<0 || index>this.size){
            return 
        }
        if(index===0){
            this.prepend(value)
        }else{
            let node=new Node(value)
            let curr=this.head
            for(let i=0;i<index-1;i++){
                  curr=curr.next
            }
            let temp=curr.next
            curr.next=node
            node.prev=curr
            node.next=temp
            temp.prev=node
            this.size++
        }
    }
    removefromindex(index){
        if(index<0 || index>=this.size){
            return
        }
        if(index===0){
            this.removefromstart()
        }
        if(index===this.size-1){
            this.removefromend()
        } else{
            let curr=this.head
            for(let i=0;i<index-1;i++){
     curr=curr.next
            }
            let temp=curr.next
            let removed=curr.next
            temp=temp.next
            curr.next=temp
            temp.prev=curr
           removed.next=null
           removed.prev=null
           this.size--
        }
    }
    get(index){
      if(index<0 ||index>this.size-1){
        return console.log("index doesn't exist")
      }
      if(index===0){
        console.log(this.head.value)
        return this.head.value
      }else{
        let trav=this.head
        for(let i=0;i<index-1;i++){
            trav=trav.next
        }
              trav=trav.next
              console.log(trav.value)
              return trav.value
      }
      

    }
    sort(){
        let curr=this.head
        while(curr){ 
            let ahead=curr.next
            while(ahead){
                if(curr.value>ahead.value){
                    let temp=ahead.value
                    ahead.value=curr.value
                    curr.value=temp  
                }
                ahead=ahead.next
            }
            curr=curr.next
        }
    }

    append(value){
        let node=new Node(value)
        if(this.isempty()){
            
            this.head=node
            this.tail=node
        }else{
            node.prev=this.tail
            this.tail.next=node
            this.tail=node
        }
   this.size++
    }
    removefromend(){
        if(this.isempty()){
            return
        }
        let value=0
        if(this.getsize()===1){
            value=this.head.value
            this.head=null
            this.tail=null
        }else{
            value=this.tail.value
            this.tail=this.tail.prev
            this.tail.next=null
        }
        this.size--
        return value
    }
    print(){
        let curr=this.head
        let temp=""
        while(curr){
            temp+=`${curr.value} `
            curr=curr.next
        }
        console.log(temp)

    }
    printreverse(){
        let curr=this.tail
        let temp=""
        while(curr){
            temp+=`${curr.value} `
            curr=curr.prev
        }
        console.log(temp)
    }
}


module.exports=doubleylinkedlist







