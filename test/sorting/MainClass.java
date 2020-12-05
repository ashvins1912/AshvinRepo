package test.sorting;

public class MainClass {
 public static void main(String[] args) {
  int [] arrays = IOUtilsOnArrays.getUnsortedInput();
  System.out.println("unsorted input : > ");
  IOUtilsOnArrays.showArrays(arrays);
  BubblesSort bubblesSort =  new BubblesSort(arrays);
  arrays = bubblesSort.getSortedArray();
  System.out.println("sorted by bubble : > ");
  IOUtilsOnArrays.showArrays(arrays);

 }
}
