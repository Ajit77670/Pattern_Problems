
/*
5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 
 */

public class pat_5 {
    
public static void main(String[] args) {
    

    pattern_5(5);
}  


static void pattern_5(int n){

        for(int row=1; row<=2*n; row++){


            int totalColsInRow = row > n ? 2 * n -row : row;
            for(int col=1; col<= totalColsInRow ; col++){

                System.out.print("*");

            }

            System.out.println();

        }
}

}
