import java.util.Scanner;

class prime{
    public static void main(String[] args) {
        int n, i;
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter n: ");
        n = ip.nextInt();

        for(i=2; i<n/2; i++){
            if(n%i == 0){
                System.out.println("not");
                System.exit(0);
            }
        }
        System.out.println("Yes");



    }
}







