package com.example.vothitragiang_19510771_btth_tuan4_bai4b.active;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vothitragiang_19510771_btth_tuan4_bai4b.R;
import com.example.vothitragiang_19510771_btth_tuan4_bai4b.adapter.ProductAdapter2;
import com.example.vothitragiang_19510771_btth_tuan4_bai4b.model.Product2;

import java.util.ArrayList;
import java.util.List;

public class ProductListViewActivity2 extends AppCompatActivity {
    private List<Product2> productList2;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gridView = findViewById(R.id.idGridView);

        productList2 = new ArrayList<>();
        productList2.add(new Product2(1, "Ca nấu lẩu,nấu mì mini..",69000,39));
        productList2.add(new Product2(2, "1KG KHÔ GÀ BƠ TỎI",69000,39));
        productList2.add(new Product2(3, "Xe cần cẩu đa năng",69000,39));
        productList2.add(new Product2(4, "Đồ chơi dạng mô hình",69000,39));
        productList2.add(new Product2(5, "Lảnh đạo đơn giản",69000,39));
        productList2.add(new Product2(6, "Hiểu lòng trẻ con",69000,39));

        ProductAdapter2 adapter = new ProductAdapter2(this, R.layout.item_grid_view, productList2);
        gridView.setAdapter(adapter);

        System.out.println(gridView);
    }
}
