import java.util.LinkedList;

public class MYqueue {

    private LinkedList<Player> roster;

//-------------------------------------------------------------
    public MYqueue() {roster = new LinkedList<Player>();}
//-------------------------------------------------------------
    public void insert(Player p) {roster.add(p);}
//-------------------------------------------------------------
    public Player remove() {return roster.removeFirst();}
//-------------------------------------------------------------
    public Player peek() {return roster.getFirst();}
//-------------------------------------------------------------
    public boolean isEmpty() {return (roster.size() == 0);}
//-------------------------------------------------------------
//Is it wrong to write one line functions in Java? It feels awfully pythonic, which Oracle may find blasphemous.
//-------------------------------------------------------------
    public String toString() {
        String output = "";

        for(int i = 0; i < roster.size(); i++)
            output += roster.get(i).toString();

        return output;
    }
}