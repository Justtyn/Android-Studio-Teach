package com.example.mycontrols.util;

import android.content.Context;

public class Utils {

    // 根据手机的分辨率从 dp 转换为 ps（像素）
    public static int dip2px(Context context, float dpValue) {
        // 获取当前手机爹像素密度（ 1 个 dp 对应几个 px ）
        float scale = context.getResources().getDisplayMetrics().density;
        // 四舍五入取整
        return (int) (dpValue * scale + 0.5f);
    }
}
