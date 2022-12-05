import java.util.*;

public class Factory
{
    public static int FACTORY_SIZE = 4;
    public static int NUM_FACTORIES = 8;
    public static ArrayList<Tile>[] Factories;
    public boolean isFirst;

    public Factory(int numFactories) {

        Factories = new ArrayList[numFactories];
    }

    // populate factories with random tiles, removing them from tileBag
    public void startGame(ArrayList<Tile> tileBag){
        Collections.shuffle(tileBag);
        for(int i = 0; i < Factories.length; i++)   {
            for(int j = 0; j < FACTORY_SIZE; j++) {
                Factories[i].add(tileBag.remove(tileBag.size() - 1));
            }
        }
    }


    public void factorySelected()
    {
    }

//    public Tile addTile()
//    {
//
//    }

    public ArrayList<Tile> removeTile(int factoryIndex, int tileIndex)
    {
        boolean isCenter = (factoryIndex == 0);
        Tile.Color color = Factories[factoryIndex].get(tileIndex).getColor();
        ArrayList<Tile> factory = Factories[factoryIndex];
        ArrayList<Tile> removed = new ArrayList<Tile>();



        // remove same color tiles from factory
        for(int i = 0; i < factory.size(); i++ ) { // TODO optimize?
            if (factory.get(i).color == color){
                removed.add(factory.remove(i));
                i--;
            }
        }

        // if not center, move remaining tiles to center
        if(!isCenter){
            for(Tile t: factory){
                Factories[0].add(t);
            }
            factory.clear();
        }

        return removed;
    }

    public void emptyFactory()
    {
        for(int i = 0; i < Factories.length; i++) {
            Factories[i].clear();
        }
    }
}
