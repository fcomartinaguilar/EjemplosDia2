package ejemplos.ejerciciosandroid.fma.ejemplosdia2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
        //Button btnColor = (Button) findViewById(R.id.btnColor);





        //btn.setTextColor(Color.parseColor("#bdbdbd"));
        //btn.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        //btn.setTextColor(Color.GREEN);
        //btn.setTextColor(Color.argb(125, 0, 0, 125));


        public void Pulsar (View v) {


                EditText texto = (EditText) findViewById(R.id.textView);

                EditText posIni = (EditText) findViewById(R.id.editText);
                EditText posFin = (EditText) findViewById(R.id.editText2);

                int posInicial = Integer.parseInt(posIni.getText().toString());
                int posFinal = Integer.parseInt(posFin.getText().toString());

                Editable ed =  texto.getEditableText();

                switch (v.getId()) {

                    case R.id.btnColor:

                        ed.setSpan(new ForegroundColorSpan(Color.RED), posInicial, posFinal, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                        break;

                    case R.id.btnNegrita:


                        ed.setSpan(new StyleSpan(Typeface.BOLD), posInicial, posFinal, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        break;

                    case R.id.btnSeleccion:


                        int tinicio = texto.getSelectionStart();
                        int tfinal = texto.getSelectionEnd();

                        if (tinicio==0 || tfinal==0) {


                        }

                        int inicio = getResources().getInteger(R.integer.posInicial);
                        int fin = getResources().getInteger(R.integer.posFinal);

                        texto.setSelection(inicio,fin);


                        break;

                    case R.id.btnTamaño:

                        ed.setSpan(new AbsoluteSizeSpan(25), posInicial, posFinal, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                        break;
                }


        }
}



