package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Model> arrayList = new ArrayList<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerviewId);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

        Model model = new Model("A11");
        Model model1 = new Model("A12");
        Model model2 = new Model("A13");
        Model model3 = new Model("A13");

        Model model4 = new Model("A21");
        Model model5 = new Model("A22");
        Model model6 = new Model("A23");
        Model model7 = new Model("A24");

        Model model8 = new Model("A31");
        Model model9 = new Model("A32");
        Model model10 = new Model("A33");
        Model model11 = new Model("A34");

        Model model12 = new Model("A41");
        Model model13 = new Model("A42");
        Model model14 = new Model("A43");
        Model model15 = new Model("A44");

        Model model16 = new Model("A51");
        Model model17 = new Model("A52");
        Model model18 = new Model("A53");
        Model model19 = new Model("A54");

        Model model20 = new Model("A61");
        Model model21 = new Model("A62");
        Model model22 = new Model("A63");
        Model model23 = new Model("A64");

        Model model24 = new Model("A71");
        Model model25 = new Model("A72");
        Model model26 = new Model("A73");
        Model model27 = new Model("A74");

        Model model28 = new Model("A81");
        Model model29 = new Model("A82");
        Model model30 = new Model("A83");
        Model model31 = new Model("A84");

        arrayList.add(model);
        arrayList.add(model1);
        arrayList.add(model2);
        arrayList.add(model3);

        arrayList.add(model4);
        arrayList.add(model5);
        arrayList.add(model6);
        arrayList.add(model7);

        arrayList.add(model8);
        arrayList.add(model9);
        arrayList.add(model10);
        arrayList.add(model11);

        arrayList.add(model12);
        arrayList.add(model13);
        arrayList.add(model14);
        arrayList.add(model15);

        arrayList.add(model16);
        arrayList.add(model17);
        arrayList.add(model18);
        arrayList.add(model19);

        arrayList.add(model20);
        arrayList.add(model21);
        arrayList.add(model22);
        arrayList.add(model23);

        arrayList.add(model24);
        arrayList.add(model25);
        arrayList.add(model26);
        arrayList.add(model27);

        arrayList.add(model28);
        arrayList.add(model29);
        arrayList.add(model30);
        arrayList.add(model31);

        adapter = new Adapter(arrayList, MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
}