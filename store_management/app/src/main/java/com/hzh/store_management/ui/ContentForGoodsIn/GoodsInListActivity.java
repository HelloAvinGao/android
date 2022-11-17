package com.hzh.store_management.ui.ContentForGoodsIn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.hzh.store_management.R;
import com.hzh.store_management.data.adapter.GoodsListItemAdapter;
import com.hzh.store_management.data.model.GoodsListItemBean;

import java.util.ArrayList;

public class GoodsInListActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<GoodsListItemBean> arrayList = new ArrayList<>();
    GoodsListItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_in_list);

        listView=(ListView) findViewById(R.id.goodsInlistView);
        arrayList.add(new GoodsListItemBean("DRKD220915004A", "领科入库1","PO233RR0001", "惠哲", "一号库","李四"));
        arrayList.add(new GoodsListItemBean("DRKD220915005A", "领科入库2","PO233RR0002", "惠哲", "二号库","张三"));
        arrayList.add(new GoodsListItemBean("DRKD220915006A", "领科入库3","PO233RR0003", "惠哲", "三号库","高强"));
        adapter = new GoodsListItemAdapter(GoodsInListActivity.this, arrayList, R.layout.activity_goods_in_list_item);
        listView.setAdapter(adapter);

        // 传值->获取title并设置title
        Bundle bundle = this.getIntent().getExtras();
        String title = bundle.getString("title");
        TextView titleTextView = findViewById(R.id.title_deal_will_goods_in);
        titleTextView.setText(title);

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

                intent.setClass(GoodsInListActivity.this, GoodsInListItemContentActivity.class);
                startActivity(intent);
            }
        });
    }

}
