package Bioclicker;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        long curTime = System.nanoTime();
        int milliPerTick = 100;
        while(true){
            if(System.nanoTime() - curTime >= 1000000 * milliPerTick){
                game.Run();
                curTime += 1000000 * milliPerTick;
            }
        }
    }
}
