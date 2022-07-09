//package com.example.week8;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//
//import java.util.List;
//import java.util.zip.Inflater;
//
//public class EmployeeAdaptor extends ArrayAdapter{
//    private Context context;
//    private List<Employee> employeeList;
//    private int layoutRes;
//    public EmployeeAdaptor(@NonNull Context context, int resource, @NonNull List<Employee> employeeList) {
//        super(context, resource, employeeList);
//        this.context = context;
//        this.employeeList = employeeList;
//        this.layoutRes = resource;
//    }
//
//    @Override
//    public int getCount() {
//        return employeeList.size();
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        LayoutInflater inflater = LayoutInflater.from(context);
//        View v = convertView;
//        if(v == null){
//            v = inflater.inflate(layoutRes, null);
//
//        }
//        TextView name_v = v.findViewById(R.id.------);
//    }
//}
