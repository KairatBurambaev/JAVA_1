import java.util.ArrayList;

public class program_2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= 1000; i++) {
            Boolean isPrime = i >= 2;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){ isPrime = false;
                break;}
            }
            if(isPrime)
                list.add(i);
            }
        System.out.println(list);
    }
}


    

    
