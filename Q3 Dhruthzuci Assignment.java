import java.util.Stack; 

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>(); 
        
        for(Character c : s.toCharArray()){
            
            if(stack.size() == 0){
                stack.push(c); 
            }
            else {
                Character temp = stack.peek(); 
                
                if(temp - c < 0 && temp - c >= -2){
                    stack.pop(); 
                }
                else {
                    stack.push(c); 
                }
            }
        }
        
        return stack.isEmpty(); 
    }
}

