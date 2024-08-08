# CpfVisualTransformation

A custom `VisualTransformation` for Jetpack Compose that automatically formats user input as a Brazilian CPF (Cadastro de Pessoas Físicas) in an `OutlinedTextField`. This transformation ensures that the CPF is displayed in the standard format: `XXX.XXX.XXX-XX`.

## Features

- Formats input text as CPF in real-time.
- Maps cursor positions accurately between the original text and the formatted text.
- Easy integration with Jetpack Compose.

## Installation

Clone this repository and include the `CpfVisualTransformation` class in your Jetpack Compose project.

```bash
git clone https://github.com/alexvitaldev/CpfVisualTransformation.git
```
## Usage
```bash
Column {
        OutlinedTextField(
            value = cpfValue.value,
            onValueChange = { cpfValue.value = it },
            label = { Text("CPF") },
            visualTransformation = CpfVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
    }
```
## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Contributing
Contributions are welcome! If you have ideas for improvements or new features, feel free to open an issue or submit a pull request.

## Contact
For any inquiries or issues, please contact me.

