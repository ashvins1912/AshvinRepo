package test.Hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductIssue {
    public static void main(String[] args)   {
        Scanner s = new Scanner(System.in);
        int numbrs = s.nextInt();
        List<Integer> list = new ArrayList<>();
        while(numbrs-->=0){
            list.add(s.nextInt());
        }
        System.out.print(list+"\t");
        List<Integer> deleiverd = new ArrayList<>();
        for(Integer ip : list){
            deleiverd.add(getMin(list.size(),ip,list.size()));
        }
        for(int value : deleiverd){
            System.out.print(value+"\t");
        }
    }

    public static Integer getMin(int N, Integer A, int K) {
        int Maximum = 0, tour = 0;
        for (int i = 1; i < N; i++) {
            Maximum = Math.max(Maximum, K);
        }
        for (int i = 1; i < N; i++) {
            tour = 0;
            if (A% i == 0) {
                tour+=A/i;
            }else{
                tour+=Math.floor(A/i)+1;
            }

        }

        return tour;
    }
}
