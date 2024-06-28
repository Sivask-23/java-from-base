class QuickUnionUF{
    private int []id;
    QuickUnionUF(int n){
        id=new int[n];
        for (int i = 0; i < n; i++) {
            id[i]=i;
        }
    }

    private int root(int i){
        while (i!=id[i]){
            i=id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return (root(p)==root(q));
    }

    public void union(int p, int q){
        int i=root(p);
        int j=root(q);
        id[i]=j;
    }

    public void printAr(){
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i]+" ");
        }
    }

}
public class QuickUnion {
    public static void main(String[] args) {

        QuickUnionUF q1=new QuickUnionUF(10);
        q1.printAr();
        q1.union(4,3);
        q1.union(3,8);
        q1.union(6,5);
        q1.union(9,4);
        q1.union(2,1);
        q1.union(5,0);
        q1.union(7,2);
        q1.union(6,1);
        q1.union(7,3);
        System.out.println();
        q1.printAr();


    }
}
