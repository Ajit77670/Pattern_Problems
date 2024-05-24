/*
 9  *********
     *******
      *****
       ***
        *      
 
 */


public class Pat_9 {
    

    public static void main(String[] args) {
        

        pattern_9(5);
    }


    static void pattern_9(int n){

        for(int row =1 ; row<=n; row++){

            for(int s=1 ; s<=row;s++){

                System.out.print(" ");
            }

            for(int col=1; col<=n-row+1;col++){

                System.out.print("*");

            }
            for(int col=2; col<=n-row+1;col++){

                System.out.print("*");

            }

            
            

            System.out.println();



        }

    }
}
