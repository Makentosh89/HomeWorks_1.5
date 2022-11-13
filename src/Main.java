import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        /*
           ДЗ 1.5
        1.  Четное-нечетное.
        1.	Передать на вход программы число в качестве аргумента.
        2.	Если оно нечетное, распечатать его.
        3.	Используем оператор if.
         */
       System.out.println("Введите число !");
       int num = scanner.nextInt();
       if (num%2!=0){
           System.out.println("Число : "+num+" нечетное");
       }

        /*--------------------------------------------------------------
            1.	С помощью класса Scanner ввести целое число.
            2.	Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10”,
                иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
            3.	Используем оператор if-else.
         */
       System.out.println("Введите число !");
       int num1 = scanner.nextInt();
       if (num1 > 0 && num1<=10){
           System.out.println("число : "+num1+" положительное и меньше 10");
       }else if (num1 > 10 ){
           System.out.println("число : "+num1+" положительное и больше 10");
       }else if (num1 < 0 ){
           System.out.println("число : "+num1+" отрицательное");
       }

        /*----------------------------------------------------------------
            1.	Передать на вход программы число От 1 до 7 в качестве аргумента.
            2.	Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
                Если 6 или 7 – “Выходной”. Используем конструкцию if-else-if.
         */
       System.out.println("Введите число !");
       int number = scanner.nextInt();
       if (number==1){
           System.out.println("Понедельник");
       }else if (number==2){
           System.out.println("Вторник");
       }else if (number==3) {
           System.out.println("Среда");
       }else if (number==4){
           System.out.println("Четверг");
       }else if (number==5){
           System.out.println("Пятница");
       }else if (number==6 || number==7){
           System.out.println("Выходной");
       }else{
           System.out.println("Неправильно указан день недели !");
       }

        /*-----------------------------------------------------------------
            В переменной min лежит число от 0 до 59. Определите в какую четверть часа попадает это число
            (в первую, вторую, третью или четвертую)
         */
       int min=15;
       if ( min>0 &&min <=15){
           System.out.println("первая четверть !");
       }else  if (min>15 && min<=30){
           System.out.println("Вторая четверть");
       }else  if (min>30 && min<=45){
           System.out.println("Третья четверть");
       }else if (min>45 && min<59){
           System.out.println("Четвертая четверть");
       }
       System.out.println(min);

        /*-------------------------------------------------------------
            В переменной month лежит какое-то число из интервала от 1 до 12 .
            Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).
         */
        int month=5;
        if (month==12 || month==1 || month==2){
            System.out.println("Зима");
        }else if (month==3 || month==4 || month==5){
            System.out.println("Весна");
        }else if(month==6 || month==7 || month==8){
            System.out.println("Лето");
        }else if (month==9 || month==10 || month==11){
            System.out.println("Осень");
        }else {
            System.out.println("Неправильно указали время года");
        }
        System.out.println(month);
        
        /*-----------------------------------------------------------------
        Переписать задание 3. Четное-нечетное используя switch.
         */

        System.out.println("введите число !");
        int days = scanner.nextInt();

        switch (days){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятица");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
