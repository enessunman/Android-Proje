package com.example.sunman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView yemekCard, oyunCard,indexCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yemekCard = (CardView) findViewById(R.id.yemek_card);
        oyunCard= (CardView) findViewById(R.id.oyun_card);
        indexCard = (CardView) findViewById(R.id.index_card);


        yemekCard.setOnClickListener(this);
        oyunCard.setOnClickListener(this);
        indexCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.yemek_card:
                intent = new Intent(this, FoodList.class); startActivity(intent);break;
            case R.id.oyun_card:
                intent = new Intent (this,HafizaOyunu.class); startActivity(intent); break;
            case R.id.index_card:
                intent = new Intent(this, IndexHesaplama.class); startActivity(intent); break;

            default: break;
        }
    }
}
