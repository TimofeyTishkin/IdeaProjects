package SinGraphic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static String[][] matrix;
    public static List<Point> points = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        initialise(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        for(int i = 0; i < matrix[0].length-1; i++){
            for(Point p : points) p.move();
            Thread.sleep(100);
        }
    }

    private static void initialise(int a, int b){
        matrix = new String[a][b];
        for(String[] line : matrix) Arrays.fill(line, ".");
        points.add(new SinPoint(0, matrix.length-1));
        points.add(new CosPoint(0, matrix.length-1));
    }
    private static void print(){
        for(int i = matrix.length-1; i >= 0; i--) System.out.println(String.join("", matrix[i]));
        System.out.println("\n--------------------------------------------------------\n");
    }

    public static void change() {
        for(Point p : points) matrix[(int) p.y][p.x] = p.sign+"";
        print();
    }
}
