import java.awt.*;
import java.util.*;

public class Game {
    enum Color {
        RED,
        YELLOW,
        BLUE,
        BLACK
    };

//    ArrayList<Player> players = new ArrayList<>;
    ArrayList<Tile> TileBag = new ArrayList();
    ArrayList<Tile> discarded = new ArrayList();


    public Game() {
    }

    public boolean hasWon() {
        boolean hasWon = false;
        return hasWon;
    }
    public void startRound() {

    }

    public void play() {
    while(!hasWon()) {
        fillFactory();
        playRound();
        scoreRound();
    }
    }

    public void fillTileBag() {
        for(int i = 0; i< 25; i++) {
            TileBag.add(new Tile(Tile.Color.BLUE, new Point(0, 0)));
            TileBag.add(new Tile(Tile.Color.RED, new Point(0, 0)));
            TileBag.add(new Tile(Tile.Color.BLACK, new Point(0, 0)));
            TileBag.add(new Tile(Tile.Color.YELLOW, new Point(0, 0)));
        }

        Collections.shuffle(TileBag);


    }
    public void fillFactory() {
//        for(ArrayList<Tile> innerList : Factory.Factories) {
//            for(Tile number : innerList) {
//                Factory.Factories[];
//            }
//        }
//
//
//
    }

    public void clearFactory() {
        TileBag.clear();
    }
    public void playRound() {

    }

    public void scoreRound() {

    }

}
