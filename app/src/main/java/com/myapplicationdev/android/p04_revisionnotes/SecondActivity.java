package com.myapplicationdev.android.p04_revisionnotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
	ArrayList<Note> alNote;
	ArrayAdapter aaNote;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
		//TODO implement the Custom ListView

        lv = findViewById(R.id.lv);

        alNote = new ArrayList<Note>();
        aaNote = new RevisionNotesArrayAdapter(this, R.layout.row, alNote);
        DBHelper db = new DBHelper(SecondActivity.this);
        ArrayList<Note> data = db.getAllNotes();
        aaNote = new RevisionNotesArrayAdapter(this,R.layout.row,data);
        lv.setAdapter(aaNote);
	}


}
