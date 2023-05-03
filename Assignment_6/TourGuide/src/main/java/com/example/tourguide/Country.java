package com.example.tourguide;

import java.nio.file.Path;

public class Country {
    private String name;
    private String smImgPath;
    private String lgImgPath;

    public Country(String name, String smImgPath, String lgImgPath) {
        this.name = name;
        this.smImgPath = smImgPath;
        this.lgImgPath = lgImgPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSmImgPath() {
        return smImgPath;
    }

    public void setSmImgPath(String smImgPath) {
        this.smImgPath = smImgPath;
    }

    public String getLgImgPath() {
        return lgImgPath;
    }

    public void setLgImgPath(String lgImgPath) {
        this.lgImgPath = lgImgPath;
    }

    @Override
    public String toString() {return getName();}
}
