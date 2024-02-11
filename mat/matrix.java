import java.util.Scanner;

/**
 * matrix
 */
public class matrix {
    static int mat1[][], mat2[][], ans[][], mr1, mc1, mr2, mc2;
    public static void main(String[] args) {
        mat1 = new int[10][10];
        mat2 = new int[10][10];
        ans = new int[10][10];
        System.out.print("Enter mat 1 (row col): ");
        Scanner sc = new Scanner(System.in);
        mr1 = sc.nextInt();
        mc1 = sc.nextInt();
        System.out.print("Enter mat 1: \n");
        for(int i=0; i<mr1; i++){
            for(int j=0; j<mc1; j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter mat 2 (row col): ");
        mr2 = sc.nextInt();
        mc2 = sc.nextInt();
        System.out.print("Enter mat 1: \n");
        for(int i=0; i<mr2; i++){
            for(int j=0; j<mc2; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        mat2 = trans();
        mat_mul();

        System.out.println("Ans:");
        for(int i=0; i<mr1; i++){
            for(int j=0; j<mc2; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int mul_vec(int a[], int b[]){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum += a[i] * b[i];
        }
        return sum;
    }
    static int[][] trans(){
        int ans[][];
        ans = new int[10][10];
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                ans[i][j] = mat2[j][i];
            }
        }
        return ans;
    }
    static void mat_mul(){
        for(int i=0; i<mr1; i++){
            for(int j=0; j<mc2; j++){
                ans[i][j] = mul_vec(mat1[i], mat2[j]);
                System.out.println("Returns: "+ans[i][j]);
            }
        }
    }
}




