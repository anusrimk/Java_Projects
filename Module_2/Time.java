// Question 6
package Module_2;

public class Time {
    private int hr;
    private int min;
    private int sec;

    Time(){
        this.hr = 12;
        this.min = 0;
        this.sec = 0;
    }

    Time(int h, int m, int s){
        this.hr = h;
        this.min = m;
        this.sec = s;
    }

    Time(int secs){
        this.hr = secs / 3600;
        this.min = (secs % 3600) / 60;
        this.sec = secs % 60;
    }

    public void setClock(int secs){
        this.hr = secs / 3600;
        this.min = (secs % 3600) / 60;
        this.sec = secs % 60;
    }

    public void tick(){
        this.sec++;
        if(this.sec == 60){
            this.sec = 0;
            this.min++;
        } 
        if(this.min == 60){
            this.min = 0;
            this.hr++;
        }
    }

    public void tickDown(){
        this.sec--;
        if(this.sec == -1){
            this.sec = 59;
            this.min--;
        }
        if(this.min == -1){
            this.min = 59;
            this.hr--;
        }
    }

    public void displayTime(){
        System.out.println(this.hr + ":" + this.min + ":" + this.sec);
    }
}
