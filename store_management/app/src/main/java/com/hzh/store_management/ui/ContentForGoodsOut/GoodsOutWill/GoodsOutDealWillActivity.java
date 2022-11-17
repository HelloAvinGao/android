package com.hzh.store_management.ui.ContentForGoodsOut.GoodsOutWill;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.hzh.store_management.R;
import com.hzh.store_management.ui.homemenu.HomeMenuActivity;

public class GoodsOutDealWillActivity extends AppCompatActivity implements View.OnClickListener{

    private Button upload_files;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_out_deal_will);

        // 传值->获取值
        Bundle bundle = this.getIntent().getExtras(); //读取intent的数据给bundle对象
        String str1 = bundle.getString("sff"); //通过key得到value
        int int1 = bundle.getInt("iff");

        String productID = bundle.getString("productID");
        Log.d("LOG1",productID);

        Log.d("LOG", str1);
        Log.d("LOG", String.valueOf(int1));


        TableRow tab1 = findViewById(R.id.tab1);
        TableRow tab2 = findViewById(R.id.tab2);
        tab1.setOnClickListener(this);
        tab2.setOnClickListener(this);
        Button backGoodsOutAllWillActivity = findViewById(R.id.backGoodsOutAllWillActivity);
        backGoodsOutAllWillActivity.setOnClickListener(this);
        Button saveAndBackHome = findViewById(R.id.saveAndBackHome);
        saveAndBackHome.setOnClickListener(this);

        EditText send_goods_out_number_editText1 = findViewById(R.id.send_goods_out_number_editText1);
        send_goods_out_number_editText1.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "200")});
        EditText send_goods_out_number_editText2 = findViewById(R.id.send_goods_out_number_editText2);
        send_goods_out_number_editText2.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "100")});
    }

    @Override
    public void onClick(View v) {
        TextView goods_out_Label = findViewById(R.id.goods_out_Label);
        TableRow tab_store_num1 = findViewById(R.id.tab_store_num1);
        switch (v.getId()) {
            case R.id.tab1:
                tab_store_num1.setVisibility(View.VISIBLE);
                TextView goods1 = findViewById(R.id.goods1);
                goods_out_Label.setText(String.valueOf(goods1.getText()));
                break;
            case R.id.tab2:
                tab_store_num1.setVisibility(View.GONE);
                TextView goods2 = findViewById(R.id.goods2);
                goods_out_Label.setText(String.valueOf(goods2.getText()));
                break;
            case R.id.saveAndBackHome:
                EditText send_goods_out_number_editText2 = findViewById(R.id.send_goods_out_number_editText2);
                Log.d("LOG0001", String.valueOf(send_goods_out_number_editText2.getText()));
                Toast.makeText(this, "出库:" + String.valueOf(send_goods_out_number_editText2.getText()), Toast.LENGTH_SHORT).show();

                Intent saveAndBackHome = new Intent();
                saveAndBackHome.setClass(GoodsOutDealWillActivity.this, HomeMenuActivity.class);
                startActivity(saveAndBackHome);
                break;
            case R.id.backGoodsOutAllWillActivity:
                Intent backGoodsOutAllWillActivity = new Intent();
                backGoodsOutAllWillActivity.setClass(GoodsOutDealWillActivity.this, HomeMenuActivity.class);
                startActivity(backGoodsOutAllWillActivity);
                break;
            default:
                break;
        }
    }

    public class InputFilterMinMax implements InputFilter {
        private int min, max;

        public InputFilterMinMax(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public InputFilterMinMax(String min, String max) {
            this.min = Integer.parseInt(min);
            this.max = Integer.parseInt(max);
        }

        @Override
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            try {
                int input = Integer.parseInt(dest.toString() + source.toString());
                if (isInRange(min, max, input))
                    return null;
            } catch (NumberFormatException nfe) { }
            return "";
        }

        private boolean isInRange(int a, int b, int c) {
            return b > a ? c >= a && c <= b : c >= b && c <= a;
        }
    }
}
