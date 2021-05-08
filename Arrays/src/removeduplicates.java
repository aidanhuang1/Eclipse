import java.util.Arrays;

public class removeduplicates {
	//THIS IS FOR AN ARRAY THAT IS SORTED, FOR REMOVING DUPLICATES FROM AN ARRAY THAT IS UNSORTED,
	//CHECK REMOVEDUPLICATESFROMUNSORTEDARRAY
	//Because arrays arn't dynamic and we can't change the size of them, we have to 
	//create a new array and only get the values from the old array that we need

	static int[] removeDuplicates(int arr[], int n) 
    { 
        // Return, if array is empty 
        // or contains a single element 
        if (n==0 || n==1) 
            return arr; 
       
        int[] temp = new int[n]; 
          
        // Start traversing elements 
        int j = 0; 
        for (int i=0; i<n-1; i++) 
            // If current element is not equal 
            // to next element then store that 
            // current element 
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i]; 
          
        // Store the last element as whether 
        // it is unique or repeated, it hasn't 
        // stored previously 
        temp[j++] = arr[n-1];    
          
        // Modify original array 
        int[] newarray = new int[j];
        for (int i=0; i<j; i++) 
            newarray[i] = temp[i]; 
        return newarray; 
    } 
      
    public static void main (String[] args)  
    { 
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        int n = arr.length; 
          
        System.out.println(Arrays.toString(removeDuplicates(arr, n))); 
   
    
    } 

}
