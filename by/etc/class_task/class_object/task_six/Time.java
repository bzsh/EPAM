package by.etc.class_task.class_object.task_six;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if( hours < 24) {
            this.hours = hours;
        }else {
            this.hours = 0;
        }
        if(minutes < 60) {
            this.minutes = minutes;
        }else {
            this.minutes = 0;
        }
        if(seconds < 60) {
            this.seconds = seconds;
        }else {
            this.seconds = 0;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if( hours < 24) {
            this.hours = hours;
        }else {
            this.hours = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes < 60) {
            this.minutes = minutes;
        }else {
            this.minutes = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds < 60) {
            this.seconds = seconds;
        }else {
            this.seconds = 0;
        }
    }

    @Override
    public String toString() {
        return "The time is {" +
                "hours = " + hours +
                ", minutes = " + minutes +
                ", seconds = " + seconds +
                '}';
    }
}
