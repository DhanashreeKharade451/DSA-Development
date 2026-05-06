package OOPs.Classes;

public class Chess {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();

    }
}

interface ChessPlayer {
    void moves(); // this is by default public and abstract

}

class Queen implements ChessPlayer {
    public void moves() { // made this public because by default it is default
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() { // made this public because by default it is default
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() { // made this public because by default it is default
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}
