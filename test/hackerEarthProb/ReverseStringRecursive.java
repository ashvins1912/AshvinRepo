package test.hackerEarthProb;

public class ReverseStringRecursive {

    public char [] getReversed(char [] ch , int str,int end){
        if(end <= 0){
            return ch;
        }
        else{
            char temp  = ch[str];
            ch[str] = ch[end];
            ch[end]=temp;
            return getReversed(ch,++
                    str,--end);
        }

    }
}
