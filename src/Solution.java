import java.util.ArrayList;
public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList1= new ArrayList<>();
        arrayList1.add(-1);
        ArrayList<Integer>arrayList2= new ArrayList<>();
        arrayList2.add(2);
        arrayList2.add(3);
        ArrayList<Integer>arrayList3= new ArrayList<>();
        arrayList3.add(1);
        arrayList3.add(-1);
        arrayList3.add(-1);
        ArrayList<ArrayList<Integer>>arrayList= new ArrayList<ArrayList<Integer>>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        Solution solution = new Solution();
        solution.minimumTotal(arrayList);
    }
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int depth = triangle.size();
        if(depth<=0)return 0;
        int[][]a = new int[depth][depth];
        for(int i=0;i<triangle.size();i++){
            for(int j=0;j<triangle.get(i).size();j++){
                if(i==0){a[0][0]=triangle.get(0).get(0);continue;}
                if(j==0){a[i][j]=a[i-1][0]+triangle.get(i).get(j);continue;}
                if(j==i){a[i][j]=a[i-1][j-1]+triangle.get(i).get(j);continue;}
                if((a[i-1][j-1]<a[i-1][j])) a[i][j]=a[i-1][j-1]+triangle.get(i).get(j);
                else  a[i][j]=a[i-1][j]+triangle.get(i).get(j);
               // a[i][j]=(a[i-1][j-1]<a[i-1][j])?a[i-1][j-1]:a[i-1][j]+triangle.get(i).get(j);
            }
        }
        int min =a[depth-1][0];
        for(int i=0;i<depth;i++){
            if(a[depth-1][i]<min)min=a[depth-1][i];
        }
        return min;
    }
}