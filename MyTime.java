/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Time;

/**
 *
 * @author rhenz
 */
public class MyTime {
   private int hour;
   private int minute;
   private int second;
   private boolean meridian; 

    public void setHour(int hour) {
        this.hour = hour;

        if(this.hour>=12 && this.meridian == true){
            this.hour=this.hour-12;
            this.meridian= false;
        }
        if(this.hour>=12 && this.meridian == false){
            this.hour=this.hour-12;
            this.meridian= true;
        }
    }

    public void setMinute(int minute) {
        this.minute = minute;

        if(this.minute >= 60){
            this.minute-=60;
            this.hour++;
        }
    }

    public void setSecond(int second) {
        this.second = second;
   
        if(this.second >= 60){
            this.second-=60;
            this.minute++;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public boolean isMeridian() {
        return meridian;
    }
    
    

    public void setMeridian(boolean meridian) {
        
        this.meridian = meridian;
    }
    
    public void advanceTime(int seconds){
        this.second += seconds;
    }
    
public void tickByHour() {
    this.hour += 1;

    if (this.hour >= 12) {
        this.hour -= 12;
        this.meridian = !this.meridian;
    }
}

public void tickByMinute() {
    this.minute += 1;

    if (this.minute >= 60) {
        this.minute -= 60;
        this.hour += 1;

        if (this.hour >= 12) {
            this.hour -= 12;
            this.meridian = !this.meridian;
        }
    }
}

public void tickBySecond() {
    this.second += 1;

    if (this.second >= 60) {
        this.second -= 60;
        this.minute += 1;

        if (this.minute >= 60) {
            this.minute -= 60;
            this.hour += 1;

            if (this.hour >= 12) {
                this.hour -= 12;
                this.meridian = !this.meridian;
            }
        }
    }
}

    
    public void display12hour(){
        String mer = meridian ? "AM" : "PM";
        System.out.println(hour + ":" + minute + ":" + second + " " + mer);
    }
   
    public void display24hour(){
        
    }
   
}
