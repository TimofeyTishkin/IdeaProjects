public class MainClass {
    public static int conSum(int num) {
        int count = 1;
        for(int i = 2; i < Math.sqrt(2*num);i++){
            if(i%2==0 && num%i == i/2) count++;
            else if(i%2==1 && num%i == 0) count++;
        }
        return count;
    }
    /*public static int conSumma(int num){
        if(num == 1) return num;
        int count = num%2 == 1? 2 : 1;
        for(int i = 3; i < num/2 +1; i+=2) if(num%i == 0) count++;
        return count;
    }*/
    public static int conSumo(int num){
        int count = 1;
        for(int i = 2;i < Math.sqrt(2*num);i++)
            if(((double)num/i   - i/2.0 + 1/2.0)%1 == 0) count++;
        return count;
    }

    public static void main(String[] args) {
        /*new Thread(() -> {
            for(;;){
                try {
                    Thread.sleep(3600000); System.out.println("1 hour left");
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }).start();*/
        for(int i = 120000000; i < 2000000000; i++) {
            int con1 = conSum(i);
            int con3 = conSumo(i);
            if (i % 10000000 == 0) System.out.println("its over " + i + "!!!!");
            if (con1 != con3 || con1 == 1) {
                System.out.println(i);
                System.out.println(con1 + " : " + con3);
            }
        }
    }
}