package JPoints;

public abstract class PObject {
    public String sign;
    public int x;
    public int y;

    public PObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PObject(int x, int y, String sign) {
        this.x = x;
        this.y = y;
        this.sign = sign;
    }

    public void move(PDirection direction) throws InterruptedException {
        switch (direction) {
            case UP -> {y -= 1;}
            case DOWN ->{y += 1;}
            case RIGHT ->{x += 1 + (y <= Cell.matrix.length/5 || y >= Cell.matrix.length*4/5? 1 : 0);}
            case LEFT -> {x -= 1 + (y <= Cell.matrix.length/5 || y >= Cell.matrix.length*4/5? 1 : 0);}
        }
        checkBoards();
        Cell.changeMatrix(this);

    }

    private void checkBoards() {
        if(x > Cell.matrix[0].length-1) x = Cell.matrix[0].length-1;
        if(x < 0) x = 0;
        if(y > Cell.matrix.length-1) y = Cell.matrix.length-1;
        if(y < 0) y = 0;
    }
}
