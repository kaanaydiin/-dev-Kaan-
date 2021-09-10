package com.bilgeadam.stringOdevi;

public class stringOdevi {
    public static boolean methodWithKaan(String input){
        int leftparanthesis = 0;
        int rightparanthesis = 0;
        boolean result = true;
        char[] Kaan = input.toCharArray();
        for (int i = 0; i <Kaan.length; i++) {
            if (Kaan[i]=='(')
                leftparanthesis +=1;
            else if (Kaan[i]==')')
                rightparanthesis +=1;
            else
                continue;

        }
        if (input.startsWith("(")){
            if (leftparanthesis==rightparanthesis)
                System.out.println(result = true);
            else if(leftparanthesis<rightparanthesis)
                System.out.println(result = false);
            else if(leftparanthesis>rightparanthesis)
                System.out.println(result = false);
        }
        else if(input.startsWith(")"))
            System.out.println(result = false);
        else if(input.isEmpty())
            System.out.println(result = true);
        return true;
    }
    public static void main(String[] args) {
        methodWithKaan("(123)");





    }

}