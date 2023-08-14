import java.util.Arrays;

public class taskS {

    public static int[] pendulum(final int[] values) {
        Arrays.sort(values);
        int[] result = new int[values.length];
        int i = (values.length-1)/2;
        int j = i+1;
        int n = 0;
        for (int x : values) {
            result[n++%2==0 ? i-- : j++] = x;
        }
        return result; // Do your magic!
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(pendulum(new int[]{33,38,38,36,43,48,32,40,47,50,33})));
        System.out.println(Arrays.toString(new int[]{50,47,40,38,33,32,33,36,38,43,48}));
    }
}
