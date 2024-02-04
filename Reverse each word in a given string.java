class Solution
{
   String reverseWords(String S)
    {
       
        // your code here
        Stack<Character> stk = new Stack<>();
        int n = S.length();
        for(int i=0; i<n; i++)
        {
            stk.push(S.charAt(i));
        }
        
        String ans = "";
        String temp = "";
        
        while(!stk.isEmpty())
        {
            if(stk.peek()!='.')
            {
                temp += stk.peek();
            }
            else{
                ans = "."+temp+ans;
                temp = "";
            }
            
            stk.pop();
        }
        
        ans = temp+ans;
        return ans;
    }

 


}
