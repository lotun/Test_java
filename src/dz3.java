import java.util.ArrayList;

/**
 * Created by Alex on 10.03.2017.
 */
public class dz3 {
    public static void main (String args []) {
         //integer col = new ArrayList();
        System.out.println(1);
        for(int i=2;i<10;i++){
            Integer k = Integer.valueOf(i);
            int j=1;
            while(j < i){
                k+=i;
                j++;
            }
            System.out.println(k);
            //k=0;
        }
    }
}
