import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
        public static long[] time_for_Small_Data_Set = new long[3];
        public static long[] time_for_Medium_Data_Set = new long[3];
        public static long[] time_for_Large_Data_Set = new long[3];
        public static void Time_Test(UF uf, String Name_of_file) throws Exception

        {

                Scanner sc = new Scanner(new File(Name_of_file));


                int no_of_times_new = sc.nextInt();
                for (int i = 0; i < no_of_times_new; i++) {
                        int p = sc.nextInt();
                        int q = sc.nextInt();
                        if(!uf.connected(p,q))
                                uf.union(p,q);
                }
        }

        public static void main(String[] args) throws Exception
        {
                // Calculating Time for Small Data sets
                Scanner size = new Scanner(new File("tinyUF.txt"));
                int x = size.nextInt();
                size.close();
                QuickFindUnion quickFindUnionsmall = new QuickFindUnion(x);
                QuickUnion quickUnionSmall= new QuickUnion(x);
                WeightedQuickUnionUF weightedQuickUnionUFSmall = new WeightedQuickUnionUF(x);
                // putting times in respective arrays

                //Quick Find Union
                long start = System.currentTimeMillis();
                Time_Test(quickFindUnionsmall,"tinyUF.txt");
                long end = System.currentTimeMillis();
                time_for_Small_Data_Set[0] = end-start;

                // Quick Union

                 start = System.currentTimeMillis();
                Time_Test(quickUnionSmall,"tinyUF.txt");
                 end = System.currentTimeMillis();
                time_for_Small_Data_Set[1] = end-start;

                // WEighted quick union
                start = System.currentTimeMillis();
                Time_Test(weightedQuickUnionUFSmall,"tinyUF.txt");
                end = System.currentTimeMillis();
                time_for_Small_Data_Set[2] = end-start;


                // FOR MEDIUM DATA SET
                Scanner size_for_med = new Scanner(new File("mediumUF.txt"));
                x = size_for_med.nextInt();
                QuickFindUnion quickFindUnionmed = new QuickFindUnion(x);
                QuickUnion quickUnionmed= new QuickUnion(x);
                WeightedQuickUnionUF weightedQuickUnionUFmed = new WeightedQuickUnionUF(x);


                start = System.currentTimeMillis();
                Time_Test(quickFindUnionmed,"mediumUF.txt");
                end = System.currentTimeMillis();
                time_for_Medium_Data_Set[0] = end-start;


                start = System.currentTimeMillis();
                Time_Test(quickFindUnionmed,"mediumUF.txt");
                end = System.currentTimeMillis();
                time_for_Medium_Data_Set[1] = end-start;


                start = System.currentTimeMillis();
                Time_Test(weightedQuickUnionUFmed,"mediumUF.txt");
                end = System.currentTimeMillis();
                time_for_Medium_Data_Set[2] = end-start;

        //large Data sets
                Scanner size_for_large = new Scanner(new File("mediumUF.txt"));
                x = size_for_large.nextInt();
                QuickFindUnion quickFindUnionlarge = new QuickFindUnion(1000000);
                QuickUnion quickUnionlarge= new QuickUnion(1000000);
                WeightedQuickUnionUF weightedQuickUnionUFlarge = new WeightedQuickUnionUF(1000000);

                start = System.currentTimeMillis();
                Time_Test(quickFindUnionlarge,"largeUF.txt");
                end = System.currentTimeMillis();
                time_for_Large_Data_Set[0] = end-start;

                start = System.currentTimeMillis();
                Time_Test(quickUnionlarge,"largeUF.txt");
                end = System.currentTimeMillis();
                time_for_Large_Data_Set[1] = end-start;

                start = System.currentTimeMillis();
                Time_Test(weightedQuickUnionUFlarge,"largeUF.txt");
                end = System.currentTimeMillis();
                time_for_Large_Data_Set[2] = end-start;

       Array_printer(time_for_Small_Data_Set);
       Array_printer(time_for_Medium_Data_Set);
       Array_printer(time_for_Large_Data_Set);

        }


        public static void Array_printer(long[] x)
        {
                for (int i = 0; i < x.length; i++) {
                        System.out.print(x[i] + "   ");

                }
                System.out.println();
        }
    }



