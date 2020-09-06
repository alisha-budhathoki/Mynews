package com.example.androidlibraies;


public class HoroscopeDatamodel
{
    private String date;

    private String h_id;

    private String filename;

    private String onDate;

    private String of_week;

    private String name;

    private String description;

    private String id;

    private String title;

    private String descriptions;

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getH_id ()
    {
        return h_id;
    }

    public void setH_id (String h_id)
    {
        this.h_id = h_id;
    }

    public String getFilename ()
    {
        return filename;
    }

    public void setFilename (String filename)
    {
        this.filename = filename;
    }

    public String getOnDate ()
    {
        return onDate;
    }

    public void setOnDate (String onDate)
    {
        this.onDate = onDate;
    }

    public String getOf_week ()
    {
        return of_week;
    }

    public void setOf_week (String of_week)
    {
        this.of_week = of_week;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getDescriptions ()
    {
        return descriptions;
    }

    public void setDescriptions (String descriptions)
    {
        this.descriptions = descriptions;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [date = "+date+", h_id = "+h_id+", filename = "+filename+", onDate = "+onDate+", of_week = "+of_week+", name = "+name+", description = "+description+", id = "+id+", title = "+title+", descriptions = "+descriptions+"]";
    }
}

