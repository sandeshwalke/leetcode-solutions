class Solution {
    public boolean isPalindrome(String s) {
        char [] ch=s.toCharArray();
        char [] ch1=new char[ch.length];

       

        int k=0;
        for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(ch[i])  )
         ch1[k++]=Character.toLowerCase(ch[i]);
        }

        int i=0;
        int j=k-1;
        
        while(i<j){
            if(ch1[i]!=ch1[j]){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}