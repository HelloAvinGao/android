package com.hzh.store_management.ui.ContentForGoodsOut.GoodsOutWill;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.hzh.store_management.R;
import com.hzh.store_management.data.common.AllFragment;

public class GoodsOutWillActivity extends Fragment implements View.OnClickListener  {
    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_goods_out_will,container,false);
        Toast.makeText(getContext(), "界面activity_goods_out_will", Toast.LENGTH_SHORT).show();

        this.switchFragment();

        return view;
    }

    private void switchFragment() {
        View will_fragment = view.findViewById(R.id.willGoodsOutFragment);
        Button allWill = view.findViewById(R.id.tab_menu_all_will_goods_out);
        Button beCheckWill = view.findViewById(R.id.tab_menu_becheck_will_goods_out);
        Button checkedWill = view.findViewById(R.id.tab_menu_checked_will_goods_out);

        allWill.setOnClickListener(this);
        beCheckWill.setOnClickListener(this);
        checkedWill.setOnClickListener(this);
        allWill.performClick();
    }

    @Override
    public void onClick(View v) {
        Button allWill = view.findViewById(R.id.tab_menu_all_will_goods_out);
        Button beCheckWill = view.findViewById(R.id.tab_menu_becheck_will_goods_out);
        Button checkedWill = view.findViewById(R.id.tab_menu_checked_will_goods_out);

        allWill.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_none));
        beCheckWill.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_none));
        checkedWill.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_none));
        switch (v.getId()){
            case R.id.tab_menu_all_will_goods_out:
                AllFragment.replaceFragment(new GoodsOutAllWillActivity(),getActivity(),R.id.willGoodsOutFragment);
                Toast.makeText(getContext(), "界面GoodsOutAllWillActivity", Toast.LENGTH_SHORT).show();
                allWill.setBackgroundDrawable(getResources().getDrawable(R.drawable.bottom_border));
                break;
            case R.id.tab_menu_becheck_will_goods_out:
                AllFragment.replaceFragment(new GoodsOutBeCheckWillActivity(),getActivity(),R.id.willGoodsOutFragment);
                Toast.makeText(getContext(), "界面GoodsOutBeCheckWillActivity", Toast.LENGTH_SHORT).show();
                beCheckWill.setBackgroundDrawable(getResources().getDrawable(R.drawable.bottom_border));
                break;
            case R.id.tab_menu_checked_will_goods_out:
                AllFragment.replaceFragment(new GoodsOutCheckedWillActivity(),getActivity(),R.id.willGoodsOutFragment);
                Toast.makeText(getContext(), "界面GoodsOutCheckedWillActivity", Toast.LENGTH_SHORT).show();
                checkedWill.setBackgroundDrawable(getResources().getDrawable(R.drawable.bottom_border));
                break;
        }
    }

    // replace fragment
//    private void replaceFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.willGoodsOutFragment, fragment);
//        transaction.commit();
//    }
}
