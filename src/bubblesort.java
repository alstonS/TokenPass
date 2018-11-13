public class  bubblesort {


    public void main bubbleSort(int[] arr)
    {

        int swaps = 1;
        while(swaps>0)
        {
            swaps=0;
            int arrL = arr.length;
            for(int i=0; i < arrL-1; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int placeholder = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = placeholder;
                    arrL--;
                    swaps++;

                }
            }
        }
    }
}
