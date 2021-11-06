package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Dangnhap extends AppCompatActivity implements View.OnClickListener {
    //Khai bao soi tuong dieu khien
    EditText edtuser, edtpass;
    Button btnDangN, btnDangK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ;
        getView();
        //xu li nut dang ki
        btnDangK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cleardate();
                //Chuyen trang
                Intent intent = new Intent(Dangnhap.this, Dangki.class);
                startActivity(intent);
            }
        });
    }
    private void getView(){
        edtuser =(EditText) findViewById(R.id.edtuser);
        edtpass = (EditText) findViewById(R.id.edtpass);
        btnDangN = (Button) findViewById(R.id.btnDangN);
        btnDangK = (Button) findViewById(R.id.btnDangK);

        //xu li nut dang nhap
        btnDangN.setOnClickListener(this::onClick);
    }
    private void Cleardate(){
        edtuser.setText("");
        edtpass.setText("");
    }

    @Override
    public void onClick(View view) {
        //xu lí su kien
        switch (view.getId()){
            case R.id.btnDangN:
                String DangNhap = edtuser.getText().toString();
                //Hien thong bao cho ng dung
                Toast.makeText(this,"Đăng nhập"+DangNhap, Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }
}