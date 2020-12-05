package test.sorting;
public class BubblesSort {
    int [] arrayInput;
   protected BubblesSort(int ... array){
        this.arrayInput = array;
    }
    public int [] getSortedArray(){
        for(int i = 0; i < this.arrayInput.length; i++){
            for (int j =i+1 ; j<this.arrayInput.length;j++){
                if(this.arrayInput[j]<this.arrayInput[i])
                {
                    int temp = this.arrayInput[j] ;
                    this.arrayInput[j]=this.arrayInput[i];
                    this.arrayInput[i]= temp;
                }
            }
        }
        return this.arrayInput;
    }


}
