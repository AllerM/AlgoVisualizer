public class Main {

    public static void main(String[] args) throws Exception {

        int [] numbers = {12,7,9,13,4,19,5,10,16,18,15,3,8,1,14,20};
        System.out.println("Not sorted array: ");
        printArray(numbers);
        QuickSort(numbers,0, numbers.length-1);
        printArray(numbers);
    }

    public static void QuickSort(int[] A,int lo, int hi){
        if(hi<= lo){
            return;
        }
        int r = lo;
        int  p = partition(A,lo,hi,r);
        printArray(A);
        QuickSort(A,lo,p-1);
        QuickSort(A,p+1,hi);
    }

    public static int partition(int[] A,int lo, int hi, int r){
        swap(A,lo,r);
        int i = lo+1;
        int j = hi;
        int x = A[lo];
        while(i<=j){
            if(A[i]<= x){
                i++;
            }
            else if(A[j]>x){
                j--;
            }
            else{
                swap(A,i,j);
                i++;
                j++;
            }
        }
        swap(A,lo,j);
        return j;

    }

    public static void swap(int[]A,int a, int b){
        int tempA = A[a];
        int tempB = A[b];
        A[a] = tempB;
        A[b] = tempA;
    }

    public static void printArray(int[]A){
        System.out.print("[");
        for(int i = 0; i<A.length;i++){
            System.out.print(A[i]+",");
        }
        System.out.print("]");
        System.out.println("");
    }
}
