package bai2StopWatch;

import java.sql.SQLOutput;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime enTime;
    public LocalTime getstartTime(LocalTime startTime){
        return startTime;
    }
    public LocalTime getEndTime(LocalTime endTime){
        return endTime;
    }
    public StopWatch(){
        this.startTime=LocalTime.now();
    }
    public void Start(){
        this.startTime=LocalTime.now();
        getstartTime(startTime);
    }
    public void Stop(){
        this.enTime=LocalTime.now();
        getstartTime(enTime);
    }
    public void getElapsedTime() {
        long ElaspedTime = (enTime.toSecondOfDay() - startTime.toSecondOfDay()) * 100;
        System.out.println("Milisecond:" + ElaspedTime);
    }
    public static void main(String[] args) {
        StopWatch stopw=new StopWatch();
        stopw.Start();
        for (int i = 1; 1<=100 ;i++) {
            stopw.Stop();
            stopw.getElapsedTime();
        }
    }



    }



