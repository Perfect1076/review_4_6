import java.util.ArrayList;
import java.util.Comparator;


public class Main {


    public static void main(String[] args) {


        ArrayList<String> test = new ArrayList<String>();



        Comparator<String> y = (a, b) -> {
            if (a.length() < b.length()) {
                return -1;
            } else if (a.length() > b.length()) {
                return 1;

            } else {
                return 0;
            }
        };

        test.add("Hello");

        test.add("1");
        test.add("cool");

        test.add("coolioooooooo!");


     System.out.println(   maximum(test, y));
    }

    public static String maximum(ArrayList<String> x, Comparator<String> y) {
        String temp = "";
        for(int i = 0; i< x.size(); i++){
            if(y.compare(temp, x.get(i)) < 0){
                temp = x.get(i);
            }
        }

        return temp;


    }



}
