package com.ehvaldepenia.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview



import com.ehvaldepenia.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
           UIPrincipal()
        }
    }
}

@Composable
fun UIPrincipal() {
    //Declaracion de variables de estado p/cada widget
    var txtNum by remember { mutableStateOf("") }
    var txtCant by remember { mutableStateOf("") }
    var txtImpares by remember { mutableStateOf("") }
    var txtPares by remember { mutableStateOf("") }
    var txtTotal by remember { mutableStateOf("") }
    var txtMayor by remember { mutableStateOf("") }
    var txtMenor by remember { mutableStateOf("") }
    var txtDivisores by remember { mutableStateOf("") }



    //Inicio de la GUI
    Column() {
        Text("Ingrese un numero")
        TextField(value = txtNum, onValueChange = { v -> txtNum = v})
        Button(onClick = {
            var n = txtNum.toInt()
            var r = 0
            var cant = 0
            var impares = 0
            var pares = 0
            var total = 0
            var mayor = 0
            var menor = 0

            while(n != 0) {
                r = n%10
                n = n / 10
                cant++
                if (r%2 == 0) pares++
                else impares++
            }
            txtCant = cant.toString()
            txtPares = pares.toString()
            txtImpares = impares.toString()
        }) {
            Text("Analizar")
        }
        Button(onClick = {}) {
            Text("Limpiar")
        }
        Text("Cantidad de cifras")
        TextField(value = txtCant, onValueChange = { v -> txtCant = v})
        Text("Suma de cifras impares")
        TextField(value = txtImpares, onValueChange = { v -> txtImpares = v})
        Text("Suma de cifras pares")
        TextField(value = txtPares, onValueChange = { v -> txtPares = v})
        Text("Suma total de cifras")
        TextField(value = txtTotal, onValueChange = { v -> txtTotal = v})
        Text("Cifra mayor")
        TextField(value = txtMayor, onValueChange = { v -> txtMayor = v})
        Text("Cifra menor")
        TextField(value = txtMenor, onValueChange = { v -> txtMenor = v})
        Text("Divisores")
        TextField(value = txtDivisores, onValueChange = { v -> txtDivisores = v})
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    UIPrincipal()
} 
