package com.calculate.vanquy.calculate;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    EditText edta,edtb;
    TextView tvSum;
    Button btSum,btClear,btExit;
    Context context=this;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edta =(EditText)findViewById(R.id.edta);
        edtb =(EditText)findViewById(R.id.edtb);
        tvSum=(TextView)findViewById(R.id.tvSum);
        btSum=(Button) findViewById(R.id.btsum);
        btClear=(Button) findViewById(R.id.btclear);
        btExit=(Button) findViewById(R.id.btexit);
        exit();
        clear();
    }
  // Onclick in XML:
    public void onClick(View view) {
        int a=Integer.parseInt(edta.getText()+"");
        int b=Integer.parseInt(edtb.getText()+"");
        int sum =a+b;
        tvSum.setText(tvSum.getText().toString()+sum);
    }


//  Anonymous listener
//    private void sum(){
//        btSum.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int a=Integer.parseInt(edta.getText()+"");
//                int  b=Integer.parseInt(edtb.getText()+"");
//                int sum=a+b;
//              tvSum.setText(tvSum.getText().toString()+sum);
//            }
//        });
//    }


//Activity is listenerA
//    public void onClick(View view){
//        int a=Integer.parseInt(edta.getText()+"");
//        int b=Integer.parseInt(edtb.getText()+"");
//        int sum =a+b;
//        tvSum.setText(tvSum.getText().toString()+sum);
//    }

    private void clear(){
        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edta.setText("");
                edtb.setText("");
                tvSum.setText("Tổng hai số vừa nhập là: ");
            }
        });
    }

    private void exit(){
        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder b=new AlertDialog.Builder(context);
                b.setTitle("Thoát");
                b.setMessage("Thoát ứng dụng");
                b.setNegativeButton("No",null);
                b.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
                b.show();
            }
        });
    }


}