package com.example.textfield_pamii

import android.inputmethodservice.Keyboard.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.textfield_pamii.ui.theme.TextField_PAMIITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextField_PAMIITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    register()
                }
            }
        }
    }
}

@Composable
fun register() {
    var nome by remember { mutableStateOf("") }
    var Bairro by remember { mutableStateOf("") }
    var cep by remember { mutableStateOf("") }
    var cidade by remember { mutableStateOf("") }
    var Estado by remember { mutableStateOf("") }

    Column(
        Modifier
            .fillMaxWidth(),
        Arrangement.Center
    ) {

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(
                text = "App cadastro",
                fontSize = 20.sp
            )
        }

        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        )

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = nome, //Variavel: var nome by remember { mutableStateOf("") }

                onValueChange = { novoValor -> nome = novoValor },
                label = { Text("Digite seu nome") }
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // Adiciona espaço vertical

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = Bairro, //Variavel: var nome by remember { mutableStateOf("") }

                onValueChange = { novoValor -> Bairro = novoValor },
                label = { Text("Digite seu Bairro") }
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // Adiciona espaço vertical

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = cep, //Variavel: var nome by remember { mutableStateOf("") }

                onValueChange = { novoValor -> cep = novoValor },
                label = { Text("Digite seu cep") }
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // Adiciona espaço vertical

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = cidade, //Variavel: var nome by remember { mutableStateOf("") }

                onValueChange = { novoValor -> cidade = novoValor },
                label = { Text("Digite seu cidade") }
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // Adiciona espaço vertical

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = Estado, //Variavel: var nome by remember { mutableStateOf("") }

                onValueChange = { novoValor -> Estado = novoValor },
                label = { Text("Digite seu Estado") }
            )
        }
        Spacer(modifier = Modifier.height(16.dp)) // Adiciona espaço vertical

        Row(Modifier
            .fillMaxWidth(),
            Arrangement.Center
        ){

            Button(onClick = {}) {
                Text(text = "Cadastrar")
            }
        }
    }
}

@Composable
@Preview
fun registerPreviw(){
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        register()
    }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TextField_PAMIITheme {
        Greeting("Android")
    }
}