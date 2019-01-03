package ICR.com.activity;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import ICR.com.R;
//底部工具栏界面，就是“首页 二维码 我的”那一栏
public class ToolsLayout extends LinearLayout {
    public ToolsLayout(final Context context, AttributeSet attrs){
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.bottomtool,this);
        Button mainTurn = (Button) findViewById(R.id.button_main1);
        Button QR = (Button) findViewById(R.id.button_QR_Code);
        Button myTurn = (Button) findViewById(R.id.button_person);
        mainTurn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,  MainActivity.class);
                context.startActivity(intent);//与一般的显示有点区别，请照着写
            }
        });
        QR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,  QRCodeActivity.class);
                context.startActivity(intent);
            }
        });
        myTurn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,  PersonalActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
