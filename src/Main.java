import com.dgmf.DuckDecoy;
import com.dgmf.Mallard;
import com.dgmf.Mandarin;
import com.dgmf.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Mallard mallard = new Mallard();
        Mandarin mandarin = new Mandarin();
        RubberDuck rubberDuck = new RubberDuck();
        DuckDecoy duckDecoy = new DuckDecoy();

        // Outputs
        System.out.println(" ========== Mallard ========== ");
        mallard.display();
        mallard.swim();
        mallard.quack();
        mallard.fly();

        System.out.println(" ========== Mandarin ========== ");
        mandarin.display();
        mandarin.swim();
        mandarin.quack();
        mandarin.fly();

        System.out.println(" ========== Rubber Duck ========== ");
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
        rubberDuck.fly();

        System.out.println(" ========== Duck Decoy ========== ");
        duckDecoy.display();
        duckDecoy.swim();
        duckDecoy.quack();
        duckDecoy.fly();
    }
}