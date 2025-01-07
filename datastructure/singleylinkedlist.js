class Node {
    constructor(value){
        this.value=value
        this.next=null
    }
 }

 class linkedlist{
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


    piepend(value){
       let node=new Node(value)
        if(this.isempty()){
           this.head=node
           this.tail=node
        }else{
            node.next=this.head
            this.head=node
        }
      this.size++
    }


    insert(index,value){
       if(index<0 || index>this.size){
        return
       }
       if(index===0){
        this.piepend(value)
       }else{
        let node=new Node(value)
        let inc=this.head
        for(let i=0;i<index-1;i++){
            inc=inc.next
        }
        node.next=inc.next
        inc.next=node
       }
       this.size++
    }


    append(value){
        let node=new Node(value)
        if(this.isempty()){
            this.tail=node
            this.head=node
        }else{
            this.tail.next=node
            this.tail=node
        }
        
        this.size++
        
        }

     
    removefromfront(){
        if(this.isempty()){
            return null
        }else{
            let value=this.head.value
            let curr=this.head
            this.head=this.head.next
            curr.next=null
            this.size--
            return value
        }}


    removefromend(){
        if(this.isempty()){
            return null
        }if(this.size===1){
            let value=this.tail.value
            this.tail=null
            this.head=null
            return value
        }else{
            let prev=this.head
            while(prev.next!==this.tail){
                prev=prev.next
            }
            let value=this.tail.value
            prev.next=this.tail.next
            this.tail=prev
            this.size--
            return value
            
        }}


    removeusingindex(index)
    {
        if(index<0 || index>=this.size){
            return null
        }if(index===0){
         let removenode=this.head.value
                     this.head=this.head.next
                     this.size--
                   return removenode 
        }
        else{
            let first=this.head
         
            for(let i=0;i<index-1;i++){
                first=first.next
            }
          
           let last=first.next
                first.next=last.next
           let removenode=last.value
                  last.next=null
                  this.size--
                  return removenode
        }}


    removeusingvalue(value){
        if(this.isempty()){
            return null
        }if(this.head.value===value){
            let curr=this.head
    this.head=this.head.next
    curr.next=null
    return value
        }
        else{
        let search=this.head
       
       for(let i=0;i<this.size;i++){
        if(search.value===value){
                let first=this.head
              
                 for(let j=0;j<i-1;j++){
                    first=first.next
                 }
              
              let  last=first.next
                 first.next=last.next
              let removednode=last.value
                 last.next=null
                 this.size--
                 return removednode.value
        }else{
            search=search.next
            if(i===this.size-1){
                return null

            }
        }}}}


    search(value){
        if(this.isempty()){
            return null

        }
        else{
        let search=this.head
        for(let i=0;i<this.size;i++){
            if(search.value===value){
               return `${value} is found at index:${i}`
            }else{
                search=search.next
                if(i===this.size-1){
                  return  `${value} is not found` 
                }
            }
        }
    }
    }
    reverse(){
     let prev=null
     let curr=this.head
     while(curr){
        let nex=curr.next
        curr.next=prev
        prev=curr
        curr=nex
     }
     this.head=prev
    }

    
    print(){
        if(this.isempty()){
            console.log("no value is stored")
        }
        
        let curr=this.head
        let listvalues=``
        while(curr){
            listvalues+=`${curr.value} `
            curr=curr.next
        }
        console.log(listvalues)
    }
    

        
       
 }

 
 module.exports=linkedlist

