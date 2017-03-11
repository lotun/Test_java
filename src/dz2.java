/**
 * Created by Alex on 10.03.2017.
 */
public class dz2 {
    public static void main (String args []) {
        for (int i =0;i<=1000;i++){
            if(prostoe_chislo(i)){
                System.out.println(i);
            }
        }
    }
    static boolean prostoe_chislo(long num)
    {
        boolean result = false;

        if (num <= 1)
            result= false;
        if (num == 2 || num ==3)
            result= true;
        else
        {
            for(int i = 2; i*i<=num ; i++)
            {
                if(num % i == 0)
                {
                    result = false;
                    break;
                }
                else
                    result = true;
            }
        }
        return result;

    }
}
