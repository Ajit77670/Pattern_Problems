/*
 7   *****
      ****
       ***
        **
         *  
 */

public class Pat_7 {
    
    public static void main(String[] args) {
      
        
        pattern_7(5);
    }


    static void pattern_7(int n){

        for(int row = 1; row<=n ;row++){


            for(int s=1 ; s<=row;s++){

                System.out.print(" ");
            }

            for(int col = 1 ; col <= n-row+1;col++){

                System.out.print("*");

            }

            System.out.println();
        }

    }

}
