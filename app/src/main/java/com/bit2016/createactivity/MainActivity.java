package com.bit2016.createactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String LOG_TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "onCreate called");
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);  // alt+enter 해주면 import가 된다.
        button.setOnClickListener(new View.OnClickListener() { //인터페이스를 바로 구현해줌
            @Override
            public void onClick(View view) {
                System.out.println("clicked");  //sout 줄임말 sysout은 안됨
                Log.d("MainActivity", "clicked "); //디버그용
                Log.e("MainActivity", "clicked "); //에러
                Toast.makeText(MainActivity.this, "clicked",Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                //원래 자기 인텐트 넣어주고 다음은 새 인텐트를 넣어준다.
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        Log.d(LOG_TAG, "onPause called");
        super.onPause();
    }


    @Override
    protected void onStop() {
        Log.d(LOG_TAG, "onStop called  ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(LOG_TAG, "onDestory called");
        super.onDestroy();
    }
}
