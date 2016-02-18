package com.mumaoxi.fb;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by saxer on 2/18/16.
 */
public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UninstallFB.init(this, "http://weibo.com/yiuxi");
    }
}
