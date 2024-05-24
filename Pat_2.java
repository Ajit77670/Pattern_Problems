
/*

 2. *
    **
    ***
    ****
    *****
  
 */
public class Pat_2 {
    
    public static void main(String[] args) {
        

        pattern_2(5); 
    }

    static void pattern_2(int n){


        for(int row =1 ; row<=n;row++){

            for(int col=1 ; col<=row; col++){

                System.out.print("*");
            }

                System.out.println();

        }

    }
}
