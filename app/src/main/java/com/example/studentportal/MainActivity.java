package com.example.studentportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    private PortalAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private ImageButton addPortal;
    private List<StudentPortal> mPortals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addPortal = findViewById(R.id.addPortalButton);
        addPortal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddPortal.class);
                startActivityForResult(intent, 1234);
            }
        });

        mPortals = new ArrayList<>();

        mRecyclerView = findViewById(R.id.coordinatorview);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getParent(), 3);
        ((GridLayoutManager) mLayoutManager).setSpanCount(3);

        mRecyclerView.setLayoutManager(mLayoutManager);
        final PortalAdapter mAdapter = new PortalAdapter(mPortals, this);

        mRecyclerView.setAdapter(mAdapter);
        for (int i = 0; i < StudentPortal.PRE_DEFINED_PORTAL_NAMES.length; i++) {
            mPortals.add(new StudentPortal(StudentPortal.PRE_DEFINED_PORTAL_NAMES[i],
                    StudentPortal.PRE_DEFINED_PORTAL_LINKS[i]));
        }


    }
}
