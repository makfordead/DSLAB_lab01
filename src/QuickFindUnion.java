public class QuickFindUnion implements  UF {
private int[] arr;
public QuickFindUnion(int N)
{
    arr= new int[N];
    for (int i = 0; i < arr.length; i++) {
        arr[i]= i;
    }
}


    @Override
    public void union(int p, int q) {
    int the_value_of_p = arr[p];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== the_value_of_p)
                arr[i] =arr[q];
        }
    }

    @Override
    public int find(int p) {
        return 0;
    }

    @Override
    public boolean connected(int p, int q) {
        return arr[p]==arr[q];
    }

    @Override
    public int count() {
        return 0;
    }
    public void showDetails()
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
