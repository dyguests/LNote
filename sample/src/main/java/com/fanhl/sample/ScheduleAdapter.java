package com.fanhl.sample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fanhl.sample.model.Action;

import java.util.ArrayList;
import java.util.List;

/**
 * 日程表适配器
 * <p>
 * Created by fanhl on 2016/12/7.
 */
public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ViewHolder> implements Listable<Action> {

    private final Context context;
    /**
     * 取得的活动
     */
    private final ArrayList<Action> actions;


    public ScheduleAdapter(Context context) {
        this.context = context;
        actions = new ArrayList<>();
    }

    @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_action, parent));
    }

    @Override public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(actions.get(position));
    }

    @Override public int getItemCount() {
        return actions.size();
    }

    @Override public void addItem(Action item) {
        int position = actions.size();
        actions.add(item);
        notifyItemInserted(position);
    }

    @Override public void addItems(List<Action> items) {
        int positionStart = actions.size();
        actions.addAll(items);
        notifyItemRangeInserted(positionStart, items.size());
    }

    @Override public void clearItems() {
        int itemCount = actions.size();
        actions.clear();
        notifyItemRangeRemoved(0, itemCount);
    }

    @Override public void replaceItems(List<Action> items) {
        int oldSize = actions.size();
        actions.clear();
        actions.addAll(items);
        int newSize = actions.size();

        if (newSize == oldSize) {
            notifyItemRangeChanged(0, oldSize);
        } else if (newSize > oldSize) {
            notifyItemRangeChanged(0, oldSize);
            notifyItemRangeInserted(oldSize, newSize - oldSize);
        } else {
            notifyItemRangeChanged(0, newSize);
            notifyItemRangeRemoved(newSize, oldSize - newSize);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }

        public void bind(Action item) {

        }
    }
}
