import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        GiveSurpriseAndSing sing = new GiveSurpriseAndSing("RANDOM", 2);
        ISurprise[] surprises = GatherSurprises.gather(4);

        System.out.println(Arrays.toString(surprises));

        for (ISurprise surprise : surprises) {
            sing.put(surprise);
        }
        sing.giveAll();
    }
}