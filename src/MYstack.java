import java.util.LinkedList;

public class MYstack {

    private LinkedList<Player> roster;

//-------------------------------------------------------------
    public MYstack() {roster = new LinkedList<Player>();}
//-------------------------------------------------------------
    public void push(Player p) {roster.add(p);}
//-------------------------------------------------------------
    public Player pop() {return roster.removeLast();}
//-------------------------------------------------------------
    public Player peek() {return roster.getLast();}
//-------------------------------------------------------------
    public boolean isEmpty() {return (roster.size() == 0);}
//-------------------------------------------------------------
    public String toString() {
        String output = "";

        for (int i=0; i < roster.size(); i++)
            output += roster.get(i).toString();

        return output;
    }
}