package uz.softonic.eexpert

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.stringResource
import uz.softonic.eexpert.resources.Res
import uz.softonic.eexpert.resources.app_name
import uz.softonic.eexpert.resources.greeting

@Composable
fun App() {
    MaterialTheme {
        Scaffold { padding ->
            Column(
                modifier = Modifier.fillMaxSize().padding(padding),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                var showGreeting by remember { mutableStateOf(false) }
                Text(stringResource(Res.string.app_name), style = MaterialTheme.typography.headlineSmall)
                Button(onClick = { showGreeting = !showGreeting }, modifier = Modifier.padding(top = 16.dp)) {
                    Text(stringResource(Res.string.greeting))
                }
                if (showGreeting) {
                    Text("Kotlin Multiplatform 🎉", modifier = Modifier.padding(top = 16.dp))
                }
            }
        }
    }
}
