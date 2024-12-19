import java.util.ArrayList;

public class BagLIFO implements IBag{
    ArrayList<ISurprise> surprises;

    BagLIFO(){
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
        ISurprise temp = surprises.get(surprises.size() - 1);
        surprises.remove(surprises.size() - 1);
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
    public void clearBag() {
        surprises.clear();
    }

}
