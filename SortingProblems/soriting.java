package SortingProblems;
public class soriting {
    public static void main(String[] args) {
        sort ob=new sort();
        int [] arr={2,4,8,1,6};
        ob.quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

class sort{

    void conqure(int [] data ,int si,int mid,int endi){
        int [] merged=new int[endi-si+1];
        
        int idx1=si;
        int idx2=mid+1;
        int i=0;
        while(idx1<=mid && idx2<=endi) {
            if (data[idx1]<=data[idx2]){
                merged[i++]=data[idx1++];
            }
            else{
                merged[i++]=data[idx2++];
            }
        }
        while(idx1<=mid){
            merged[i++]=data[idx1++];
        }
        while(idx2<=endi){
            merged[i++]=data[idx2++];
        }

        for (int j=0,k=si;j<merged.length;j++,k++){

            data[k]=merged[j];

        }



    }
    void mergeSort(int [] data ,int si,int endi){

        if(si>=endi){
            return; 
        }
        int mid=(si + endi)/2;
        mergeSort(data, si, mid);
        mergeSort(data, mid+1, endi);
        conqure(data , si,mid, endi);

    }

    void bubbleSort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }

    }
    int partintion(int [] arr,int low,int high){
        int pivot=arr[low];
        int i=low+1;
        int j=high;

        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }
            while (arr[j]>pivot){
                j--;

            }
            if (i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }



        }
            int temp1=arr[low];
            arr[low]=arr[j];
            arr[j]=temp1;


        return j;


    }
    void quickSort(int [] arr, int low,int high)
    {
        if(low<high){
            int partintionId=partintion(arr,low,high);
            quickSort(arr, low, partintionId-1);
            quickSort(arr, partintionId+1, high);
        }

    }


    void selectionSort(int []arr){
    
        for(int i=0;i<arr.length-1;i++){

            int smallest=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
    }

    void insertionSort(int []arr){

        for (int i=1;i<arr.length;i++){

            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;

        }
    }
}
