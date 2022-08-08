import java.util.*;
public class Triangle {
    public static void main(String[] args){
        int n,i,j;
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j<i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.print("\n");
        }
    }
}
