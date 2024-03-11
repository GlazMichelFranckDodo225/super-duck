import com.dgmf.Mallard;
import com.dgmf.Mandarin;

public class Main {
    public static void main(String[] args) {
        Mallard mallard = new Mallard();
        Mandarin mandarin = new Mandarin();

        // Outputs
        System.out.println(" ========== Mallard ========== ");
        mallard.display();
        mallard.swim();
        mallard.quack();

        System.out.println(" ========== Mandarin ========== ");
        mandarin.display();
        mandarin.swim();
        mandarin.quack();
    }
}