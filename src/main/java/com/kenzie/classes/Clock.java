package com.kenzie.classes;

public class Clock {
    private int hour;
    private int minute;
    private String timeZone;
    private String period;
    // default constructor
    public Clock() {
        this.hour = 12;
        this.minute = 0;
        this.timeZone = "Eastern";
        this.period = "AM";
    }
    // all instance variables given constructor
    public Clock(int hour, int minute, String period, String timeZone) {
        // check if all params are within valid range, if not, default value
        if (hour < 1 || hour > 12) {
            this.hour = 12;
        } else {
            this.hour = hour;
        }
        if (minute < 0 || minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
        if (period.equals("AM") || period.equals("PM")) {
            this.period = period;
        } else {
            this.period = "AM";
        }
        if (timeZone.equals("Eastern")
                || timeZone.equals("Central")
                || timeZone.equals("Mountain")
                || timeZone.equals("Pacific")) {
            this.timeZone = timeZone;
        } else {
            this.timeZone = "Eastern";
        }
    }

    public boolean setHour(int hour) {
        if (hour < 1 || hour > 12) {
            return false;
        } else {
            this.hour = hour;
        }
        return true;
    }

    public boolean setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            return false;
        } else {
            this.minute = minute;
        }
        return true;
    }

    public boolean setTimeZone(String timeZone) {
        if (timeZone.equals("Eastern")
                || timeZone.equals("Central")
                || timeZone.equals("Mountain")
                || timeZone.equals("Pacific")) {
            this.timeZone = timeZone;
            return true;
        } else {
            return false;
        }
    }

    public boolean setPeriod(String period) {
        if (period.equals("AM") || period.equals("PM")) {
            this.period = period;
            return true;
        } else {
            return false;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getPeriod() {
        return period;
    }
}
