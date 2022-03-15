import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
    }

    public static void task1(){
        System.out.println("Task 1:");
        System.out.println("Please, enter amount of elements");
        int count = in.nextInt();// вводим количество элементов в массиве

        double arr[] = new double[count]; //инциализируем массив
        for(int i=0;i< arr.length;i++){ //заполняем случайными значениями
            arr[i]=Math.random();
        }

        System.out.println("Output array:");
        for (double i:arr //вывод массива
        ) {
            System.out.print(i+", ");
        }

        System.out.println();
        double max = -1;//выбираем самое наименьшее значение чтоб сравнивать с ним
        for (double i:arr //ищем максималное значение
        ) {
            if(i>max)
            {max=i;}
        }
        System.out.println("Max value: "+max);

        double min = max;//можно взять максимальный элемент чтобы так как больше него нет в массиве
        for (double i: arr
        ) {
            if(i<min) min=i;
        }
        System.out.println("Min value: "+min);

        double sum=0;
        for (double i:arr
        ) {
            sum=sum+i;
        }
        System.out.println("Mean: "+sum/count);
    }


    public static void task2(){
        System.out.println("Task 2");
        System.out.println("Please, enter your word: ");
        String str = in.nextLine();//вводим наше слово
        str = str.toLowerCase();//переводим все в нижний регистр чтобы сравнение проходило корректно
        char[] myChar = str.toCharArray();//переобразуем в массив
        //при помощи сравнения очередного символа и всех символов, которые стоят после него
        //находим повторении
        ArrayList<Character> helpChar = new ArrayList<>(); //этот список нужен, чтобы
        //если символ уже повторился мы не выводили его по несколько раз

        for(int i=0;i< myChar.length-1;i++){
            for(int j=i+1;j<myChar.length;j++){
                if(myChar[i]==myChar[j] && !helpChar.contains(myChar[i])) {
                    helpChar.add(myChar[i]);
                    System.out.println("Repeating character: "+myChar[i]);
                }
            }
        }
    }
    public static void task3(){}
    public static void task4(){}


}
