
/*
 3. *****
    ****
    ***
    **
    *
 
 */

public class Pat_3 {
    public static void main(String[] args) {
       
        
        pattern_3(5);
    }


    static void pattern_3(int n){

        for(int row=1; row<=n; row++){


            for(int col=1; col<=n-row+1;col++ ){

            System.out.print("*");

        }

        System.out.println();
    }


}
}