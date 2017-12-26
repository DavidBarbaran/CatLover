package com.catlover.catlover.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.catlover.catlover.R;

/**
 * Created by DAVID on 25/12/2017.
 */

public class FontText extends AppCompatTextView{

    String mFontPath;

    public FontText(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (attrs != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.FontText);
            mFontPath = typedArray.getString(R.styleable.FontText_typeface);
            if (mFontPath != null && !mFontPath.isEmpty()) {
                Typeface typeface = Typeface.createFromAsset(context.getAssets(), mFontPath);
                setTypeface(typeface);
            }

            setTransformationMethod(null);
        }
    }

    public FontText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}