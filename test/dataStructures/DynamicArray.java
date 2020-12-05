package test.dataStructures;

public final class DynamicArray {

    private int [] originalArray;
    private int count;
    private int size;

   public DynamicArray(){
        originalArray = new int[5];
        this.size = 5;
    }
    public DynamicArray(int size){
        originalArray = new int[size];
        this.size = size;
    }

    public boolean addElement(int value){
        if(this.count>=this.size){
          growArrays();
        }
        originalArray[this.count] = value;
        this.count++;
        return  true;
    }

    private void growArrays() {
        int temp [] = new int[size*2];
        for (int inital =0 ;inital < this.originalArray.length;inital++){
            temp[inital] = this.originalArray[inital];
        }
        this.originalArray=temp;
        this.size= this.originalArray.length;
    }

    public void shinkArray(){
        int temp [] = new int[this.count];
        if(this.count<this.size){
            for(int init=0;init<this.count;init++){
                temp[init] = this.originalArray[init];
            }
        }
        this.originalArray = temp;
    }

    public  boolean removeAtIndex(int index){
        if(this.count-1>=index)
        {
            for (int init= index; init <this.count-1;init++){
                this.originalArray[init] = this.originalArray[init+1];
            }
            this.originalArray[this.count-1] = 0;
            this.count--;
        }
        return false;
    }
}
