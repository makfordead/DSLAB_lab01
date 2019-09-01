import java.util.ArrayList;

public class WeightedQuickUnionUF implements UF {

    private int[] arr;
    private int[] size;

    public WeightedQuickUnionUF(int N)
    {
        size = new int[N];
        arr= new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= i;
            size[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {


        int x = find(p);
        int y = find(q);
        if(size[x]<size[y]) {
            size[y]+=size[x];
        arr[x] = arr[y];
        }
        else
        {
         size[x]+=size[y];
         arr[y] = arr[x];
        }

    }


    @Override
    public int find(int p) {
        int i=arr[p];
        while(i!=arr[i])
        {
            i = arr[p];
            p=i;
        }
        return i;
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int count() {
        int counter =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == i )
                counter++;
        }

        return counter;
    }
public void showDetails()
{
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}


}
