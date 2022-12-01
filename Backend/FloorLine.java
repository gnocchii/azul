import java.util.*;
import java.util.ArrayList;

public class FloorLine {
    private ArrayList<Tile> FloorLines;
    private Boolean firstTile;
    int pointDeduction;

    public FloorLine() {
        pointDeduction = 0;
        FloorLines = new ArrayList<Tile>();
    }

    //takes in a tile and adds it to FloorLines array
    public void addTile(Tile tile) {
        FloorLines.add(tile);
    }

    //removes all tiles in the FloorLines array
    public void reset() {
        FloorLines.clear();
    }

    //goes through the FloorLines arraylist and determines how many points get deducted based on the position on the floorline
    public int getPenalty() {
        int x = FloorLines.size();
        int penalty = 0;
        for (int i = 0; i < x; i++) {
            if (i < 2)
                penalty++;
            else if (i < 5)
                penalty += 2;
            else if (i < 7)
                penalty += 3;
           
           // change if need to update when floorline bigger than 7
            else
                penalty +=1000000;
            
        }

        return penalty;
    }

//    public void setFirstTile() {
//    }

}
