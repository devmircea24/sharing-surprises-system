public class GiveSurpriseAndHug extends AbstractGiveSurprises{

    public GiveSurpriseAndHug(String type, int time) {
        super(type, time);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
