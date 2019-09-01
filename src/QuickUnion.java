    import java.util.ArrayList;

    public class QuickUnion implements UF {

        private int[] arr;
        public QuickUnion(int N)
        {
            arr= new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i]= i;
            }
        }


        @Override
        public void union(int p, int q) {
         int x = find(p);
         int y = find(q);
         arr[x]= arr[y];


        }

        @Override
        public int find(int p) {
            int i=arr[p];
            while(i!=arr[i])
            {
     i = arr[p];
     p=i;

    //            p = arr[i];
    //            i = p;
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
                System.out.print(arr[i] +" ");

            }
            System.out.println();
        }

    }
