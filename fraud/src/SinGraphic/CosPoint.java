package SinGraphic;

public class CosPoint extends Point{
    public CosPoint(int x, int y) {
        super(x, y, 'C');
    }

    @Override
    public void move() {
        Main.matrix[(int) this.y][this.x] = "+";
        this.x++;
        this.y = Math.round(Math.cos(this.x / 10.0) * 10) + 12;
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
