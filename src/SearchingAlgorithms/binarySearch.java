package SearchingAlgorithms;



	public class binarySearch {
		
	    public static int binsearchh(int arr[],int x){
	    	
	    	
	        int low=0,high=arr.length-1;
	        while (low<high){
	            int mid=low+high/2;
	            if (x<arr[mid]){
	                high=mid-1;
	            }else if (x>arr[mid]){
	                low=mid+1;
	            }else return mid;
	        }
	        return Integer.MIN_VALUE;
	    }

	    public static void main(String[] args) {
	        int arr[]={1,2,3,45,56,67,78,89,90};
	        binarySearch b1=new binarySearch();
	        for (int i=0;i<arr.length;i++){
	            System.out.println(" "+i);
	            System.out.println();
	            System.out.println("location of 56 is "+b1.binsearchh(arr,56));
	            System.out.println("location of 89 is "+b1.binsearchh(arr,89));
	        }
	    }
	}

