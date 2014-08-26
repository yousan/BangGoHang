package com.example.yousan.myapplication21;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class MyActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        findViewById(R.id.press_me).setOnClickListener(this);
    }

    private String getShop() {
        ArrayList<String> shops = new ArrayList<String>(Arrays.asList(
                "マック", "すきや",
                "ザイカ", "満月", "ぼてじゃこ", "ここす",
                "8番ラーメン", "まるなかや", "扇屋", "廻る寿司" , "コンビニ", "スーパー",
                "ホカ弁", "しょうき"
        ));

        return shops.get((int)(Math.random()*shops.size()));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.press_me) {
            (new AlertDialog.Builder(this))
                    .setTitle("あなたのご飯は！！！")
                    .setMessage(getShop())
                    .setPositiveButton("OK", null)
                    .show();
        }
    }
}
