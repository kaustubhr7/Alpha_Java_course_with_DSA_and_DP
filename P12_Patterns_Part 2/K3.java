/*Inverted & Half Pyramid with Numbers
  12345
  1234
  123
  12
  1
*/
public class K3 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            //for nos
            for (int j = 1; j <=(5-i+1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}
