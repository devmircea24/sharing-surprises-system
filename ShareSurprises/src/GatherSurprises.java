import java.util.Random;

final class GatherSurprises{


    private GatherSurprises(){
    }

    public static ISurprise gather(){
        Random random = new Random();
        int x = random.nextInt(3);
        return switch (x) {
            case 0 -> FortuneCookie.generate();
            case 1 -> Candies.generate();
            case 2 -> MinionToy.generate();
            default -> null;
        };
    }

    public static ISurprise[] gather(int n){
       ISurprise[] arr = new ISurprise[n];
       for(int i = 0; i < n; i++) {
           arr[i] = gather();
       }
       return arr;
    }
}
