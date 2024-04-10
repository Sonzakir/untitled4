import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int index=-1;
        List<Integer> mylist=new ArrayList<>();

        int maximum=Integer.MIN_VALUE;
        for(int i =0; i<=-1;i++)
        {
            if(mylist.get(i)>maximum)
            {
                index=i;
                maximum=mylist.get(i);
            }
        }
        System.out.println(maximum);

    }
}