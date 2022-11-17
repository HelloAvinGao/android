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

public class GoodsOutAllWillActivity extends Fragment implements View.OnClickListener{

    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_goods_out_all_will,container,false);

        //获取Bundle 然后获取数据
        Bundle bundle = this.getArguments();//得到从Activity传来的数据
        String title = null;
        if (bundle != null) {
            title = bundle.getString("title");
        }
        ///设置显示数据
        Log.i("LOG", "title result is " + title);

        this.showGoodsDetail();

        return view;
    }

    private void showGoodsDetail() {
        CardView all_will_btn_goods_out = view.findViewById(R.id.allwillgoodsOut);
        all_will_btn_goods_out.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.allwillgoodsOut:
                // 传递数据给fragment01界面
                TextView goods_id = view.findViewById(R.id.goods_id);
                String data = goods_id.getText().toString().trim();
                Log.d("LOG1",data);

                Intent intent = new Intent();

                //传值->设置传值
                Bundle bundle = new Bundle();        //得到bundle对象
                bundle.putString("sff", "value值");  //key-"sff",通过key得到value-"value值"(String型)
                bundle.putInt("iff", 175);           //key-"iff",value-175
                bundle.putString("productID", data);
                intent.putExtras(bundle);

                intent.setClass(getActivity(), GoodsOutDealWillActivity.class);
                startActivity(intent);
                break;
        }
    }
}
