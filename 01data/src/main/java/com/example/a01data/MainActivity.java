package com.example.a01data;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {


    @BindView(R.id.tv_sp)
    TextView tvSp;
    @BindView(R.id.tv_file_in)
    TextView tvFileIn;
    @BindView(R.id.tv_file_out)
    TextView tvFileOut;
    @BindView(R.id.tv_sqlite)
    TextView tvSqlite;
    @BindView(R.id.tv_net)
    TextView tvNet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.tv_sp)
    public void spSave(View view){
        Toast.makeText(this, "sp", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SpDataActivity.class);
        startActivity(intent);

    }
    @OnClick(R.id.tv_file_in)
    public void fileinData(View view){
        Toast.makeText(this, "filein", Toast.LENGTH_SHORT).show();

    }
    @OnClick(R.id.tv_file_out)
    public void filoutData(View view){
        Toast.makeText(this, "fileout", Toast.LENGTH_SHORT).show();

    }
    @OnClick(R.id.tv_sqlite)
    public void sqliteData(View view){
        Toast.makeText(this, "sqlite", Toast.LENGTH_SHORT).show();

    }

    @OnClick(R.id.tv_net)
    public void netData(View view){
        Toast.makeText(this, "netdata", Toast.LENGTH_SHORT).show();

    }




}
