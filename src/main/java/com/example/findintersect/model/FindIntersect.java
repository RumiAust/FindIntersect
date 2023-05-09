package com.example.findintersect.model;

import java.util.List;

public class FindIntersect {
    private List<Integer> intersectionList;
    private String timeInMillSec;

    public FindIntersect(List<Integer> intersectionList, String timeInMillSec) {
        this.intersectionList = intersectionList;
        this.timeInMillSec = timeInMillSec;
    }

    public List<Integer> getIntersectionList() {
        return intersectionList;
    }


    public void setIntersectionList(List<Integer> intersectionList) {
        this.intersectionList = intersectionList;
    }

    public String getTimeInMillSec() {
        return timeInMillSec;
    }

    public void setTimeInMillSec(String timeInMillSec) {
        this.timeInMillSec = timeInMillSec;
    }

    @Override
    public String toString() {
        return "FindIntersect{" +
                "intersectionList=" + intersectionList +
                ", timeInMillSec='" + timeInMillSec + '\'' +
                '}';
    }
}
