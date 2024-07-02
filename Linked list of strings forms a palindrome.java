class Solution {
    public boolean compute(Node root) {
        
    
    if(root == null){
        return true ;
    }
    
    // concatenate all strings in linkedList 
    StringBuilder combinedString = new StringBuilder();
    Node current = root ;
    while(current!= null){
        combinedString.append(current.data);
        current = current.next;
    }
    
    // check if combined string is a palindrome 
    return isPalindrome(combinedString.toString());
    }
    
    private boolean isPalindrome(String str){
        int left = 0 ;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false ;
            }
            left++;
            right--;
        }
        return true;
    }
    
}
