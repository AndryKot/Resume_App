package com.fhad.resume_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick(View view){
        switch(view.getId()){
            case R.id.btn_info:
                Intent intent_info = new Intent(this,InfoActivity.class);
                startActivity(intent_info);
                break;
            case R.id.btn_skills:
                Intent intent_skills = new Intent(this,SkillsActivity.class);
                startActivity(intent_skills);
                break;
            case R.id.btn_contacts:
                Intent intent_contacts = new Intent(this,ContactsActivity.class);
                startActivity(intent_contacts);
                break;
            default:
                break;

        }
    }
}
