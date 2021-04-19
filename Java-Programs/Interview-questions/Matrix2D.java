// special sparse matrix

// special sparse matrix is one which has greater or equal no of zero elements than the non-zero elements in a m*n matrix.

// if given matrix is a special sparse matrix then convert it to non -sparse matrix  by replacing the zeros row wise such that
//  *if the sum of elements in tat particular row (rowsum)  <= sum of elements in particular column (colsum),replace the zero by num  such that num = smallest positive non-0 integer that is div by 2 if added to rowsum.(num+rowsum is div by 2)
//  *if rowsum >colsum replace the zero by num  such that num = smallest positive non-0 integer that is div by 3 if added to rowsum.(num+rowsum is div by 3)
// else
// return -1


// eg
// 4
// 0 0 5
// 7 0 0
// 0 6 0
// 0 0 0

// output:
// 1 2 5
// 7 1 1
// 0 6 0


import java.util.*;

public class Matrix2D {
    public static void main(String args[]) {
        int n, countZero = 0, countNonZero = 0, rowSum = 0, colSum = 0;
        
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

        String str,arr[];
        int len = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n");
        n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            a.add(new ArrayList<Integer>());
            str = s.nextLine();
            arr = str.split(" ");
            len = arr.length;
            for (int j = 0; j < len; j++) {
                a.get(i).add(j, Integer.parseInt(arr[j]));
                if (a.get(i).get(j) == 0)
                    countZero++;
                else
                    countNonZero++;
            }

        }

        if (countZero < countNonZero) {
            System.out.println("No sparse tree");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < len; j++) {
                    if (a.get(i).get(j) == 0 && countZero >= countNonZero) {
                        rowSum = 0;
                        colSum = 0;
                        for (int k = 0; k < len; k++) {
                            rowSum += a.get(i).get(k);
                            colSum += a.get(k).get(j);

                        }

                        if (rowSum <= colSum) {
                            int num = 1;
                            while (num <= 2) {
                                if ((num + rowSum) % 2 == 0) {
                                    a.get(i).set(j, num);
                                    break;
                                }

                                num++;
                            }
                            countZero--;
                            countNonZero++;
                        } else {
                            int num = 1;
                            while (num <= 3) {
                                if ((num + rowSum) % 3 == 0) {
                                    a.get(i).set(j, num);
                                    break;
                                }

                                num++;
                            }
                            countZero--;
                            countNonZero++;
                        }
                    }
                }
            }
        }
        System.out.println("The new matrix is:");
        System.out.println(a);
    }
}
