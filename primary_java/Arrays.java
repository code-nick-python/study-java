public class Arrays{
    public static void main(String []args){
        int[] lst = {1, 2, 3, 4, 5};
        for(int i:lst){
            System.out.println(i);
        }
        int [][] two = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<two.length;i++){
            for(int j=0;j<two[i].length;j++){
                System.out.print(two[i][j] + " ");
            }
            System.out.println();
        }
    }
}