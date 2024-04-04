class Solution
{
    
   
     public static long sumSubstrings(String s)
    {
   
        long ans=0,previous=0,mod=1000000007;
        for(int i=0;i<s.length();i++){
            long curr = (previous*10)%mod+(s.charAt(i)-'0')*(i+1)%mod;
            previous=curr;
            ans=(ans+curr)%mod;
        }
        return ans;
        
    
    }
}
