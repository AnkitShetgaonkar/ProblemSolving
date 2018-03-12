import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    private int[] numbers;

    public void googleSort(int[] nums){
        this.numbers = nums;
        int size = numbers.length;
        int p = 0, q = size-1;

        while(p<=q){
            while(numbers[p]<0 && p<size){
                p++;
            }
            while(numbers[q]>=0 && p<q){
                q--;
            }
            if(p>=q){
                break;
            }
            //once negative and positive match found swap
            swap(p,q);
            p++;
            q--;
        }
        System.out.println("After negative Google sort "+ Arrays.toString(numbers));
        //reset q to last position
        //all the numbers from current p onwards will be either positive or zeros, no need to check for negatives
        System.out.println(numbers[p]);
        q = size-1;
        while(p<=q){
            // move p to non zero number to exchange
            while(numbers[p] == 0 && p<size){
                p++;
            }

            while(numbers[q] !=0 && q>p){
                q--;
            }
            if(p>=q){
                break;
            }
            swap(p,q);
            p++;
            q--;
        }

        System.out.println("After Google sort "+ Arrays.toString(numbers));
    }

    private void swap(int p, int q){
        System.out.println("swapping "+numbers[p]+" with "+numbers[q]);
        int temp = numbers[q];
        numbers[q] = numbers[p];
        numbers[p] = temp;
    }

    public static void main(String[] args) {
        Main main  = new Main();
        int[] nums =  {-1, 2, 4, 0,-8, 10, 9, 100, -3, 2,0,0,0,0,0,-12,34,-4};
        main.googleSort(nums);
    }
}
