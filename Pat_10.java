
/*
 10      *
        * *
       * * *
      * * * *
     * * * * *
 
 */
public class Pat_10 {
    
    public static void main(String[] args) {
        

        pattern_10(5);
    }

    static void pattern_10(int n){

        for(int row=1 ; row<=n;row++){

            for(int s =0 ; s<=n-row;s++){

                System.out.print(" ");
            }

            for(int col =1 ; col<=row;col++){

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
