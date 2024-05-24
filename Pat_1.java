/*
 *  1.  *****
        *****
        *****
        *****
        *****
 * 
 *  no. of lines = no. of rows = no.of times outer loop will run.
 */
public class Pat_1 {

    public static void main(String[] args) {
        

        pattern_1(5);
    }
    


public static void pattern_1(int n){

    for(int row=1; row<=n; row++){

        for(int col=1; col<=n; col++){

            System.out.print("*");  
        }

        System.out.println();
    }
    

}

}
