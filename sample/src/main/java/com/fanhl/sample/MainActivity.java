package com.fanhl.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fanhl.sample.model.Action;
import com.fanhl.scheduleview.TimelineView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.scheduleView) TimelineView timelineView;

    private ScheduleAdapter adapter;
    private List<Action> actions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        assignView();
        initData();
        refreshData();
    }

    private void assignView() {
//        scheduleView.setLayoutManager(new LinearLayoutManager(this));
//        adapter = new ScheduleAdapter(this);
//        scheduleView.setAdapter(adapter);
    }

    private void initData() {

    }

    private void refreshData() {
//        actions = new ArrayList<>();
//        actions.add(new Action());
//        actions.add(new Action());
//        actions.add(new Action());
//        actions.add(new Action());
//        actions.add(new Action());
//        actions.add(new Action());
//        actions.add(new Action());
//
//        adapter.replaceItems(actions);
    }
}
