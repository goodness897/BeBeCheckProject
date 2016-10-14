package com.example.mu.bebecheckproject.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.example.mu.bebecheckproject.R;

/**
 * Created by Mu on 2016-10-14.
 */

public class NursingTimeView extends FrameLayout {
    public NursingTimeView(Context context) {
        super(context);
        init();
    }


    public NursingTimeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    private void init() {
        inflate(getContext(), R.layout.view_nursing_time, this);


    }

    public void setData(){

    }

}
