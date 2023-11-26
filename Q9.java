class GameEntry {
    int score;

    public GameEntry(int score) {
        this.score = score;
    }
}

public class Q9 {
    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[3];
        A[2] = new GameEntry(550);

        GameEntry[] B = A.clone();
        A[2].score = 550;

        System.out.println("Score value of GameEntry object referenced by B[4]: " + B[2].score);
    }
}
