import java.util.ArrayList;

public class BagFIFO implements IBag{
    ArrayList<ISurprise> surprises;

    BagFIFO(){
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
        ISurprise temp = surprises.get(0);
        surprises.remove(0);
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
