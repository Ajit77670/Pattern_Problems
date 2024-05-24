/*
 11. * * * * *
      * * * *
       * * *
        * *
         *
 
 */
public class Pat_11 {
    
    public static void main(String[] args) {

        pattern_11(5);
        
    }

    static void pattern_11(int n){

        for(int row = 1; row<=n; row++){


            for(int s=0 ; s<=row; s++){

                System.out.print(" ");
            }
            for(int col =1 ; col<=n-row+1 ;col++){

                System.out.print("* ");
            }

            System.out.println();  

        }


    }
}
