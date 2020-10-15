

public class Main {

    public static String hash(int num) {
        int res = -1;
        int i = 0;

        int[] resArr = new int[10];
        do {
            resArr[i] = num % 10;
            num /= 10;
            i++;
        }while (num != 0);

        for (int val : resArr){
            int v1 = val;
            v1 +=2;

            int mod = val % v1;

            res = res + val*v1+mod * Math.floorDiv(i,2);

        }

     return String.valueOf(res);
    }

    public static void main(String[] args) {
        System.out.println(hash(123));
        System.out.println(hash(125));
        System.out.println(hash(126));
        System.out.println(hash(123));
    }
}
