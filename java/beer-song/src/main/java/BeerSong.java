/**
 * Created by Serhii Hildi on 23.11.18.
 */
public class BeerSong {

    String sing(int a, int b) {

        String text = "";

        while (true) {
            for (int i = 0; i <= b-1; i++) {

                if (a > 2) {
                    text = text.concat(a + " bottles of beer on the wall, " + a + " bottles of beer.\nTake " +
                            "one down and pass it around, " + concatenation(a) + " bottles of beer on the wall.\n\n");
                }
                if (a == 2) {
                    text = text.concat("2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, " +
                            "1 bottle of beer on the wall.\n\n");
                }
                if (a == 1) {
                    text = text.concat("1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, " +
                            "no more bottles of beer on the wall.\n\n");
                }
                if (a == 0) {
                    text = text.concat("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy " +
                            "some more, 99 bottles of beer on the wall.\n\n");
                }
                a--;
            }
            break;
        }

        return text;
    }

    String singSong() {
        return sing(99, 100);
    }

    private int concatenation(int a) {
       return --a;
    }
}
