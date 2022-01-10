public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        if (hour >= 24 ){
            this.hour = 0;
        }
        if (min >= 60 ){
            this.min = 0;
        }
        if (sec >= 60 ){
            this.sec = 0;
        }

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour >= 24 ){
            this.hour = 0;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
        if (min >= 60 ){
            this.min = 0;
        }
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
        if (sec >= 60 ){
            this.sec = 0;
        }

    }

    public void setTime(int hour, int min, int sec){
        this.hour = hour;
        if (hour >= 24 ){
            this.hour = 0;
        }
        this.min = min;
        if (min >= 60 ){
            this.min = 0;
        }
        this.sec = sec;
        if (sec >= 60 ){
            this.sec = 0;
        }
    }

    @Override
    public String toString() {
        int hour = this.hour;
        String strHour = String.valueOf(hour);
        int min = this.min;
        String strMin = String.valueOf(min);
        int sec = this.sec;
        String strSec= String.valueOf(sec);
        if(strHour.length() >= 2 && strMin.length() >= 2 && strSec.length() >= 2){
            return strHour + ":" + strMin + ":" + strSec;
        }
        else if (strHour.length() >= 2  && strMin.length() >= 2){
            return strHour + ":" + strMin + ":"  + "0" + strSec;
        }
        else if (strSec.length() >= 2  && strMin.length() >= 2){
            return "0" + strHour + ":" + strMin + ":" + strSec;
        }
        else if (strSec.length() >= 2  && strHour.length() >= 2){
            return strHour + ":" + "0" + strMin + ":" + strSec;
        }
        else if (strSec.length() >= 2){
            return "0" + strHour + ":" + "0" + strMin + ":" + strSec;
        }
        else if (strMin.length() >= 2){
            return "0" + strHour + ":" +  strMin + ":" + "0" + strSec;
        }
        else if (strHour.length() >= 2){
            return strHour + ":" + "0" + strMin + ":" + "0" + strSec;
        }
        return  "0" + strHour + ":" + "0"  + strMin + ":" + "0" + strSec ;
    }

    public Time nextSecond(){
        sec++;
        if (sec >= 60){
            min++;
            sec = 0;
            if (min >= 60){
                hour++;
                min = 0;
                if (hour >= 24){
                    hour = 0;
                    return this;
                }
            }
        }
        return this;
    }

}
