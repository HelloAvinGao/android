package com.hzh.store_management.ui.secondmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hzh.store_management.R;
import com.hzh.store_management.ui.ContentForGoodsIn.GoodsInListActivity;
import com.hzh.store_management.ui.ContentForGoodsOut.GoodsOutListActivity;

public class SecondMenuGoodsOutActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_menu_goods_out);
        Toast.makeText(this, "activity_second_menu_goods_out", Toast.LENGTH_SHORT).show();

        CardView secondMenuGoodsOutForSales = findViewById(R.id.secondMenuGoodsOutForSales);
        CardView secondMenuGoodsOutForReturn = findViewById(R.id.secondMenuGoodsOutForReturn);
        CardView secondMenuGoodsOutForBalanced = findViewById(R.id.secondMenuGoodsOutForBalanced);

        secondMenuGoodsOutForSales.setOnClickListener(this);
        secondMenuGoodsOutForReturn.setOnClickListener(this);
        secondMenuGoodsOutForBalanced.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.secondMenuGoodsOutForSales:
                Intent secondMenuGoodsInForInventory = new Intent();

                //传值->设置传值
                Bundle secondMenuGoodsInForInventorybundle = new Bundle();
                secondMenuGoodsInForInventorybundle.putString("title", "销售出库单");
                secondMenuGoodsInForInventory.putExtras(secondMenuGoodsInForInventorybundle);

                secondMenuGoodsInForInventory.setClass(SecondMenuGoodsOutActivity.this, GoodsOutListActivity.class);
                startActivity(secondMenuGoodsInForInventory);
                break;
            case R.id.secondMenuGoodsOutForReturn:
                Intent secondMenuGoodsInForNormalGoodsReturn = new Intent();

                //传值->设置传值
                Bundle secondMenuGoodsInForNormalGoodsReturnbundle = new Bundle();
                secondMenuGoodsInForNormalGoodsReturnbundle.putString("title", "退货出库单");
                secondMenuGoodsInForNormalGoodsReturn.putExtras(secondMenuGoodsInForNormalGoodsReturnbundle);

                secondMenuGoodsInForNormalGoodsReturn.setClass(SecondMenuGoodsOutActivity.this, GoodsOutListActivity.class);
                startActivity(secondMenuGoodsInForNormalGoodsReturn);
                break;
            case R.id.secondMenuGoodsOutForBalanced:
                Intent secondMenuGoodsInForBadGoodsReturn = new Intent();

                //传值->设置传值
                Bundle secondMenuGoodsInForBadGoodsReturnbundle = new Bundle();
                secondMenuGoodsInForBadGoodsReturnbundle.putString("title", "货品平账出库单");
                secondMenuGoodsInForBadGoodsReturn.putExtras(secondMenuGoodsInForBadGoodsReturnbundle);

                secondMenuGoodsInForBadGoodsReturn.setClass(SecondMenuGoodsOutActivity.this, GoodsOutListActivity.class);
                startActivity(secondMenuGoodsInForBadGoodsReturn);
                break;
            default:
                break;
        }
    }
}
