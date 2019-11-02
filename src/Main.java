//Dan Chovanes
//Assignment 03


import java.util.Scanner;
import java.io.*;

//Range class borrowed from Jake&Ross

class Range {
    private int low;
    private int high;

    public Range(int l, int h) {low = l; high = h;}

    public boolean contains(int number) {return (number >= low && number <= high);}

    public void setLow(int l) {low = l;}

    public void setHigh(int h) {high = h;}

    public int getLow() {return low;}

    public int getHigh(){return high;}
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        MYstack st = new MYstack();
        MYqueue q = new MYqueue();

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the search range for player age followed by jersey number (format ex. 0  99 0  99):");

        int startAge = sc.nextInt();
        int endAge = sc.nextInt();
        Range ageRange = new Range(startAge, endAge);

        int startNum = sc.nextInt();
        int endNum = sc.nextInt();
        Range jerseyRange = new Range(startNum, endNum);
        sc.close();

        Scanner src = new Scanner(new File("roster.txt"));

        while(src.hasNext()) {
            String lastName = src.next();
            String firstName = src.next();
            int j = src.nextInt();
            int k = src.nextInt();

            if(jerseyRange.contains(j))
                st.push(new Player(lastName, firstName, k, j));

            if(ageRange.contains(k))
                q.insert(new Player(lastName, firstName, k, j));
        }
        src.close();

        // brainlessly vomits out the stack/queue
        System.out.println("\nTHE STACK DATA STRUCT:");
        System.out.println(st.toString());

        System.out.println("\nTHE QUEUE DATA STRUCT:");
        System.out.println(q.toString());
        System.out.println();

        try { //AUTOPILOT ENGAGEEEEEEEEEEEEEEEEEEEEEE

            System.out.println("Top of stack: " + st.peek());
            System.out.println();

            System.out.println("Front of queue: " + q.peek());
            System.out.println();

            while(!st.isEmpty())
                System.out.println("Stack: " + st.pop());
            System.out.println();

            while(!q.isEmpty())
                System.out.println("Queue: " + q.remove());
            System.out.println();
        }
        catch (Exception NoSuchElementException) {
            System.err.println("This structure is empty");
        }
    }
}