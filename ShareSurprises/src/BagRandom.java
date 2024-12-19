import java.util.ArrayList;
import java.util.Random;

public class BagRandom implements IBag{
    ArrayList<ISurprise> surprises;

    BagRandom(){
        surprises = new ArrayList<>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        surprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSuprises) {
        while (!bagOfSuprises.isEmpty()) {
            surprises.add(bagOfSuprises.takeOut());
        }
        bagOfSuprises.clearBag();
    }

    @Override
    public ISurprise takeOut() {
        Random rand = new Random();
        int n = rand.nextInt(surprises.size());
        ISurprise temp = surprises.get(n);
        surprises.remove(n);
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return surprises.isEmpty();
    }

    @Override
    public int size() {
        return surprises.size();
    }

    @Override
    public void clearBag(){
        surprises.clear();
    }

}
