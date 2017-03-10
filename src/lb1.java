

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
//числа ситаются в 0й позиции

import java.util.Scanner; // импортируем класс

 class fibonachi {
     long f1=0;
     long f2=1;

    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) {  // возвращает истинну если с потока ввода можно считать целое число
             i = sc.nextInt();
        }
        else {
             i = 19;
        }
        System.out.println("Число Фибоначчи заданного индекса");
        System.out.println(fib(i));
        System.out.println("Число Фибоначчи 19 индекса");
        fibPrint(19);
        System.out.println("Число Фибоначчи 43 индекса");
        fibPrint(43);

        if(prostoe_chislo(fib(41))){
            System.out.println("Число Фибоначчи 41 индекса ");
            System.out.println(fib(41));
            System.out.println(" натуральное");
        }
        else {
            System.out.println("Число Фибоначчи 41 индекса ");
            System.out.println(fib(41));
            System.out.println(" не натуральное");
        }
        System.out.println("Порядковый номер 1836311903 ");
        System.out.println(indexNam(1836311903));

    }
     private  static   long  fib(int i){
         if ( i == 0){
             return 0;
         }
         if (i == 1){
             return 1;
         }
         else{
             return fib(i - 1) + fib(i - 2);
         }
     }
     private static void   fibPrint(int i){
         for(int j=0;j<=i;j++){
             System.out.println(fib(j));
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
     private static int indexNam(long nam) {
         long l=0;

         int i = 0;
         while (nam >=l){
             l=fib(i);
             if(l==nam){break;}
             i++;
         }
         return i;
     }

}
