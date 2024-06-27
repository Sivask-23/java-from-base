class QuickFindUF{
    private int[]id;
    QuickFindUF(int n){
        id=new int[n];
        for (int i = 0; i < n; i++) {
            id[i]=i;
        }
    }

    public boolean connected(int p, int q){
        return id[p]==id[q];
    }

    public void union(int p, int q){
        int pid=id[p];
        int qid=id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i]==pid){
                id[i]=qid;
            }
        }
    }

    public void printArray(){
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i]+" ");
        }
    }

}
public class QuickFind {
    public static void main(String[] args) {

        QuickFindUF q1=new QuickFindUF(5);
        q1.printArray();
        q1.union(1,2);
        System.out.println();
        q1.printArray();
        System.out.println();
        System.out.println(q1.connected(1,3));

    }
}
