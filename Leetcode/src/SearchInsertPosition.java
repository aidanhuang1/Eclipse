import java.util.*;
public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if (nums[mid]==target) {
				return mid;
			} else if (target<nums[mid]) {
				right = mid-1;
			} else if (target>nums[mid]) {
				left = mid+1;
			}
		}
		return left;
	}
//get the last recorded left right and find the average of that 
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] a = {1,3,5,6};
		System.out.println(searchInsert(a, 7));

	}

}
