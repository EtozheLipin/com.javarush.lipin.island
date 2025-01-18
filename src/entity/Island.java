package entity;

public class Island {

    int x;

    int y;

    public Location[][] map = new Location[x][y];

    public Island(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
