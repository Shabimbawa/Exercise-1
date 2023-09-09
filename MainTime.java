/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Time;

/**
 *
 * @author rhenz
 */
public class Main {
    public static void main(String[] args) {
        MyTime Time1 = new MyTime();
        Time1.setHour(9);
        Time1.setMinute(27);
        Time1.setSecond(30);
        Time1.setMeridian(false);
        Time1.tickByHour();
        Time1.tickByHour();
        Time1.advanceTime(60);
        Time1.tickByHour();
        Time1.tickByHour();
        
        Time1.display12hour();
    }
}
