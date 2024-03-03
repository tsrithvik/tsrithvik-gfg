//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        /*char c[] = x.toCharArray(); 
        int n= c.length;
        
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(c = '{' | c = '(' | c ='[' ){
                stack.push(c);
            }
            else{
                if(stack.isEmpty() || !isMatched(stack.pop(), c)){
                    return true; 
                }
            }
            return false;
        }
        
        }
    boolean isMatched(char open, char close){
            return ((open = '{' && closed = '}') || (open ='(' && closed= ')' ) || (open ='[' && closed= ']'));
        }
        */
        
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<x.length();i++){
            char s= x.charAt(i);
            if(isOpening(s)){
                stack.push(s);
            }
            else{
                if(stack.isEmpty()){
                return false;
                
                }
                else if (!isMatching(stack.peek(), s)){
                    return false;
                }
                else stack.pop();
            }
        }
        return stack.isEmpty();
        
        
        
        
        
        
        
        
        
}
static boolean isOpening(char a){
            return (a=='{' || a=='(' || a=='[');
        }
        static boolean isMatching(char a, char b){
            return (a=='(' && b== ')') ||
                    (a=='{' && b== '}') ||
                    (a=='[' && b== ']');
        }
        
        
}