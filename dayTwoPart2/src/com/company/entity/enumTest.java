package com.company.entity;

public class enumTest {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    Day day;
    public enumTest(Day day){
        this.day = day;
    }
    public void weekendOrWeekday(){
        switch (day){
            case SATURDAY: case SUNDAY:
                System.out.println("Its the weekend");
                break;
            default:
                System.out.println("It's s weekday");
        }
    }

}
