abstract class AbstractGiveSurprises {
    IBag bag;
    int waitTime;

    public AbstractGiveSurprises(String type, int time){
        BagFactory bagFactory = BagFactory.getInstance();
        this.bag = bagFactory.makeBag(type);
        this.waitTime = time;
    }

    public void put(ISurprise newSurprise){
        this.bag.put(newSurprise);
    }

    public void put(IBag surprises){
        this.bag.put(surprises);
    }

    public void give(){
        this.bag.takeOut().enjoy();
        giveWithPassion();
    }

    public void giveAll(){
        while(!this.bag.isEmpty()){
            this.bag.takeOut().enjoy();
            giveWithPassion();
        }
    }
    public boolean isEmpty(){
        return this.bag.isEmpty();
    }

    abstract void giveWithPassion();


}
