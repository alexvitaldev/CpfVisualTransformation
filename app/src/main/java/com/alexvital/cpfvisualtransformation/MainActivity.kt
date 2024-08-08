package com.alexvital.cpfvisualtransformation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alexvital.cpfvisualtransformation.ui.theme.CpfVisualTransformationTheme

/**
 * MainActivity serves as the entry point for the application.
 * It sets up the UI and applies the custom CPF visual transformation to an input field.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CpfVisualTransformationTheme {
                // A Surface container using the background color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CpfTextField()
                }
            }
        }
    }
}

/**
 * A composable function that creates a text field for CPF input.
 * The CPF input is automatically formatted using the CpfVisualTransformation.
 */
@Composable
fun CpfTextField() {
    val cpfValue = remember { mutableStateOf("") }

    Column {
        OutlinedTextField(
            value = cpfValue.value,
            onValueChange = { cpfValue.value = it },
            label = { Text("CPF") },
            visualTransformation = CpfVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

/**
 * Preview function for CpfTextField, allowing you to see the component in Android Studio's preview.
 */
@Preview(showBackground = true)
@Composable
fun CpfTextFieldPreview() {
    CpfVisualTransformationTheme {
        CpfTextField()
    }
}
