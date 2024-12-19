public class MinionToy implements ISurprise{
    private final String minionName;
    private static int count = 0;


    public MinionToy(String minionName) {
        this.minionName = minionName;
        count++;
    }

    @Override
    public void enjoy() {
        System.out.println("You got a minion named " + minionName);
    }

    @Override
    public String toString() {
        return "[Minion] name = " + minionName;
    }

    public static MinionToy generate(){
        final String[] minionNames = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
        if (count == minionNames.length) {
            count = 0;
        }
        return new MinionToy(minionNames[count]);
    }
}
