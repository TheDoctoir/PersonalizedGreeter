package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {

    String strUsersName = "";
    String strUsersMiddleName = "";
    String strUsersLastName = "";

    Button btnGreetMe;
    EditText edtxtNameField;
    TextView txtvwGreetingSpace;
    EditText edtxtNameField2;
    EditText edtxtNameField3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnGreetMe = (Button) findViewById(R.id.btnGreetMe);
        edtxtNameField = (EditText) findViewById(R.id.edtxtNameField);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
        edtxtNameField2 = (EditText) findViewById(R.id.edtxtNameField2);
        edtxtNameField3 = (EditText) findViewById(R.id.edtxtNameField3);
    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();

        strUsersName = edtxtNameField.getText().toString();
        strUsersMiddleName = edtxtNameField2.getText().toString();
        strUsersLastName = edtxtNameField3.getText().toString();
        txtvwGreetingSpace.setText(String.format(res.getString(R.string.strGreeting), strUsersName, strUsersMiddleName, strUsersLastName));
    }
}
