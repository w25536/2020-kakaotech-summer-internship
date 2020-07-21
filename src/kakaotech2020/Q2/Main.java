package kakaotech2020.Q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


interface Math{
     int operator(int a, int b);
}

public class Main {

//Text Style Multiple Selections: Alt + Shift + Mouse Click

    static Math add = (a,b) -> a + b;
    static Math multiply = (a,b) -> a * b;
    static Math subtract = (a,b) -> a - b;

    static Stack<Integer> numberStack =  new Stack<Integer>();
    static Stack<Character> operatorStack = new Stack<Character>();


    public static void conv(Stack<Integer> numberStack){

        int  n = numberStack.pop() * 1 + numberStack.pop() * 10 + numberStack.pop() * 100;

        System.out.println(n);

    }



    public static long solution(String s) {

        long answer = 0;

        char[] expressions = s.toCharArray();

        if(expressions.length >= 3 || expressions.length >=100 ) { // 1. expression은 길이가 3 이상 100 이하인 문자열입니다.

            for (int i = 0; i < expressions.length; i++) {
                if (expressions[i] >= '0' && expressions[i] <= '9') {
                    numberStack.push(Integer.parseInt(String.valueOf(expressions[i])));
                } else if(expressions[i] == '+' || expressions[i] =='-' || expressions[i] =='*'){
                    operatorStack.push(expressions[i]);
                } else{

                    //fail
                }

            }
        }

        return  answer;
    }

        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int n = Integer.valueOf(br.readLine());
        String n = br.readLine();

        solution(n);
        conv(numberStack);





    }
}
