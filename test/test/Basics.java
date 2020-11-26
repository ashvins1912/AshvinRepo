package com.test.test;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
public final class Basics {
    static  char count[] = new char[256];
  static Predicate<Integer> checkEven= (number) -> number%2==0;
  static  UnaryOperator<Integer> squerRoot = (number) -> number*number;

   public static void main(String[] args) {
       String test = "abcdefghac";
       int number =  indexOfUnique(test);
       System.out.println("Non Repeated Char : "+test.charAt(number));
       System.out.println("Pridicate to check value Even of Not : "+checkEven.test(2));
        System.out.println("Square of Number 3 : "+ squerRoot.apply(3));
       int[] arry = {1,2,3,4,5,6,7,8};
       System.out.println("Array Sum of Index with Values ::: ");
       for(int i =0; i< arry.length;i++){
           for(int j=0 ; j<arry.length;j++){
               if(i==j) continue;
               if(arry[i]+ arry[j] == arry.length){
                   System.out.println("values :  " + arry[i] +" + "+ arry[j]);
               }
           }
       }

   }

static void getCharInArray(String str) {
    for (int i = 0; i < str.length(); i++) {
        count[str.charAt(i)]++;
    }
}
    static int indexOfUnique(String str)
    {
        getCharInArray(str);
        int index = -1, i;
        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }

        return index;
    }
}
