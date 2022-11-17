package com.hzh.store_management.ui.ContentForGoodsOut.GoodsOutAlready;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.hzh.store_management.R;
import com.hzh.store_management.data.adapter.GoodsListItemAdapter;
import com.hzh.store_management.data.model.GoodsListItemBean;

import java.util.ArrayList;

public class GoodsOutAlreadyActivity extends Fragment {

    ListView listView;
    ArrayList<GoodsListItemBean> arrayList = new ArrayList<>();
    GoodsListItemAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_goods_out_already,container,false);

        listView=(ListView) view.findViewById(R.id.listView);
        arrayList.add(new GoodsListItemBean("DRKD220915004A", "领科出库1","PO233RR000", "惠哲", "一号库","李四"));
        arrayList.add(new GoodsListItemBean("DRKD220915005A", "领科出库2","8787576768", "惠哲", "一号库","张三"));
        arrayList.add(new GoodsListItemBean("DRKD220915006A", "领科出库3","65757657657", "惠哲", "二号库","高强"));
        adapter = new GoodsListItemAdapter(getContext(), arrayList, R.layout.activity_goods_out_already_list_item);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView goodsid=(TextView) view.findViewById(R.id.goods_id);
                Log.i("LOG", "onItemClick: listview 点击事件生效" + i + " " + goodsid.getText().toString());

                Intent intent = new Intent();

                //传值->设置传值
                Bundle bundle = new Bundle();        //得到bundle对象
                bundle.putString("sff", "value值");  //key-"sff",通过key得到value-"value值"(String型)
                bundle.putInt("iff", 175);           //key-"iff",value-175
                bundle.putString("productID", goodsid.getText().toString());
                intent.putExtras(bundle);

                intent.setClass(getActivity(), GoodsOutDetailsInfoActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
