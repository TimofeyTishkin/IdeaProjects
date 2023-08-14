package SinGraphic;

public abstract class Point {
    public int x;
    public long y;
    public char sign;
    public Point(int x, int y, char sign){
        this.x = x;
        this.y = y;
        this.sign = sign;
    }
    public abstract void move();
    public abstract void checkBoards();
}
