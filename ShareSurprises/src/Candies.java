import java.util.Random;

public class Candies implements ISurprise{
    private  final int number;
    private final String type;

    public Candies(int number, String type) {
        this.type = type;
        this.number = number;
    }

    @Override
    public void enjoy(){
        System.out.println("You received " + number + " " + type + " candies.");
    }

    @Override
    public String toString(){
        return "[Candies] number = " + number + ", type = " + type;
    }

    public static Candies generate(){
        final String[] types = {"chocolate", "jelly", "fruits", "vanilla"};
        Random random = new Random();
        int n = random.nextInt(types.length);
        int x = Math.abs(random.nextInt());
        return new Candies(x, types[n]);
    }
}
