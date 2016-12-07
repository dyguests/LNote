package com.fanhl.scheduleview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * 日程视图
 * <p>
 * Created by fanhl on 2016/12/7.
 */

public class ScheduleView extends RecyclerView {
    public ScheduleView(Context context) {
        super(context);
    }

    public ScheduleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ScheduleView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
