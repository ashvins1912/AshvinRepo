package com.test.DataStruct;
 /**
  * push:It is used to add the element to the top of the stack. The size of the stack will be increased by 1 with every added element.
  *
  * pop: It is used to delete the element from the top of the stack and returns the deleted object. This size of the stack is decreased by 1 with every deleted element.
  *
  * isEmpty: It is used to check if Stack is empty or not.
  *
  * isFull: It is used to Check if Stack is full or not.
  *
  * peek: It is same as that of pop but it doesn't remove the top element and just returns it.
  *
  * **/
public class MyStack {

    private int [] arrays;
    private int topIndex;
    private int size;
    public MyStack () {
         this.arrays= new int[5];
         this.topIndex=-1;
         this.size=5;
     }
    private void growStack(int lenght){
        int growBy =lenght*2;
        int tmp[] = new int[growBy];

        for(int i= 0 ; i <lenght-1;i++){
            tmp[i] = this.arrays[i];
        }
        this.arrays=tmp;
        this.size=growBy;
     }
   public  void push(int value){
       ++this.topIndex;
        if(this.topIndex>=this.size-1){
            growStack(this.arrays.length);
        }
       this.arrays[this.topIndex] = value;
   }
     public  void pop(){
         removeFromIndex(this.topIndex);
     }


     public  boolean isEmpty (){
        return this.topIndex>-1?false:true;
     }
   public void showStack() {
        for (int init=0;init<=this.topIndex;init++){
            System.out.print(this.arrays[init]+"\t");
        }

   }

     public int peek() {
          if(this.topIndex<0){
              System.out.println("Empty Stack");
          }
          else{
              System.out.println(this.arrays[this.topIndex]);
          return this.arrays[this.topIndex];
          }
          return -1;
     }

     private void  resizeStack(int index){
        if (index>-1 && index<=this.topIndex){
            for(int init=index;init<=this.topIndex;){
                this.arrays[init]= this.arrays[++init];
            }
            this.topIndex--;
        }
     }
     public boolean removeFromIndex(int index) {
         if(this.topIndex<0 || index<0){
             System.out.println("No Value in Stack on "+index);
         }
         if( index>-1 && index>this.topIndex){
             System.out.println("No Value in Stack on "+index);
         }
         else{
             resizeStack(index);
             return true;
         }
         return false;
     }


}
