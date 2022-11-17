package com.hzh.store_management.ui.secondmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.hzh.store_management.R;

public class SecondMenuGoodsMovedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_menu_goods_moved);
        Toast.makeText(this, "activity_second_menu_goods_moved", Toast.LENGTH_SHORT).show();
    }
}
