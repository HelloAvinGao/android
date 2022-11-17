package com.hzh.store_management.ui.secondmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hzh.store_management.R;
import com.hzh.store_management.ui.ContentForGoodsIn.GoodsInListActivity;
import com.hzh.store_management.ui.homemenu.HomeMenuActivity;

public class SecondMenuGoodsInActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_menu_goods_in);
        Toast.makeText(this, "activity_second_menu_goods_in", Toast.LENGTH_SHORT).show();

        CardView secondMenuGoodsInForInventory = findViewById(R.id.secondMenuGoodsInForInventory);
        CardView secondMenuGoodsInForNormalGoodsReturn = findViewById(R.id.secondMenuGoodsInForNormalGoodsReturn);
        CardView secondMenuGoodsInForBadGoodsReturn = findViewById(R.id.secondMenuGoodsInForBadGoodsReturn);
        CardView secondMenuGoodsInForbalanced = findViewById(R.id.secondMenuGoodsInForbalanced);

        secondMenuGoodsInForInventory.setOnClickListener(this);
        secondMenuGoodsInForNormalGoodsReturn.setOnClickListener(this);
        secondMenuGoodsInForBadGoodsReturn.setOnClickListener(this);
        secondMenuGoodsInForbalanced.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.secondMenuGoodsInForInventory:
                Intent secondMenuGoodsInForInventory = new Intent();

                //传值->采购入库单
                Bundle secondMenuGoodsInForInventorybundle = new Bundle();
                secondMenuGoodsInForInventorybundle.putString("title", "采购入库单");
                secondMenuGoodsInForInventory.putExtras(secondMenuGoodsInForInventorybundle);

                secondMenuGoodsInForInventory.setClass(SecondMenuGoodsInActivity.this, GoodsInListActivity.class);
                startActivity(secondMenuGoodsInForInventory);
                break;
            case R.id.secondMenuGoodsInForNormalGoodsReturn:
                Intent secondMenuGoodsInForNormalGoodsReturn = new Intent();

                //传值->正常品退货入库单
                Bundle secondMenuGoodsInForNormalGoodsReturnbundle = new Bundle();
                secondMenuGoodsInForNormalGoodsReturnbundle.putString("title", "正常品退货入库单");
                secondMenuGoodsInForNormalGoodsReturn.putExtras(secondMenuGoodsInForNormalGoodsReturnbundle);

                secondMenuGoodsInForNormalGoodsReturn.setClass(SecondMenuGoodsInActivity.this, GoodsInListActivity.class);
                startActivity(secondMenuGoodsInForNormalGoodsReturn);
                break;
            case R.id.secondMenuGoodsInForBadGoodsReturn:
                Intent secondMenuGoodsInForBadGoodsReturn = new Intent();

                //传值->不良品退货入库单
                Bundle secondMenuGoodsInForBadGoodsReturnbundle = new Bundle();
                secondMenuGoodsInForBadGoodsReturnbundle.putString("title", "不良品退货入库单");
                secondMenuGoodsInForBadGoodsReturn.putExtras(secondMenuGoodsInForBadGoodsReturnbundle);

                secondMenuGoodsInForBadGoodsReturn.setClass(SecondMenuGoodsInActivity.this, GoodsInListActivity.class);
                startActivity(secondMenuGoodsInForBadGoodsReturn);
                break;
            case R.id.secondMenuGoodsInForbalanced:
                Intent secondMenuGoodsInForbalanced = new Intent();

                //传值->设置传值
                Bundle secondMenuGoodsInForbalancedbundle = new Bundle();
                secondMenuGoodsInForbalancedbundle.putString("title", "货品平账入库单");
                secondMenuGoodsInForbalanced.putExtras(secondMenuGoodsInForbalancedbundle);

                secondMenuGoodsInForbalanced.setClass(SecondMenuGoodsInActivity.this, GoodsInListActivity.class);
                startActivity(secondMenuGoodsInForbalanced);
                break;
            default:
                break;
        }
    }
}
