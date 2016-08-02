package com.tacademy.samplecustomfont;

/**
 * Created by Tacademy on 2016-08-02.
 */
public class FontData {
    public String fontName;
    public String fileName;

    public FontData(String fontName, String fileName) {
        this.fontName = fontName;
        this.fileName = fileName;
    }

    public static final String NANUM = "nanum";
    public static final String NOTO = "noto";
    public static final String ROBOTO = "roboto";

    public static final String NANUM_FILE = "nanumgothic.ttf";
    public static final String NOTO_FILE = "NotoSansKR-Regular.otf";
    public static final String ROBOTO_FILE = "Roboto-Regular.ttf";

    static FontData[] fontDatas = { new FontData(NANUM, NANUM_FILE),
            new FontData(NOTO, NOTO_FILE), new FontData(ROBOTO, ROBOTO_FILE) };

    public static FontData searchFont(String name) {
        for (FontData fd : fontDatas) {
            if (fd.fontName.equals(name)) {
                return fd;
            }
        }

        return null;
    }
}
