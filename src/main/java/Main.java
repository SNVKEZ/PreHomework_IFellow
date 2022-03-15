import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int i=0;
        while (i<1000){
            System.out.print("Please, choose task: ");
            i= in.nextInt();
            if(i==1) task1();
            if(i==2) task2();
            if(i==3) task3();
            if(i==4) task4();
        }


    }

    public static void task1(){
        System.out.println("Task 1.");
        System.out.println("Please, enter amount of elements: ");
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

        double min = max;//можно взять максимальный элемент так как больше него нет в массиве
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
        System.out.println("Task 2.");
        System.out.println("Please, enter your word: ");
        String s = in.nextLine();//данный метод необходим, чтобы следующий nextLine не перепрыгивался, впервые с таким
        //столкнулся, больше решения не нашел в данный момент...
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
    public static void task3(){
        System.out.println("Task 3.");
        System.out.println("Please, enter the number of degrees Celsius");
        double grad = in.nextDouble();
        System.out.println("Please select which degrees to convert to (you need to select a number):");
        System.out.println("1 - Fahrenheit");
        System.out.println("2 - Kelvin");
        System.out.println("3 - Rankin");
        System.out.println("4 - Delisle");
        System.out.println("5 - Newton");
        System.out.println("6 - Réaumur");
        System.out.println("7 - Römer");
        int i = in.nextInt();
        BaseConverter baseConverter = new BaseConverter(i,grad);
        baseConverter.convert();

    }
    public static void task4(){
        System.out.println("Task 4.");
        int hourse = -1, minutes=-1;

        while(hourse<0 || hourse>12) {//будем запрашивать час пока не будет введено число из диапазона
            System.out.print("Please,enter time in hours(0-12): ");
            hourse = in.nextInt();
        }

        while (minutes<0 || minutes>60){//будем запрашивать минуты пока не будет введено число из диапазона
            System.out.print("Please,enter time in minutes(0-60): ");
            minutes = in.nextInt();
        }

        TimeTask timeTask = new TimeTask(hourse,minutes);
        timeTask.showTime();//выводим время еще раз на всякий случай
        System.out.println("Angel of hour and minute hand: "+timeTask.Angel());
        //считаем угол между стрелками

    }


}
