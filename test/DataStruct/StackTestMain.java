package com.test.DataStruct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StackTestMain {
    public static void main(String args[] )
    {
        MyStack myStack =  new MyStack();
        myStack.push(10);
        myStack.push(12);
        myStack.push(14);
        myStack.push(16);
        myStack.push(19);
        myStack.push(10);
        myStack.push(12);
        myStack.push(14);
        myStack.push(16);
        myStack.push(19);

       // System.out.println(myStack.removeFromIndex(9));

        //myStack.showStack();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

        System.out.println();
     myStack.showStack();
    }
}
