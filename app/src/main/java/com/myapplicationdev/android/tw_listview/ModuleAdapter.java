package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private ArrayList<Module> moduleArrayList;
    private Context context;
    private TextView tvModuleCode;
    private ImageView ivProgram;


    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects) {
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        moduleArrayList = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvModuleCode = rowView.findViewById(R.id.tVModuleCode);
        // Get the ImageView object
        ivProgram = rowView.findViewById(R.id.ivProgram);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Module currentFood = moduleArrayList.get(position);
        // Set the TextView to show the food

        tvModuleCode.setText(currentFood.getMc());
        // Set the image to star or nostar accordingly
        if (currentFood.isProgramming()) {
            ivProgram.setImageResource(R.drawable.prog);
        } else {
            ivProgram.setImageResource(R.drawable.nonprog);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}




