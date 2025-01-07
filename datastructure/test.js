const linkedlist =require("./singleylinkedlist")



let her=new linkedlist()


her.append(2)
her.append(6)
her.append(1)
her.append(0)
her.append(4)
her.print()


var insertionSortList = function(head) {
    let a=[]
    let curr=head
    while(curr){
     a.push(curr.value)
     curr=curr.next
    }
 
    for(let i=1;i<a.length;i++){
     let hell=a[i]
     let j=i-1
     while(j>=0 && hell<a[j]){
         a[j+1]=a[j]
         j--
     }
     a[j+1]=hell
    }
 curr=head
    for(let i=0;i<a.length;i++){
     curr.value=a[i]
     curr=curr.next
    }
 
    return head
}






curr=sortList(her.head)

while(curr){
    console.log(curr.value)
    curr=curr.next
}


