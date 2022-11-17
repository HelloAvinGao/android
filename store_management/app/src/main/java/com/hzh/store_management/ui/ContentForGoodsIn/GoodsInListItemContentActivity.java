package com.hzh.store_management.ui.ContentForGoodsIn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

import com.hzh.store_management.R;
import com.hzh.store_management.ui.homemenu.HomeMenuActivity;

public class GoodsInListItemContentActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_in_list_item_content);

        // 传值->获取值
        Bundle bundle = this.getIntent().getExtras(); //读取intent的数据给bundle对象
        String str1 = bundle.getString("sff"); //通过key得到value
        int int1 = bundle.getInt("iff");

        String productID = bundle.getString("productID");
        Log.d("LOG1",productID);

        Log.d("LOG", str1);
        Log.d("LOG", String.valueOf(int1));

        TableRow tab1 = findViewById(R.id.tab1);
        TableRow tab2 = findViewById(R.id.tab2);
        tab1.setOnClickListener(this);
        tab2.setOnClickListener(this);

        Button saveAndBackHome = findViewById(R.id.backHome);
        saveAndBackHome.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        TextView goods_out_Label = findViewById(R.id.goods_out_Label);
        TableRow tab_store_num1 = findViewById(R.id.tab_store_num1);
        switch (v.getId()) {
            case R.id.tab1:
                tab_store_num1.setVisibility(View.VISIBLE);
                TextView goods1 = findViewById(R.id.goods1);
                goods_out_Label.setText(String.valueOf(goods1.getText()));
                break;
            case R.id.tab2:
                tab_store_num1.setVisibility(View.GONE);
                TextView goods2 = findViewById(R.id.goods2);
                goods_out_Label.setText(String.valueOf(goods2.getText()));
                break;
            case R.id.backHome:
                Intent saveAndBackHome = new Intent();
                saveAndBackHome.setClass(GoodsInListItemContentActivity.this, HomeMenuActivity.class);
                startActivity(saveAndBackHome);
                break;
            default:
                break;
        }
    }
}
