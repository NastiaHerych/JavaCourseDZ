package com.company;

public enum Monthes {
    January (31, Seasons.Winter), February (29, Seasons.Winter),
    March (30, Seasons.Spring), April(31, Seasons.Spring),
    May(30, Seasons.Spring), June(31, Seasons.Summer),
    July(30, Seasons.Summer), August(31, Seasons.Summer),
    September(30, Seasons.Autumn), October (31, Seasons.Autumn),
    November(30, Seasons.Autumn), December(31, Seasons.Winter);


    int days;
    Seasons seasons;


    Monthes(int days, Seasons seasons){
        this.days = days;
        this.seasons = seasons;
    }

    public int getDays(){
        return days;
    }

    public Seasons getSeasons(){
        return seasons;
    }




}
