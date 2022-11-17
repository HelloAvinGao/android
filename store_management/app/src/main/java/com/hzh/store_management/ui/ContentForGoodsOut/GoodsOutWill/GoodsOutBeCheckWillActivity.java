package com.hzh.store_management.ui.ContentForGoodsOut.GoodsOutWill;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hzh.store_management.R;

public class GoodsOutBeCheckWillActivity extends Fragment implements View.OnClickListener{
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_goods_out_be_check_will,container,false);

        this.showGoodsDetail();

        return view;
    }

    private void showGoodsDetail() {
        CardView all_will_btn_goods_out = view.findViewById(R.id.becheckgoodsOut);

        all_will_btn_goods_out.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.becheckgoodsOut:
                // 传递数据给fragment01界面
                TextView goods_id = view.findViewById(R.id.goods_id);
                String data = goods_id.getText().toString().trim();
                Log.d("LOG",data);

                Intent intent = new Intent();

                //传值->设置传值
                Bundle bundle = new Bundle();        //得到bundle对象
                bundle.putString("sff", "value值");  //key-"sff",通过key得到value-"value值"(String型)
                bundle.putInt("iff", 175);           //key-"iff",value-175
                intent.putExtras(bundle);
                bundle.putString("productID", data);
                intent.putExtras(bundle);

                intent.setClass(getActivity(), GoodsOutDealWillActivity.class);
                startActivity(intent);
                break;
        }
    }
}
