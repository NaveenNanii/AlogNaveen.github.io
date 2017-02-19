package SortingAlgorithms;

	public class BubbleSort {
	    void bubblesort(int arr[]){
	        int n=arr.length;
	        for (int i=0;i<n-1;i++){
	            for (int j=0;j<n-i-1;j++){
	                if (arr[j]>arr[j+1]){
	                	
	                	
	                    //swap the elements
	                    int temp=arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=temp;
	                }

	            }
	        }
	    }
	    void printArray(int arr[]){
	        int n=arr.length;
	        for (int i=0;i<n;i++){
	            System.out.println(arr[i]+" ");
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        BubbleSort b=new BubbleSort();
	        int arr[]={8,6,5,4,3,7,8,9,3};
	        b.bubblesort(arr);
	            System.out.println("sorted array");
	            b.printArray(arr);


	        }
	    }
