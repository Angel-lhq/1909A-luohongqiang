package com.example.exam8_25.util;

import android.text.TextUtils;
import android.widget.TextView;

public class TextUtil {
    public static void setText(TextView text,String str){
        if (!TextUtils.isEmpty(str)){
            text.setText(str);
        }
    }
}
