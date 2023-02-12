import java.util.Random;

public class Snake extends Obstacle {
    Random random = new Random();


    public Snake() {
        super("Snake🐍", 4,4, 12, 0,1);
        Random random = new Random();
        this.setDamage(random.nextInt(3,6));
    }

}
