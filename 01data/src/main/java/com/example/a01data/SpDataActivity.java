package com.example.a01data;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SpDataActivity extends Activity {


    @BindView(R.id.et_sp_key)
    EditText etSpKey;
    @BindView(R.id.et_sp_value)
    EditText etSpValue;
    @BindView(R.id.bt_sp_save)
    Button btSpSave;
    @BindView(R.id.bt_sp_read)
    Button btSpRead;
    @BindView(R.id.sp_info)
    TextView spInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_data);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.bt_sp_save)
    public void save(View view) {
        SharedPreferences sp = getSharedPreferences("sp_info", Context.MODE_PRIVATE);
        String key = etSpKey.getText().toString().trim();
        String value = etSpValue.getText().toString().trim();

        sp.edit().putString(key, value)
                .commit();


    }

    @OnClick(R.id.bt_sp_read)
    public void read(View view) {

        SharedPreferences sp = SpDataActivity.this.getSharedPreferences("sp_info", Context.MODE_PRIVATE);

        String key = etSpKey.getText().toString().trim();
        String value = sp.getString(key, "");

        etSpValue.setText(value);

        show(key, value);

    }

    /**
     *
     * @param key
     * @param value
     */
    private void show(String key, String value) {

        spInfo.setText("key:"+key+"\n");

        spInfo.append("value:"+ value);
    }


}
