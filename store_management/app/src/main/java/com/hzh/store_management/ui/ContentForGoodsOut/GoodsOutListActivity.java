package com.hzh.store_management.ui.ContentForGoodsOut;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.hzh.store_management.R;
import com.hzh.store_management.data.common.AllFragment;
import com.hzh.store_management.ui.ContentForGoodsOut.GoodsOutAlready.GoodsOutAlreadyActivity;
import com.hzh.store_management.ui.ContentForGoodsOut.GoodsOutWill.GoodsOutAllWillActivity;
import com.hzh.store_management.ui.ContentForGoodsOut.GoodsOutWill.GoodsOutWillActivity;

public class GoodsOutListActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_out_list);

        this.switchFragment();
    }

    public void switchFragment(){
        FrameLayout menu_content = findViewById(R.id.goodsOut);
        Button already = findViewById(R.id.tab_menu_goods_out_already_records);
        Button will = findViewById(R.id.tab_menu_goods_out_will_records);

        already.setOnClickListener(this);
        will.setOnClickListener(this);
        already.performClick();
    }
    // click tab
    @Override
    public void onClick(View v) {
        Button already = findViewById(R.id.tab_menu_goods_out_already_records);
        Button will = findViewById(R.id.tab_menu_goods_out_will_records);
        switch (v.getId()){
            case R.id.tab_menu_goods_out_already_records:
                AllFragment.replaceFragment(new GoodsOutAlreadyActivity(),this,R.id.goodsOut);
                already.setBackgroundColor(Color.parseColor("#6495ED"));
                will.setBackgroundColor(Color.parseColor("#ffffff"));
                already.setTextColor(Color.parseColor("#ffffff"));
                will.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.tab_menu_goods_out_will_records:
                AllFragment.replaceFragment(new GoodsOutWillActivity(),this,R.id.goodsOut);
                already.setBackgroundColor(Color.parseColor("#ffffff"));
                will.setBackgroundColor(Color.parseColor("#6495ED"));
                already.setTextColor(Color.parseColor("#000000"));
                will.setTextColor(Color.parseColor("#ffffff"));
                break;
        }
    }
}
