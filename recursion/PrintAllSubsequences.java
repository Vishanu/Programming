
import java.util.ArrayList;
import java.util.Scanner;

/* A contiguous /non contigous sequences, which follows the order */
/* arr -> {3,1,2}
subsequences are total 8
    3
    1
    2
    3 1
    1 2
    3 2
    3 1 2  */ //not 3 2 1

//Power set question check out okk

class PrintAllSubsequence{
    static void printf(int index, ArrayList<Integer> a,ArrayList<Integer> b, int n){
        if(index == n){
            for(int it:b){
               System.out.print(it+" ");
            }
            if(b.isEmpty()){
                System.out.println("{}");
            }
            System.out.println();
            return;
        }
        b.add(a.get(index));
        printf(index+1, a, b, n);
        b.remove(a.get(index));
        printf(index+1, a, b, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0; i<n; i++){
            // int x = sc.nextInt();
            a.add(sc.nextInt());
        }

        printf(0, a ,b, n);

    }
}

