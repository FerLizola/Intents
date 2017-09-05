package ittepic.edu.mx.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> platillos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        platillos=new ArrayList<String>();

        platillos.add("Cochinita Pibil");
        platillos.add("Barbacoa");
        platillos.add("Chiles en Nogada");
        platillos.add("Mole");
        platillos.add("Pescado Zarandeado");
        platillos.add("Pozole");
        platillos.add("Tacos");
        platillos.add("Tamales");
        AdaptadorPlatillos adaptador = new AdaptadorPlatillos(this);
        ListView lv1 = (ListView)findViewById(R.id.lst_platillos);
        lv1.setAdapter(adaptador);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    lanzar("cochinita_pibil.class");
                } else if(position==1){
                    lanzar1("");
                } else if(position==2){
                    lanzar("chiles");
                }
                else if(position==3){
                    lanzar("mole");
                } else if(position==4){
                    lanzar("pescado");
                } else if(position==5){
                    lanzar("pozole");
                } else if(position==6){
                    lanzar("tacos");
                } else if(position==7){
                    lanzar("tamales");
                }

            }
        });

    }
    public void lanzar1(String a){
        Intent i = new Intent(this, Barbacoa.class);
        startActivity(i);
    }
    public void lanzar(String act){
        if(act.equals("cochinita_pibil.class")){
            Intent i = new Intent(this, cochinita_pibil.class);
            startActivity(i);
        }
        if(act.equals("chiles")){
            Intent i = new Intent(this, chiles.class);
            startActivity(i);
        }
        if(act.equals("mole")){
            Intent i = new Intent(this, Mole.class);
            startActivity(i);
        }
        if(act.equals("pescado")){
            Intent i = new Intent(this, pescado.class);
            startActivity(i);
        }
        if(act.equals("barbacoa")){
            Intent i = new Intent(this, Barbacoa.class);
            startActivity(i);
        }
        if(act.equals("pozole")){
            Intent i = new Intent(this, Pozole.class);
            startActivity(i);
        }
        if(act.equals("tacos")){
            Intent i = new Intent(this, Tacos.class);
            startActivity(i);
        }
        if(act.equals("tamales")){
            Intent i = new Intent(this, Tamales.class);
            startActivity(i);
        }
    }
    class AdaptadorPlatillos extends ArrayAdapter<String> {
        AppCompatActivity appCompatActivity;
        AdaptadorPlatillos(AppCompatActivity context) {
            super(context, R.layout.platillo, platillos);
            appCompatActivity = context;
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.platillo, null);
            TextView textView1 = (TextView)item.findViewById(R.id.textView);
            textView1.setText(""+platillos.get(position).toString());
            ImageView imageView1 = (ImageView)item.findViewById(R.id.imageView);
            if (platillos.get(position).toString().equals("Cochinita Pibil"))
                imageView1.setImageResource(R.mipmap.cochinitapibil);
            if (platillos.get(position).toString().equals("Barbacoa"))
                imageView1.setImageResource(R.mipmap.barbacoa);
            if (platillos.get(position).toString().equals("Chiles en Nogada"))
                imageView1.setImageResource(R.mipmap.chilesennogada);
            if (platillos.get(position).toString().equals("Mole"))
                imageView1.setImageResource(R.mipmap.mole);
            if (platillos.get(position).toString().equals("Pescado Zarandeado"))
                imageView1.setImageResource(R.mipmap.pescadozarandeado);
            if (platillos.get(position).toString().equals("Pozole"))
                imageView1.setImageResource(R.mipmap.pozole);
            if (platillos.get(position).toString().equals("Tacos"))
                imageView1.setImageResource(R.mipmap.tacos);
            if (platillos.get(position).toString().equals("Tamales"))
                imageView1.setImageResource(R.mipmap.tamales);
            //imageView1.setImageResource(R.mipmap.ittepic);
            return(item);
        }
    }
    //Intent browserIntent= new Intent (Intent.Action_View,URI.parse("URL"));
    //browserIntent.setPackage("com.android.chrome");
    //startActivity(browserIntent);
}


