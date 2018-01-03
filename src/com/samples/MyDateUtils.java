/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples;

/**
 *
 * @author ken
 */
public class MyDateUtils {
    
    int[] daysUptoMonth = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
    int[] daysUptoLeapMonth = { 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335 };
    
    public MyDateUtils() {
        
    }
    
    public int difference(MyDate date, MyDate date2) {
        System.out.println("difference Method called ");
        // convert to seconds
        int daysDiff = 0;
        if(date2.getYear() == date.getYear()) {
            daysDiff = getDaysDifferenceInSameYear(date, date2);
            System.out.println("remaining days same year " + daysDiff);
        }else {
            
            // get remaining days
            daysDiff = getDaysRemaining(date);
            date.setYear(date.getYear() + 1);
            
            System.out.println("remaining days " + daysDiff);
            
            while(date.getYear() < date2.getYear()) {
                daysDiff += date.isLeapYear()? 366 : 365;
                date.setYear(date.getYear() + 1);
            }
            
            // get the reaminig days
            daysDiff += getDaysInYearsTillDate(date2);
        }
        
        return daysDiff;
    }
    
    public int getDaysRemaining(MyDate date) {
        
        System.out.println("getDaysRemaining Method called ");
        if(date.isLeapYear()) {
            if(date.getMonth() == 12) 
                return 31- date.getDay();
            else 
                return 366 - daysUptoLeapMonth[date.getMonth()-1] + date.getDay();
            
        }else {
            if(date.getMonth() == 12) 
                return 31- date.getDay();
            else
                return 365 - (daysUptoMonth[date.getMonth()-1]) + date.getDay();
        }
    }   
    
    public int getDaysInYearsTillDate(MyDate date)
    {
        
        System.out.println("getDaysInYearsTillDate Method called ");
      if (date.isLeapYear())
      {
        return daysUptoLeapMonth[date.getMonth() - 1] + date.getDay();
      }
      else
      {
        return daysUptoMonth[date.getMonth()-1] + date.getDay();
      }
    }
    
    public int getDaysDifferenceInSameYear(MyDate date, MyDate date2)
    {
        
        System.out.println("getDaysDifferenceInSameYear Method called ");
      if (date.isLeapYear())
      {
        return daysUptoLeapMonth[date2.getMonth() - 1] - daysUptoLeapMonth[date.getMonth() - 1] +
                (date2.getDay() - date.getDay());
      }
      else
      {
        return daysUptoMonth[date2.getMonth() - 1] - daysUptoMonth[date.getMonth() - 1] +
                (date2.getDay() - date.getDay());
      }
    }
}
