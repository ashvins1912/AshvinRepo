package test.hackerEarthProb;

/**
 * You are given a binary string, (string which contains 0's and 1's), You have to perform several operations on this string, in one operation choose a non-empty even length substring containing only 0's or only 1's and remove it from the string.
 *
 * Your goal is to minimize the final length of the string after performing several operations.It is possible that the final string may become empty, in that case print "KHALI" without quotes.
 *
 * And it can be proved that there is always an unique string with minimal length after performing the operations.
 *
 * Input:
 *
 * First line of input contains an intger T denoting number of testcases.
 * Next T lines of input contains a binary string S.
 * Output:
 *
 * for each testcase print the required minimal string.
 *SAMPLE INPUT
 * 2
 * 101001
 * 1001
 * SAMPLE OUTPUT
 * 10
 * KHALI
 *
 * */

public class TestCode {

    public static void main(String[] args) {

    }


    public String  getEvenArrays(String str){
        StringBuilder temString =  new StringBuilder();
        char[] array = str.toCharArray();
        if(array.length <= 0 || array.length<=2){
            //System.out.println(str);
            return"";
        }
        else {
            for(int i=0;i<array.length-1;){
                System.out.println(i);
                int start  = array[i];
                int end =  array[++i];
                if(start !=end){
                    temString.append(start).append(end);
                }
            }

        }
        return getEvenArrays(temString.toString());
    }
}
