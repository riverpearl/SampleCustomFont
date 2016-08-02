package com.tacademy.samplecustomfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CustomFontActivity extends ParentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_font);

//        TextView tv = (TextView)findViewById(R.id.text_nanum);
//        Typeface tf = FontManager.getInstance().getTypeface(this, FontData.NANUM);
//        tv.setTypeface(tf);
//
//        tv = (TextView)findViewById(R.id.text_noto);
//        tv.setTypeface(FontManager.getInstance().getTypeface(this, FontData.NOTO));
//
//        tv = (TextView)findViewById(R.id.text_roboto);
//        tv.setTypeface(FontManager.getInstance().getTypeface(this, FontData.ROBOTO));
    }
}
