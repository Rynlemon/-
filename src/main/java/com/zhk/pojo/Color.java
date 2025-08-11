package com.zhk.pojo;

public class Color {
    private Integer colorId;
    private String colorName;
    private int colorDisabledStatus;
    private String colorNotes;

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public int getColorDisabledStatus() {
        return colorDisabledStatus;
    }

    public void setColorDisabledStatus(int colorDisabledStatus) {
        this.colorDisabledStatus = colorDisabledStatus;
    }

    public String getColorNotes() {
        return colorNotes;
    }

    public void setColorNotes(String colorNotes) {
        this.colorNotes = colorNotes;
    }
}
