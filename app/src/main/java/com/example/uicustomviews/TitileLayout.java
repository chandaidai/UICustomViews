package com.example.uicustomviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/2/28 0028.
 */

public class TitileLayout extends LinearLayout {
    public TitileLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
       Button titleBack = (Button) findViewById(R.id.title_back);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"ssssssss",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
