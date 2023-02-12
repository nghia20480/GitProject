package dao_nguoc_chuoi;

import java.util.Scanner;
import java.util.Stack;

public class StackRevers {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<Integer>();
        int[] arr1={1,2,3,4};
        for (int i = 0; i <arr1.length ; i++) {
            stack1.push(arr1[i]);

        }

        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=stack1.pop();
            System.out.print(arr1[i]);
        }




    }
}
