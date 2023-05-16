package functions_week2.pkg1;
/**
 *
 * @author bnzivu
 */
public class Functions_week21 {

    public static int myAddition (int a, int b){
        int c = a + b;
        return c;
    }
    
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = myAddition(a,b);
        System.out.println(c);
    }
    
}
