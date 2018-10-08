
package programforrightrotationofanarray;
/**
Given an array, right rotate it by k elements.
Example: 
    Array[]={1,2,3,4,5,6,7,8,9,10}
    After K=3 rotation=>
    Array[]={8,9,10,1,2,3,4,5,6,7}
 */
public class ProgramForRightRotationOfAnArray {
/* 
   Function to reverse arr[] 
   from index start to end
*/
    public static void reverseArray(int arr[], int start, int end) 
    { 
        while (start < end) 
        {
            int temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        } 
    } 
 
/* Function to right rotate arr[] by d */
    public static void rightRotate(int arr[], int d) 
    { 
        reverseArray(arr, 0, arr.length - 1); 
	reverseArray(arr, 0, d - 1); 
	reverseArray(arr, d, arr.length - 1); 
    }
/* Function to print an array */
    public static void printArray(int arr[]) 
    { 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    } 
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	
	int n = arr.length; 
	int k = 3; 
	
	rightRotate(arr, k); 
	printArray(arr); 
    }
    
}
