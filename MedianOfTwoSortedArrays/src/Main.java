public class Main {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k = (nums1.length+nums2.length);
        boolean even = false;
        if(k % 2 == 0){
            //even
            even = true;
        }
        k = (int)Math.ceil(k/2.0); //median pos of total array
        int[] heap = new int[k+1]; //maximum size of heap will be till the median +1(for even)
        //run this k times
        int i = 0;
        int j = 0;
        if(even){
            k++;
        }
        int heapPos = 0;
        while(k>0){
            if(i>=nums1.length){
                while(k-->0){
                    heap[heapPos++] = nums2[j++];
                }
                break;
            }
            if(j>= nums2.length){
                while(k-->0){
                    heap[heapPos++] = nums1[i++];
                }
                break;
            }
            k--;
            if(nums1[i]<nums2[j]){
                //first array element is smaller
                heap[heapPos++] = nums1[i];
                i++;
            }else{
                // second array element is smaller
                heap[heapPos++] = nums2[j];
                j++;
            }
        }

        if(even){
            return ((heap[heapPos-1]+heap[heapPos-2])/2.0);
        }

        return heap[heapPos-1];
    }

    public static void main(String[] args) {
        Main main = new Main();
        // int[] nums1 = {2};
        //int[] nums2 = {1, 3, 4};
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double ans = main.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median of two arrays: " + ans);
    }
}
