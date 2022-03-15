public class TimeTask {
    int hours;
    int minutes;

    TimeTask(int hours,int minutes){
        this.hours=hours;
        this.minutes=minutes;
    }

    public void showTime(){
        System.out.println();
        System.out.println("Time: "+hours+":"+minutes);
    }

    public double Angel(){
        double angelHour = hours*30 + minutes*0.5;//ищем угол часовой стрелки
        double angelMinutes = minutes*6;//ищем угол минутной стрелки

        if(angelHour==360) angelHour=0; //если конец циферблата сразу обнулим углы, чтобы было проще
        if(angelMinutes==360) angelMinutes=0;

        double diffAngel = Math.abs(angelHour-angelMinutes);//находим разницу углов

        if(diffAngel>180){ //ищем угол
            return 360-diffAngel;
        }else{
            return diffAngel;
        }
    }
}
