package com.example.tugas1.modul2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.danza.avatar.Login
import com.example.tugas1.R

class Muka : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MukaScreen(onBackClick = { finish() })
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MukaScreen(onBackClick: () -> Unit = {}) {

    var eyesVisible  by remember { mutableStateOf(true) }
    var noseVisible  by remember { mutableStateOf(true) }
    var mouthVisible by remember { mutableStateOf(true) }
    var hairVisible  by remember { mutableStateOf(true) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Muka") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 16.dp, vertical = 8.dp) // FIX: less vertical padding
                .verticalScroll(rememberScrollState()),        // FIX: scrollable so Hair is reachable
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth(0.75f)   // FIX: narrower so less vertical space is consumed
                    .aspectRatio(1f)       // FIX: square instead of 3:4, brings toggles closer
                    .clip(MaterialTheme.shapes.large)
            ) {
                // Layer 1 — base face (always on)
                Image(
                    painter = painterResource(id = R.drawable.muka_polosan),
                    contentDescription = "Base face",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.matchParentSize()
                )
                // Layer 2 — eyes
                if (eyesVisible) {
                    Image(
                        painter = painterResource(id = R.drawable.muka_mata),
                        contentDescription = "Eyes",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.matchParentSize()
                    )
                }
                // Layer 3 — nose
                if (noseVisible) {
                    Image(
                        painter = painterResource(id = R.drawable.muka_hidung),
                        contentDescription = "Nose",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.matchParentSize()
                    )
                }
                // Layer 4 — mouth
                if (mouthVisible) {
                    Image(
                        painter = painterResource(id = R.drawable.muka_mulut),
                        contentDescription = "Mouth",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.matchParentSize()
                    )
                }
                // Layer 5 — hair
                if (hairVisible) {
                    Image(
                        painter = painterResource(id = R.drawable.muka_rambut),
                        contentDescription = "Hair",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.matchParentSize()
                    )
                }
            }

            Text("Ilangin Muka Ngurah", style = MaterialTheme.typography.titleMedium)

            ToggleRow(label = "Eyes",  checked = eyesVisible,  onCheckedChange = { eyesVisible  = it })
            ToggleRow(label = "Nose",  checked = noseVisible,  onCheckedChange = { noseVisible  = it })
            ToggleRow(label = "Mouth", checked = mouthVisible, onCheckedChange = { mouthVisible = it })
            ToggleRow(label = "Hair",  checked = hairVisible,  onCheckedChange = { hairVisible  = it })

            Spacer(modifier = Modifier.height(16.dp))

            val context = LocalContext.current
            Button(
                onClick = {
                    context.startActivity(Intent(context, Login::class.java))
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Go to Profile")
            }
        }
    }
}

@Composable
private fun ToggleRow(
    label: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(label, style = MaterialTheme.typography.bodyLarge)
        Switch(checked = checked, onCheckedChange = onCheckedChange)
    }
}