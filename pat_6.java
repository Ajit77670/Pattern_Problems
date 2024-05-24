/*
 6       *
        **
       ***
      ****
     *****
  
 */


public class pat_6 {
    
    public static void main(String[] args) {
        

        pattern_6(5);
    }

    static void pattern_6(int n){

        for(int row=1; row<=n;row++){


            for(int s =4 ; s>=row; s--){   // Loop for spaces

                System.out.print(" ");
            }
            
            for(int col =1; col<=row;col++){

                System.out.print("*");
            }

            System.out.println();
        }

    }
}
