package com.greenacademy.travelapp.Activity.Model;

import java.util.List;

/**
 * Created by Jake on 2/11/2017.
 */

public class HeaderModel {
    private String Title;
    private String CountChild;
    private List<ChildModel> Child;

    public HeaderModel(String title, List<ChildModel> child) {
        Title = title;
        Child = child;
    }

    public List<ChildModel> getChild() {
        return Child;
    }

    public void setChild(List<ChildModel> child) {
        Child = child;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCountChild() {
        return CountChild;
    }

    public void setCountChild(String countChild) {
        CountChild = countChild;
    }

}