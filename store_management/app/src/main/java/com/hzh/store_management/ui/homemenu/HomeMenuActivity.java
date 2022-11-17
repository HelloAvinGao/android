package com.hzh.store_management.ui.homemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hzh.store_management.R;
import com.hzh.store_management.ui.secondmenu.SecondMenuGoodsCheckActivity;
import com.hzh.store_management.ui.secondmenu.SecondMenuGoodsInActivity;
import com.hzh.store_management.ui.secondmenu.SecondMenuGoodsListActivity;
import com.hzh.store_management.ui.secondmenu.SecondMenuGoodsMovedActivity;
import com.hzh.store_management.ui.secondmenu.SecondMenuGoodsOutActivity;

public class HomeMenuActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);

        CardView goodsOut = findViewById(R.id.homeMenuGoodsOut);
        CardView goodsIn = findViewById(R.id.homeMenuGoodsIn);
        CardView goodsCheck = findViewById(R.id.homeMenuGoodsCheck);
        CardView goodsMoved = findViewById(R.id.homeMenuGoodsMove);
        CardView goodsList = findViewById(R.id.homeMenuGoodslist);

        goodsOut.setOnClickListener(this);
        goodsIn.setOnClickListener(this);
        goodsCheck.setOnClickListener(this);
        goodsMoved.setOnClickListener(this);
        goodsList.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.homeMenuGoodsOut:
                Intent homeMenuGoodsOut = new Intent();
                homeMenuGoodsOut.setClass(HomeMenuActivity.this, SecondMenuGoodsOutActivity.class);
                startActivity(homeMenuGoodsOut);
                break;
            case R.id.homeMenuGoodsIn:
                Intent homeMenuGoodsIn = new Intent();
                homeMenuGoodsIn.setClass(HomeMenuActivity.this, SecondMenuGoodsInActivity.class);
                startActivity(homeMenuGoodsIn);
                break;
            case R.id.homeMenuGoodsCheck:
                Intent homeMenuGoodsCheck = new Intent();
                homeMenuGoodsCheck.setClass(HomeMenuActivity.this, SecondMenuGoodsCheckActivity.class);
                startActivity(homeMenuGoodsCheck);
                break;
            case R.id.homeMenuGoodsMove:
                Intent homeMenuGoodsMove = new Intent();
                homeMenuGoodsMove.setClass(HomeMenuActivity.this, SecondMenuGoodsMovedActivity.class);
                startActivity(homeMenuGoodsMove);
                break;
            case R.id.homeMenuGoodslist:
                Intent intent = new Intent();
                intent.setClass(HomeMenuActivity.this, SecondMenuGoodsListActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
