package com.example.week8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.example.week8.databinding.ActivityMainBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    private List<Employee> empList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());


        empList = new ArrayList<>();

//        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //TODO: add employee
//                addEmployee();
//            }
//        });

        binding.btnAdd.setOnClickListener(this);
        binding.tvDisplay.setOnClickListener(this);

//        binding.tvDisplay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // TODO: 2022-07-09 display emp list
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_add) {
            // TODO: 2022-07-09 ADD employee

            addEmployee();

        }
    }

    private void addEmployee() {
        System.out.println("FFFFFFFFFFF");
        String name = binding.editTextName.getText().toString().trim();
        String salary = binding.salary.getText().toString().trim();
        String department = binding.dept.getText().toString();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss", Locale.getDefault());
        String joining_date = simpleDateFormat.format(calendar.getTime());

        if(name.isEmpty()){
            binding.editTextName.setError("Name is mandatory");
            binding.editTextName.requestFocus();
            return;
        }

        if(salary.isEmpty()){
            binding.salary.setError("Salary is mandatory");
            binding.salary.requestFocus();
            return;
        }

        Employee employee = new Employee(
                name,
                department,
                joining_date,
                Double.parseDouble(salary));

        empList.add(employee);
        Log.d("TAG", "addEmployee: " + empList);
    }


}