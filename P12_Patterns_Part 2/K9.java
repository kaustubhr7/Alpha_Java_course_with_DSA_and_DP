/*Diamond Patter
   *
  ***
 *****
*******
*******
 *****
  ***
   *
*/ 
public class K9 {
    public static void main(String[] args) {
        //First Half
        for (int i = 1; i <=4; i++) {
            //Spaces
            for (int j = 1; j <=4-i; j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half
        for (int i = 4; i >=1; i--) {
            //Spaces
            for (int j = 1; j <=4-i; j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
