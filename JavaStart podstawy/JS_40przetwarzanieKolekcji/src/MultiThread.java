import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiThread {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list=list.stream()
                .parallel()
                .map(MultiThread::incrementValue)
                .collect(Collectors.toList());
    }

    public static int incrementValue(int x){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("przetwarzam: "+x);
        return x+1;
    }
}
