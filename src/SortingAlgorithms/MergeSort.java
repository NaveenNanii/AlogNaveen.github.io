package SortingAlgorithms;

	public class MergeSort   {
	    void merge(int arr[],int l,int m,int r) {
	        int n1 = m - 1 + 1;
	        int n2 = r - m;
	        //create temp arrays
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	        //copy data to temp arrays
	        for (int i = 0; i < n1; ++i) {
	            L[i] = arr[l + i];
	            for (int j = 0; j < n2; ++j) {
	                R[j] = arr[m + 1 + j];
	                //merge the temp arrays
	                //initial index of first and second subarrays

	                //initial index of merged subarray array
	                int k =l;
	                while (i < n1 && j < n2) {
	                    if (L[i] <= R[j]) {
	                        arr[k] = L[i];
	                        i++;
	                    } else {
	                        arr[k] = R[j];
	                        j++;
	                    }
	                    k++;
	                }
	                //copy remaining elements of L[] if any
	                while (i < n1) {
	                    arr[k] = L[i];
	                    i++;
	                    k++;
	                }
	            }
	        }
	    }
	        //main function that sorts arr[l...r] using merge[]
	            void sort(int arr[],int l,int r){
	                if(l<r){
	                    //find the middel point
	                    int m=(l+r)/2;
	                    //sort first and second halves
	                    sort(arr,l,m);
	                    sort(arr,m+l,r);
	                    //merge the second halves
	                    merge(arr,l,m,r);
	                }
	        }
	        //utility function to print Array of size n

	       static void printArray(int arr[]){
	                int n=arr.length;
	                for (int i=0;i<n;++i){
	                    System.out.println(arr[i]);
	                    System.out.println();
	                }
	        }
	        //Driver method

	        public static void main(String args[]){
	            int arr[]={12,11,13,6,5,7};
	            System.out.println("given array");
	            printArray(arr);
	            MergeSort m=new MergeSort();
	            m.sort(arr,0,arr.length-1);
	            System.out.println("\n sortedarray");
	            printArray(arr);
	        }
	    }

