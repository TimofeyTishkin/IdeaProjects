import java.io.*;
import java.util.Properties;

public class baggens{
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(baggens.class.getResourceAsStream("ManulCount.properties"));
        int mCount = Integer.parseInt(prop.getProperty("countOfCats"));
        FileWriter fileWriter = new FileWriter(new File("Манулы.txt"), true);
        if(mCount <= 0) fileWriter.write("ОШИБКА!" + mCount + " манул" + getLastPart(-mCount));
        for(int i = 1; i <= mCount; i++) fileWriter.write(i + " манул"+ getLastPart(i) + '\n');
        fileWriter.close();
    }
    public static String getLastPart(int positiveCountOfCats) {
        String lastPart;
        switch (positiveCountOfCats%10){
            case 1: if(positiveCountOfCats%100 == 11) lastPart = "ов"; else lastPart = "" ; break;
            case 2: if(positiveCountOfCats%100 == 12) lastPart = "ов"; else lastPart = "а"; break;
            case 3: if(positiveCountOfCats%100 == 13) lastPart = "ов"; else lastPart = "а"; break;
            case 4: if(positiveCountOfCats%100 == 14) lastPart = "ов"; else lastPart = "а"; break;
            default: lastPart = "ов";
        }
        return lastPart;
    }
}