package com.tacademy.samplecustomfont;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class ParentActivity extends AppCompatActivity {

    AppCompatDelegate mDelegate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getLayoutInflater().setFactory2(this);
        mDelegate = getDelegate();
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View view = super.onCreateView(parent, name, context, attrs);

        if (view == null)
            view = mDelegate.createView(parent, name, context, attrs);

        view = setCustomFont(view, name, context, attrs);
        return view;
    }

    private View setCustomFont(View view, String name, Context context, AttributeSet attrs) {
        if (view == null) {
            if (name.equals("TextView")) {
                view = new TextView(context, attrs);
            }
        }

        if (view != null && view instanceof TextView) {
            TextView tv = (TextView)view;
            TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomFont);
            String fontName = ta.getString(R.styleable.CustomFont_android_fontFamily);
            int textSyle = ta.getInt(R.styleable.CustomFont_android_textStyle, Typeface.NORMAL);
            ta.recycle();

            if (!TextUtils.isEmpty(fontName)) {
                Typeface tf = FontManager.getInstance().getTypeface(context, fontName);

                if (tf != null) {
                    tv.setTypeface(tf, textSyle);
                }
            }
        }

        return view;
    }
}
