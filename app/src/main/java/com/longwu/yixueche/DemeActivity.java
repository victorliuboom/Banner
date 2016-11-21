package com.longwu.yixueche;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class DemeActivity extends AppCompatActivity {
    private Button btn;
    private LinearLayout ll2;
    private ListView lv1;
    String [] strs=new String[]{"aaa","bbb","ccc","ddd","fff","eee","ggg","hhh","rrr","jjj","kkk","lll","mmm","nnnn","ooo","ppp","qqq","rrr","sss","ttt","uuu",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deme);
        btn= (Button) findViewById(R.id.btn);
        ll2= (LinearLayout) findViewById(R.id.ll2);
        lv1= (ListView) findViewById(R.id.lv1);
        ArrayList<String> strings=new ArrayList<>();
        ArrayAdapter arrayAdapter=new ArrayAdapter(DemeActivity.this,android.R.layout.simple_list_item_1,strs);
        lv1.setAdapter(arrayAdapter);
        lv1.setSelection(3);
     TranslateAnimation translateAnimation = new TranslateAnimation(-600.1f, 0.1f,0.1f,0.1f);
    //初始化 Alpha动画
      AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);

    //动画集
        AnimationSet set = new AnimationSet(true);
        set.addAnimation(translateAnimation);
        set.addAnimation(alphaAnimation);

    //设置动画时间 (作用到每个动画)
        set.setDuration(2000);
        ll2.startAnimation(set);
        setListener();
    }

    private void setListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}

