package com.NicolasYiu.fb;

import android.content.Context;

/**
 * Created by NicolasYiu on 12/15/15.
 */
public class UninstallFB {
    static {
        System.loadLibrary("feedback");
    }

    private static UninstallFB uninstallFB;

    /**
     * 初始化卸载反馈监控程序
     *
     * @param context     应用程序的上下文
     * @param feedbackURL 卸载反馈的url
     */
    public static UninstallFB init(Context context, String feedbackURL) {
        if (uninstallFB == null) {
            uninstallFB = new UninstallFB();
        }
        uninstallFB.monitor("/data/data/" + context.getApplicationContext().getPackageName(), feedbackURL);

        return uninstallFB;
    }

    /**
     * 开始监听应用被卸载
     *
     * @param dataPackage /data/data/${YourApplicationId}
     * @param feedbackURL http://${Your website url}
     * @return string
     */
    private native String monitor(String dataPackage, String feedbackURL);

}
