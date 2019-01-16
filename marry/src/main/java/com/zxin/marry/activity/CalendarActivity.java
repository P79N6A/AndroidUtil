package com.zxin.marry.activity;

import android.view.View;

import com.zxin.marry.R;
import com.zxin.marry.base.BaseActivity;

/**
 * Created by Administrator on 2018/6/20.
 */

public class CalendarActivity extends BaseActivity {
    @Override
    public void initData() {
        setTitleViewOnclick(R.id.ccb_marray_title,R.id.common_bar_leftBtn);
    }

    @Override
    public int setLayout() {
        return R.layout.ac_calendar;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.common_bar_leftBtn){
            onBackPressed();
        }
    }
}