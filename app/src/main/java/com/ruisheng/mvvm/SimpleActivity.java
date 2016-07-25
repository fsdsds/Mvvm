package com.ruisheng.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ruisheng.mvvm.Model.Person;
import com.ruisheng.mvvm.databinding.ActivitySimpleBinding;

public class SimpleActivity extends AppCompatActivity {
    Person person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySimpleBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_simple);
        person = new Person();person.Name.set("Tony");person.Age.set(16);person.Career.set("程序员");
        binding.setPerson(person);
    }

    public void AddAge(View v){
        person.Age.set(person.Age.get()+1);
    }

    public void DownAge(View v){
        person.Age.set(person.Age.get()-1);
    }
}
