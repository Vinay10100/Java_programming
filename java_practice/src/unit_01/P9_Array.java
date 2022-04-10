package unit_01;


import java.util.Arrays;
/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		//Sorting Array Using the sort() Method
		Arrays.sort(arr);

		System.out.println("\n Array element after sorting :");
		for (int i = 0; i < arr.length; i++)   
		{      
			System.out.println(arr[i]);   
		}
	}

	void findTheDuplicateElements(int[] arr) {
		System.out.println("\n Duplicate elements in array: ");   
		for(int i = 0; i < arr.length; i++)
		{  
			for(int j = i + 1; j < arr.length; j++)
			{  
				if(arr[i] == arr[j])  
					System.out.println(arr[j]);  
			}  
		}  
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		for(int i=0;i<arr.length;i++)     
		{
			for(int j=i+1;j<arr.length;j++)     
			{
				if(arr[i]>arr[j])    
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}

		System.out.println("\n Second Largest element in the array is: "+arr[arr.length-2]);   
		System.out.println("\n Second Smallest element in the array is: "+arr[1]);
	}

	void leftRotationInAnArray(int[] arr) {
		int n=3;	//rotating array by 3 times
		System.out.println("\n Original array: ");  
		for (int i = 0; i < arr.length; i++) {  
			System.out.print(arr[i] + " ");  
		}  
		for(int i = 0; i < n; i++){  
			int j, first;  
			first = arr[0];  
			for(j = 0; j < arr.length-1; j++){  
				arr[j] = arr[j+1];  
			}  
			arr[j] = first;  
		}  
		System.out.println();  
		System.out.println("\n Array after left rotation: ");  
		for(int i = 0; i< arr.length; i++){  
			System.out.print(arr[i] + " ");  
		}  

	}
	void removeElementInArray(int[] arr) {
		int n=3;
		for(int i = 0; i < n; i++){    
			int j, last;        
			last = arr[arr.length-1];    

			for(j = arr.length-1; j > 0; j--){     
				arr[j] = arr[j-1];    
			}      
			arr[0] = last;    
		}    
		System.out.println("\n Array after right rotation: ");    
		for(int i = 0; i< arr.length; i++){    
			System.out.print(arr[i] + " ");    
		}    

	}

}
