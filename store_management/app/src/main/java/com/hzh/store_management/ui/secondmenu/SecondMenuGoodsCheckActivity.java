package com.hzh.store_management.ui.secondmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hzh.store_management.R;
import com.hzh.store_management.ui.ContentForGoodsCheck.GoodsCheckListActivity;
import com.hzh.store_management.ui.ContentForGoodsCheck.GoodsCheckRequestActivity;

public class SecondMenuGoodsCheckActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_menu_goods_check);
        Toast.makeText(this, "activity_second_menu_goods_check", Toast.LENGTH_SHORT).show();

        CardView secondMenuGoodsCheckForInventory = findViewById(R.id.secondMenuGoodsCheckForInventory);
        CardView secondMenuGoodsCheckForbillingRequest = findViewById(R.id.secondMenuGoodsCheckForbillingRequest);

        secondMenuGoodsCheckForInventory.setOnClickListener(this);
        secondMenuGoodsCheckForbillingRequest.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.secondMenuGoodsCheckForInventory:
                Intent secondMenuGoodsCheckForInventory = new Intent();

                //传值->设置传值
                Bundle secondMenuGoodsCheckForInventorybundle = new Bundle();
                secondMenuGoodsCheckForInventorybundle.putString("title", "货品盘点表");
                secondMenuGoodsCheckForInventory.putExtras(secondMenuGoodsCheckForInventorybundle);

                secondMenuGoodsCheckForInventory.setClass(SecondMenuGoodsCheckActivity.this, GoodsCheckListActivity.class);
                startActivity(secondMenuGoodsCheckForInventory);
                break;
            case R.id.secondMenuGoodsCheckForbillingRequest:
                Intent secondMenuGoodsCheckForbillingRequest = new Intent();

                //传值->设置传值
                Bundle secondMenuGoodsCheckForbillingRequestbundle = new Bundle();
                secondMenuGoodsCheckForbillingRequestbundle.putString("title", "平账申请");
                secondMenuGoodsCheckForbillingRequest.putExtras(secondMenuGoodsCheckForbillingRequestbundle);

                secondMenuGoodsCheckForbillingRequest.setClass(SecondMenuGoodsCheckActivity.this, GoodsCheckRequestActivity.class);
                startActivity(secondMenuGoodsCheckForbillingRequest);
                break;
        }
    }
}
