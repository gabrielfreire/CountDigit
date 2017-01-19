/**
 * Created by Gabriel Freire on 19/01/2017.
 */
public class CountDigit {
    public static void main(String[] args) {
        System.out.println(nbDig(10, 1));
    }
    public static int nbDig(int n, int d) {
        int count = 0;
        for(int i = 0; i <= n; i++){
            int num = (int) Math.pow(i, 2);
            if(num < 10 && num == d){
                count++;
            }else{
                int repeat = checkRepeatedCharacters(num, d);
                if(repeat > 0){
                    count += repeat;
                }
            }
        }
        return count;
    }
    public static int checkRepeatedCharacters(int n, int d){
        Integer a = n;
        int count = 0;
        String[] number = a.toString().split("");
        for(int i = 0; i < number.length; i++){
            if(Integer.parseInt(number[i]) == d)
                count++;
        }
        return count;

    }
}
