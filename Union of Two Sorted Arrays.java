class Solution {
    
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
       
        Set<Integer> unionSet = new HashSet<>();
        
        
        for (int i = 0; i < arr1.length; i++) {
            unionSet.add(arr1[i]);
        }
        
        for (int i = 0; i < arr2.length; i++) {
            unionSet.add(arr2[i]);
        }
        
        ArrayList<Integer> unionList = new ArrayList<>(unionSet);
        Collections.sort(unionList);
        
        return unionList;
    }
}
