package com.zxin.marry.activity;

import android.view.View;
import com.zxin.marry.R;
import com.zxin.marry.base.BaseActivity;

/**
 * Created by Administrator on 2018/7/2.
 */

public class InputTopicActivity extends BaseActivity{
    @Override
    public void initData() {
        setTitleViewOnclick(R.id.ccb_marray_title,R.id.common_bar_leftBtn);
    }

    @Override
    public int setLayout() {
        return R.layout.activity_topic_input;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.common_bar_leftBtn) {
            onBackPressed();
        }
    }
}
