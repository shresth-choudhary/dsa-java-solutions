import java.util.ArrayList;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        
        // 1. Get the lengths of the arrays
        int n = nums1.length;
        int m = nums2.length;
        
        int i = 0; 
        int j = 0; 
        
        // 2. We STILL use ArrayList here because we don't know the final size yet
        ArrayList<Integer> union = new ArrayList<>(); 
        
        while (i < n && j < m) {
            
            if (nums1[i] < nums2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++; 
            } 
            
            else if (nums2[j] < nums1[i]) {
                if (union.size() == 0 || union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                }
                j++; 
            } 
            
            else {
                if (union.size() == 0 || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++; 
                j++;
            }
        }
        
        // --- CLEANUP ---
        while (i < n) {
            if (union.size() == 0 || union.get(union.size() - 1) != nums1[i]) {
                union.add(nums1[i]);
            }
            i++;
        }
        
        while (j < m) {
            if (union.size() == 0 || union.get(union.size() - 1) != nums2[j]) {
                union.add(nums2[j]);
            }
            j++;
        }
        
        // 3. The problem requires us to return an int[], not an ArrayList.
        // So, we create a standard array of the exact size we need...
        int[] result = new int[union.size()];
        
        // ...and copy the elements over one by one!
        for (int k = 0; k < union.size(); k++) {
            result[k] = union.get(k); 
        }
        
        return result; 
    }
}