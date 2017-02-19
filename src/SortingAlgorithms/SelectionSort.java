package SortingAlgorithms;

	public class SelectionSort {
	    void selectionsort(int arr[]){
	    int n=arr.length;
	    //one by one move boundary of unsorted Array
	        for (int i = 0; i < n - 1; i++) {
	        //find the minimum element in unsorted Array
	            int imin = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[imin])
	                    imin = j;
	        //swap the found minimum element with the first element
	        int temp = arr[i];
	        arr[i] = arr[imin];
	        arr[imin] = temp;
	    }
	    }
	    }
	    //print the array
	    void printArray(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n;++i){
	    System.out.println(arr[i]+" ");
	    System.out.println();
	    }
	    }
	    //Driver code to test the above
	    public static void main(String[] args) {
	        SelectionSort s=new SelectionSort();
	        int arr[] = {2, 7, 4, 1, 5, 3};
	        s.selectionsort(arr);
	        System.out.println("sorted Array");
	        s.printArray(arr);
	        }
	    }
