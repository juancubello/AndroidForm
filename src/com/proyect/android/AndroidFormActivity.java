package com.proyect.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AndroidFormActivity extends Activity implements OnItemSelectedListener{
	
	private Spinner spinner;
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_formulario);
		initElements();
		
	}

	private void initElements(){
		spinner = (Spinner)findViewById(R.id.spinner1);
		generateSpinnerValues();
	}

	private void generateSpinnerValues(){
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ciudades, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		spinner.setAdapter(adapter);
		
	}
}