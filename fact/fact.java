import java.util.Scanner;

class fact{
    public static void main(String[] args) {
        int n;
        long f=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = inp.nextInt();

        for(int i=1; i<=n; i++){
            f = f * i;
            System.out.print(f);
        }

        System.out.println("The factorial is: " + f);
    }
}

