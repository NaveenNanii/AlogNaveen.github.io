package SortingAlgorithms;
	public class QuickSort {
	    /*this function takes least element as a pivot,places the pivot element at its correct position
	    in sorted array,and places all smaller (smaller than pivot)to left of pivot and all greater elements
	    to right of pivot*/
	    int partition(int arr[], int low, int high) {
	        int pivot = arr[high];
	        int i = (low - 1);
	        for (int j = low; j <= high - 1; j++) {
	            //if current element is smaller than or equal to pivot
	            if (arr[j] <= pivot) {
	                i++;
	                //swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;

	            }
	        }

	        //swap arr[j+1] and arr[high] or pivot
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;
	        return i + 1;
	    }
	/*the main function that implements Quicksort()
	arr[]-->Array to be sorted
	low-->starting index
	high-->ending index*/
	void sort(int arr[],int low,int  high){
	    if(low<high){
	        /*pi is partitioning index,arr[pi] is now at right place*/
	        int pi=partition(arr,low,high);
	        sort(arr,low,pi-1);
	        sort(arr,pi+1,high);
	    }
	}
	/*A utility function to print array of size n*/
	static void printArray(int arr[]){
	    int n=arr.length;
	    for (int i=0;i<n;++i){
	        System.out.println(arr[i]+" ");
	        System.out.println();
	    }
	}
	//Driver program
	    public static void main(String[] args) {
	        int arr[]={34,45,67,78,89,90,12};
	        int n=arr.length;
	        QuickSort q=new QuickSort();
	        q.sort(arr,0,n-1);
	        System.out.println("sorted Array");
	        printArray(arr);
	    }
	}
