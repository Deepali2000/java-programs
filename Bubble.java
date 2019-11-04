public class Bubble
{
    void bubbleSort(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
    }
    void printArray(int a[])
    {
        int n = a.length;
        for (int i=0; i<n; ++i)
          System.out.print(a[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        BubbleSort o = new BubbleSort();
        int a[] = {64, 34, 25, 12, 22, 11, 90};
        o.bubbleSort(a);
        System.out.println("Sorted array");
        o.printArray(a);
    }
}