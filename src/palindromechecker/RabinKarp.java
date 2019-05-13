package palindromechecker;

import java.util.*;

public class RabinKarp {

    private int M; // pattern length
    private long Q; // a large prime
    private int R = 256; // alphabet size

    public RabinKarp() {
        M = 0;
        Q = 997;
    }

    private long hash(String key, int M) {
        long h = 0;
        for (int j = 0; j < M; j++) {
            h = (R * h + key.charAt(j)) % Q;
        }
        return h;
    }

    public void search() {
        Scanner s = new Scanner(System.in);
        
        String forward = "";
        String reverse = "";
        long forwardHash = hash(forward, 0);
        long reverseHash = hash(reverse, 0);
        
        System.out.println("Click 'enter' and input a character to add on each character; "
                + "enter 'DONE' to stop the program");
        
        while (!s.nextLine().equals("DONE")) {
            char c = s.nextLine().charAt(0);
            forward += c;
            M++;
            forwardHash = (forwardHash * R + c) % Q;
            reverseHash = ((long)(Math.pow(R, M-1)) * c + reverseHash) % Q;
            if (forwardHash == reverseHash) {
                System.out.println(forward + " is a palindrome");
            } else {
                System.out.println(forward + " is not a palindrome");
            }
        }
    }
}