import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class Counter {
    public static void main(String[] args) throws IOException {
        new Wind(3);
        new Wind(2);

    }

}
class Wind{
    private int speed;
    Wind(int speed){
        this.speed = speed;

        System.out.println(speed>2?"It's windy~":"NeverMind.");
    }

}
