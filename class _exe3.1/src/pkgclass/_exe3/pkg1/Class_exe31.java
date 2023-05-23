package pkgclass._exe3.pkg1;

/**
 *
 * @author bnzivu
 */
public class Class_exe31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Faculty sg1 = new Faculty();
        Registrar sg2 = new Registrar();
        
        sg2.input();
        sg1.grade(sg2);
        s1.display();
    }
    
}
