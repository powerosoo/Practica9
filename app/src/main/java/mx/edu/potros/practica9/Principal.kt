package mx.edu.potros.practica9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Principal : AppCompatActivity() {
    lateinit var tvNombre: TextView
    lateinit var tvEmail: TextView
    lateinit var btnCerrar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        // Inicializar vistas
        tvNombre = findViewById(R.id.tv_nombre)
        tvEmail = findViewById(R.id.tv_email)
        btnCerrar = findViewById(R.id.btn_cerrar)

        val bundle = intent.extras

        if (bundle != null){
            val name = bundle.getString("name")
            val email = bundle.getString("email")
            tvNombre.setText(name)
            tvEmail.setText(email)
        }

        btnCerrar.setOnClickListener{
            finish()
        }
    }

}