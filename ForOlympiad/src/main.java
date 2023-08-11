import java.util.ArrayList;

public class main{
    public static void main(String[] args){
        for(int i = 1; i < Integer.MAX_VALUE; i++){
            SuicideRoom room = new SuicideRoom(i);
            room.res();
            int answer = (i-(int) Math.pow(2, (int) (Math.log(i)/Math.log(2))))*2+1;
            int sur = room.survivor();
            System.out.println(i+") " + (sur==answer));
            if(sur!=answer) break;
        }
        System.out.println("ended");

    }
    public static class SuicideRoom {
        private final ArrayList<Jewish> jews = new ArrayList<>();
        SuicideRoom(int n){
            for(int i = 1; i <= n; i++) jews.add(new Jewish(i));
        }
        public void res(){
            for(int i = 0; i < jews.size(); i++){
                if(jews.get(i).isAlive) {
                    boolean murderer = false;
                    for(Jewish j : jews){
                        if(j.isAlive && j.number > jews.get(i).number){
                            j.kill();
                            i = j.number-1;
                            murderer=true;
                            break;
                        }
                    }
                    if(!murderer) {
                        for (Jewish j : jews) {
                            if (j.isAlive && j.number < jews.get(i).number) {
                                j.kill();
                                i = j.number - 1;
                                murderer = true;
                                break;
                            }
                        }
                    }
                    if(!murderer) break;
                }
                if(i == jews.size()-1) i = -1;
            }

        }
        public int survivor(){
            for (Jewish j:jews) if(j.isAlive) return j.number;
            return -1;
        }

    }
    public static class Jewish{
        private int number = 0;
        Jewish(int i){
            number = i;
        }
        boolean isAlive = true;
        public void kill() {
            isAlive = false;
        }
    }
}
