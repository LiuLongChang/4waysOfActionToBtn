package com.example.langyue.a4waysofaddactiontobtn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
*
* Andorid中给button添加响应事件的四种方法
*
*
* */


    /*
    *
    * 1、创建一个内部类定义点击事件
    *
    * */
        Button btn = (Button) findViewById(R.id.thBtn);
        btn.setOnClickListener(new MyListener());

/*
*
* 2、采用匿名内部类定义点击事件
*
* */
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO Auto-generated method stub
                //do something

            }
        });

        /*
        *
        * 3、让activity实现点击事件的接口
        *
        * MainActivity一定要实现OnClickListener接口
        * */
        btn.setOnClickListener(this);

/*
*
*   在布局文件里面绑定一个点击方法
*
* */






    }




    public void thBtn2ActionTrigger(View view){
        //do something

        System.out.print("哇塞 您嘛呢");


    }



    private class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            //TODO Auto-generated method stub
            //do something

        }
    }



//    MainActivity实现接口OnClickListener中的方法
//    这种方法的好处是 当一个界面有多个button需要添加响应事件时 只需写一个OnClick函数 比较方便
    @Override
    public void onClick(View vie){
        // TODO Auto-generated method stub
        switch (vie.getId()) {
            case R.id.thBtn:
                //do something
                break;

            default:
                break;

        }
    }








}
