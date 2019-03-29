package com.hackathon.radioetzionapp.Data;

import java.util.List;

public class BroadcastDataClass {


    private int index;
    private String title;
    private String description;
    private String filename;
    private List<String> broadcasters;
    private List<String> guests;
    private List<CommentDataClass> comments;

    public BroadcastDataClass(int index, String title, String description, String filename,
                              List<String> broadcasters, List<String> guests,
                              List<CommentDataClass> comments) {
        this.index = index;
        this.title = title;
        this.description = description;
        this.filename = filename;
        this.broadcasters = broadcasters;
        this.guests = guests;
        this.comments = comments;
    }

    public int getIndex() {
        return index;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getFilename() {
        return filename;
    }

    public List<String> getBroadcastersList() {
        return broadcasters;
    }

    public String getBroadcastersListFormatted(){
        String tmp="";
        String sep = " , ";
        for (String broadcaster: broadcasters)
        {
            tmp += broadcaster+sep;
        }
        return tmp.substring(0,tmp.lastIndexOf(sep)==-1?tmp.length():tmp.lastIndexOf(sep));
    }

    public List<String> getGuestsList() {
        return guests;
    }

    public String getGuestsListFormatted(){
        String tmp="";
        String sep = " , "+"\n";
        for (String guest: guests)
        {
            tmp += guest+sep;
        }
        return tmp.substring(0,tmp.lastIndexOf(sep)==-1?tmp.length():tmp.lastIndexOf(sep));
    }

    public List<CommentDataClass> getCommentsList() {
        return comments;
    }
}
