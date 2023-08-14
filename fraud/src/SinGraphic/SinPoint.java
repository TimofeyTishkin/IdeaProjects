package SinGraphic;

public class SinPoint extends Point {
    public SinPoint(int x, int y) {
        super(x, y, 'S');
    }

    @Override
    public void move() {
        Main.matrix[(int) this.y][this.x] = "+";
        this.x++;
        this.y = Math.round(Math.sin(this.x / 10.0) * 10) + 12;
        checkBoards();
        Main.change();
    }

    @Override
    public void checkBoards() {
        if(this.x < 0) this.x = 0;
        if(this.x >= Main.matrix[0].length) this.x = Main.matrix[0].length-1;
        if(this.y < 0) this.y = 0;
        if(this.y >= Main.matrix.length) this.y = Main.matrix.length-1;
    }
}
