import java.util.Scanner;


class fibo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, f1=0, f2=1, f3=1, n;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        for(i=0; i<n; i++){
            System.out.print(f1 + " ");
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

    }
}



