// Задача 1:
/** 
Вычислить n-ое треугольного число(сумма чисел от 1 до n).
Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает 
его n-ое треугольное число.
Если число n < 1 (ненатуральное) метод должен вернуть -1.

Пример
n = 4 -> 10
n = 5 -> 15
*/

public class Answer {
        public int countNTriangle(int n) {
            if (n < 1) return -1;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    
        public static void main(String[] args) {
            int n = 0;
    
            if (args.length == 0) {
                n = 5;
            } else {
                n = Integer.parseInt(args[0]);
            }
    
            Answer ans = new Answer();
            int itresume_res = ans.countNTriangle(n);
            System.out.println(itresume_res);
        }
    }
    