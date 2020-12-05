package test.test;
public class RemovesInWordBetweenChars {

    public static void main(String[] args) {
        String  name = "PROFESSOR";
        char[] array = name.toCharArray();
        int start = -1;
        int end = -1;
        for(int i =0;i<array.length;i++){
            if(array[i] == 'S'){
                start=i;
                end=-1;
            }
            if(array[i]=='R'){
                end=i;
            }
        }
        StringBuilder str= new StringBuilder();
        for(int i=0; i<array.length;i++){
           if( (i>start) && (i< end)){
               continue;
           }str.append(array[i]);
        }
        System.out.println(str.toString());
    }

}
