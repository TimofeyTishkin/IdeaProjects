package JPoints;

import java.util.Arrays;

public class Cell {
    public static String[][] matrix = new String[1][1];
    public static PObject main = new MPoint(0, 0);
    public static void main(String[] args) throws InterruptedException {
        init(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        PDirection dir = PDirection.UP;
        PDirection dir2 = PDirection.RIGHT;
        for(;;){
            main.move(dir);
            main.move(dir2);
            if(main.y == 0) dir = PDirection.DOWN;
            if(main.y == matrix.length-1) dir = PDirection.UP;
            if(main.x == 0) dir2 = PDirection.RIGHT;
            if(main.x == matrix[0].length-1) dir2 = PDirection.LEFT;
            if(shouldStop()) break;
        }
    }

    private static boolean shouldStop(){
        String before = matrix[main.y][main.x];
        matrix[main.y][main.x] = ".";
        boolean shouldStop = true;
        for(String[] line : matrix) if(String.join("", line).contains("+")) shouldStop = false;
        matrix[main.y][main.x] = before;
        return shouldStop;
    }

    private static void print(String[][] matrix) throws InterruptedException {
        for(String[] line : matrix){
            for(String s : line) System.out.print(s);
            System.out.println();
        }
        System.out.println();
        System.out.println("________________________________________");
        System.out.println();
        Thread.sleep(100);
    }

    private static void init(int a, int b) throws InterruptedException {
        matrix = new String[a][b];
        for(String[] line : matrix) Arrays.fill(line, ".");
        main = new MPoint(0, a-1);
        changeMatrix(main);
    }
    public static void changeMatrix(PObject object) throws InterruptedException {
        boolean plusIsThere = matrix[object.y][object.x].equals("+");
        matrix[object.y][object.x] = object.sign;
        print(matrix);
        matrix[object.y][object.x] = plusIsThere? "." :"+";
    }
}
