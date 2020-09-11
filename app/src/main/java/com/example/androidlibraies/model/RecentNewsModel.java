package com.example.androidlibraies.model;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RecentNewsModel {

//            "current_page": 1,
//            "data":
//            "first_page_url": "https://aahakhabar.com/api/news/recent?page=1",
//            "from": 1,
//            "last_page": 2076,
//            "last_page_url": "https://aahakhabar.com/api/news/recent?page=2076",
//            "next_page_url": "https://aahakhabar.com/api/news/recent?page=2",
//            "path": "https://aahakhabar.com/api/news/recent",
//            "per_page": 10,
//            "prev_page_url": null,
//            "to": 10,
//            "total": 20760

    @SerializedName("current_page")
    private int currentpage;
    @SerializedName("data")
    ArrayList<RecentNewsDataModel> recentNewsDataModel;
    @SerializedName("first_page_url")
    private String firstpage;
    @SerializedName("from")
    private int from;
    @SerializedName("last_page")
    private int lastpage;
    @SerializedName("last_page_url")
    private String lastpageurl;
    @SerializedName("next_page_url")
    private String nextpageurl;
    @SerializedName("path")
    private String path;
    @SerializedName("prev_page")
    private int prevpage;
    @SerializedName("prev_page_url")
    private String prevpageurl;
    @SerializedName("to")
    private int to;
    @SerializedName("total")
    private int total;

    public int getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(int currentpage) {
        this.currentpage = currentpage;
    }

    public ArrayList<RecentNewsDataModel> getRecentNewsDataModel() {
        return recentNewsDataModel;
    }

    public void setRecentNewsDataModel(ArrayList<RecentNewsDataModel> recentNewsDataModel) {
        this.recentNewsDataModel = recentNewsDataModel;
    }

    public String getFirstpage() {
        return firstpage;
    }

    public void setFirstpage(String firstpage) {
        this.firstpage = firstpage;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getLastpage() {
        return lastpage;
    }

    public void setLastpage(int lastpage) {
        this.lastpage = lastpage;
    }

    public String getLastpageurl() {
        return lastpageurl;
    }

    public void setLastpageurl(String lastpageurl) {
        this.lastpageurl = lastpageurl;
    }

    public String getNextpageurl() {
        return nextpageurl;
    }

    public void setNextpageurl(String nextpageurl) {
        this.nextpageurl = nextpageurl;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getPrevpage() {
        return prevpage;
    }

    public void setPrevpage(int prevpage) {
        this.prevpage = prevpage;
    }

    public String getPrevpageurl() {
        return prevpageurl;
    }

    public void setPrevpageurl(String prevpageurl) {
        this.prevpageurl = prevpageurl;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
