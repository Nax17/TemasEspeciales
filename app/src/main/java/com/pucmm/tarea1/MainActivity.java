package com.pucmm.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button button;
    private Button clean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = findViewById(R.id.textNombre);
        final EditText lastname = findViewById(R.id.textApellido);
        final Spinner genero = findViewById(R.id.gender_selector);
        final RadioButton radiono = findViewById(R.id.radioNo);
        final RadioButton radiosi = findViewById(R.id.radioSi);
        final CheckBox java = findViewById(R.id.checkJava);
        final CheckBox js = findViewById(R.id.checkJS);
        final CheckBox c = findViewById(R.id.checkC);
        final CheckBox python = findViewById(R.id.checkPython);
        final CheckBox go = findViewById(R.id.checkGo);
        final CheckBox cs = findViewById(R.id.checkCSharp);

        button = findViewById(R.id.buttonSend);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(name.getText()) || TextUtils.isEmpty(lastname.getText())) {
                    Toast.makeText(getApplicationContext(), "Debe introducir nombre y apellido.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra("NAME", name.getText().toString());
                    intent.putExtra("LASTNAME", lastname.getText().toString());
                    intent.putExtra("GENDER", genero.getSelectedItem().toString());
                    if (radiono.isChecked()) {
                        intent.putExtra("GUSTA", "No");
                    } else {
                        intent.putExtra("SGUSTA", "Mis Lenguajes favoritos son: ");
                        if (java.isChecked()) {
                            intent.putExtra("JAVA", "Java, ");
                        }
                        if (js.isChecked()) {
                            intent.putExtra("JS", "JS, ");
                        }
                        if (c.isChecked()) {
                            intent.putExtra("C", "C/C++, ");
                        }
                        if (cs.isChecked()) {
                            intent.putExtra("CS", "C#, ");
                        }
                        if (python.isChecked()) {
                            intent.putExtra("PYTHON", "Python, ");
                        }
                        if (go.isChecked()) {
                            intent.putExtra("GO", "Go Land, ");
                        }
                    }
                    startActivity(intent);
                }
            }
        });
        clean = findViewById(R.id.buttonClean);
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                lastname.setText("");
                genero.setSelection(0);
                if(radiono.isChecked())
                    radiosi.setChecked(true);
                if (java.isChecked())
                    java.setChecked(false);
                if (js.isChecked())
                    js.setChecked(false);
                if (c.isChecked())
                    c.setChecked(false);
                if (cs.isChecked())
                    cs.setChecked(false);
                if (python.isChecked())
                    python.setChecked(false);
                if (go.isChecked())
                    go.setChecked(false);
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.generos, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genero.setAdapter(adapter);
        genero.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}