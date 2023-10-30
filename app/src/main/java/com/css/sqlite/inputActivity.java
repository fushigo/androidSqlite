package com.css.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class inputActivity extends AppCompatActivity {
    EditText editNama;
    EditText editAlamat;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        editNama = findViewById(R.id.editNama);
        editAlamat = findViewById(R.id.editAlamat);
        databaseHelper = new DatabaseHelper(this);
    }

    public void submitData(View view) {
        String nama = editNama.getText().toString();
        String alamat = editAlamat.getText().toString();
        if(nama.length()>0 && alamat.length()>0) {
            databaseHelper.addStudent(nama, alamat);
            onBackPressed();
        }
    }
}