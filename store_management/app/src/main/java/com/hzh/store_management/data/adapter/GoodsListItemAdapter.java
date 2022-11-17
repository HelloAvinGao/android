package com.hzh.store_management.data.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hzh.store_management.R;
import com.hzh.store_management.data.model.GoodsListItemBean;

import java.util.ArrayList;

public class GoodsListItemAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<GoodsListItemBean> arrayList;
    protected int layoutId;
    private TextView goods_id, goods_input_type, goods_list_num,goods_from, store_num, goods_manager;
    public GoodsListItemAdapter(Context context, ArrayList<GoodsListItemBean> arrayList, int layoutId) {
        this.context = context;
        this.arrayList = arrayList;
        this.layoutId = layoutId;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }
    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        goods_id = convertView.findViewById(R.id.goods_id);
        goods_input_type = convertView.findViewById(R.id.goods_input_type);
        goods_list_num = convertView.findViewById(R.id.goods_list_num);
        goods_from = convertView.findViewById(R.id.goods_from);
        store_num = convertView.findViewById(R.id.store_num);
        goods_manager = convertView.findViewById(R.id.goods_manager);

        goods_id.setText(arrayList.get(position).getGoods_id());
        goods_input_type.setText(arrayList.get(position).getGoods_input_type());
        goods_list_num.setText(arrayList.get(position).getGoods_list_num());
        goods_from.setText(arrayList.get(position).getGoods_from());
        store_num.setText(arrayList.get(position).getStore_num());
        goods_manager.setText(arrayList.get(position).getGoods_manager() + "  创建于" + "2022-09-12 10:10:10");

        return convertView;
    }
}
