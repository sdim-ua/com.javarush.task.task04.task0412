/* 
Положительное и отрицательное число
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     
    int numb = Integer.parseInt(reader.readLine());
     
     if( numb  > 0)
        {
         System.out.println(numb  * 2);
        }
     else if (numb  < 0)
        {
         System.out.println(numb  + 1);
        }
     if (numb == 0)
        {
         System.out.println(numb);
        }
    
    }

}
