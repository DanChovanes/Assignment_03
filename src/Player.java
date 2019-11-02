public class Player {
    String LastName;
    String FirstName;
    int Age;
    int PlayerNum;

    public Player(String lastname, String firstname, int age, int Pnum) {
        LastName = lastname;
        FirstName = firstname;
        Age = age;
        PlayerNum=Pnum;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public int getAge() {
        return Age;
    }

    public int getPlayerNum() {
        return PlayerNum;
    }

    public String toString()
    {
        String line = "[" + LastName + ", " + FirstName + ", " + Age + ", " + PlayerNum + "]";
        return line;
    }
}