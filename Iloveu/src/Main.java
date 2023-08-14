import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;

class Main {
    /** task 23 EGE
     public static void main(String[] args) throws IOException {
        int[] a = new int[21];
        a[1] = 1;
        for(int i = 1; i < 20; i++){
            a[i+1] = a[i];
            if((i+1)%2==0) a[i+1]+=a[(i+1)/2];
            if(i==10){
                for(int k = 0; k < 10; k++) a[k]=0;
            }
        }
        System.out.println(a[20]);
    }*/


    //task 24 EGE
      public static void main(String[] args)  throws IOException{
          BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\aatis\\Downloads\\КЕГЭ_2022_Демо_Файлы__7ada\\24.txt"))));
          String s = reader.readLine();
          int count = 0;
          int max = 0;
          boolean isPreviousP = false;
          for(int i = 0; i < s.length(); i++){
              if(s.charAt(i)=='P'){
                  if(isPreviousP) {
                      count = 0;
                  }
                  isPreviousP=true;
              } else {isPreviousP = false;}
              count++;
              if(count>max) max=count;
        }
        System.out.println(max);
    }
}
