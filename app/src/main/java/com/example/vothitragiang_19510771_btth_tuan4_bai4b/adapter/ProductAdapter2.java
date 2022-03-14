package com.example.vothitragiang_19510771_btth_tuan4_bai4b.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.vothitragiang_19510771_btth_tuan4_bai4b.R;
import com.example.vothitragiang_19510771_btth_tuan4_bai4b.model.*;

import java.util.List;

public class ProductAdapter2 extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Product2> productList;
    private int positionSelect = -1;

    public ProductAdapter2(Context context, int idLayout, List<Product2> productList) {
        this.context = context;
        this.idLayout = idLayout;
        this.productList = productList;
    }
    @Override
    public int getCount() {
        if (productList.size() != 0 && !productList.isEmpty()){
            return productList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        TextView tvProductName = (TextView) convertView.findViewById(R.id.textProductName2);
        TextView tvProductDiscountPrice = (TextView) convertView.findViewById(R.id.textDiscountPrice);
        TextView tvProductDiscount = (TextView) convertView.findViewById(R.id.textDiscount);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.logo2);
        final LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.idLinearLayout2);
        final Product2 product = productList.get(position);

        if (productList != null && !productList.isEmpty()) {
            tvProductName.setText(product.getName());
            tvProductDiscountPrice.setText(String.valueOf(product.getDiscountPrice()));
            tvProductDiscount.setText(String.valueOf(product.getDiscount()));
            int idLanguage = product.getId();
            switch (idLanguage) {
                case 1:
                    imageView.setImageResource(R.drawable.carbusbtops2_1);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.daucam_1);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.dauchuyendoi_1);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.dauchuyendoipsps2_1);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.daynguon_1);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.giacchuyen_1);
                    break;
                default:
                    break;
            }
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, product.getName(), Toast.LENGTH_LONG).show();
                positionSelect = position;
                notifyDataSetChanged();
            }
        });

        if (positionSelect == position) {
            linearLayout.setBackgroundColor(Color.BLUE);
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        return convertView;
    }
}
