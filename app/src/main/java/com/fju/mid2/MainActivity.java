package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
/*
    Button b_b1 = (Button) findViewById(R.id.b_b1);
    Button b_b2 = (Button) findViewById(R.id.b_b2);
    Button b_b3 = (Button) findViewById(R.id.b_b3);
    Button b_b4 = (Button) findViewById(R.id.b_b4);
    Button b_b5 = (Button) findViewById(R.id.b_b5);
    Button b_b6 = (Button) findViewById(R.id.b_b6);
    Button b_b7 = (Button) findViewById(R.id.b_b7);
    Button b_b8 = (Button) findViewById(R.id.b_b8);
*/
    public void b_b1(View view){
        Intent intent = new Intent(this , Func1Activity.class);
        startActivity(intent);
    }
    public void b_b2(View view){
        Intent intent = new Intent(this , Func2Activity.class);
        startActivity(intent);
    }



    public void b_b3(View view){
        Intent intent = new Intent(this , Func3Activity.class);
        startActivityForResult(intent , REQUEST_CODE);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE){
            Toast.makeText(this,"特殊功能",Toast.LENGTH_LONG).show();
        }
    }
    public void b_b4(View view){
        Intent intent = new Intent(this , Func4Activity.class);
        startActivity(intent);
    }
    public void b_b5(View view){
        Intent intent = new Intent(this , Func5Activity.class);
        startActivity(intent);
    }
    public void b_b6(View view){
        Intent intent = new Intent(this , Func6Activity.class);
        startActivity(intent);
    }
    public void b_b7(View view){
        Intent intent = new Intent(this , Func7Activity.class);
        startActivityForResult(intent,REQUEST_CODE);
    }

    public void b_b8(View view){
        Intent intent = new Intent(this , Func8Activity.class);
        startActivityForResult(intent,REQUEST_CODE);
    }
}
