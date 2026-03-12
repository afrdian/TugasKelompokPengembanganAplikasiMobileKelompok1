package com.example.tugas1.modul1
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.tugas1.R


class ActivityUtama : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val angka = 5
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Penugasan Kedua Layouting",
                    fontSize = 24.sp
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row() {
                    AsyncImage(
                        model = "https://instagram.fmlg1-1.fna.fbcdn.net/v/t51.2885-19/363853346_6369767143112105_6450610984964099310_n.jpg?efg=eyJ2ZW5jb2RlX3RhZyI6InByb2ZpbGVfcGljLmRqYW5nby4xMDgwLmMyIn0&_nc_ht=instagram.fmlg1-1.fna.fbcdn.net&_nc_cat=105&_nc_oc=Q6cZ2QF7jupqMrXR61GitzCG6Cdh0pXhXCRSGQHn-ShYYS7wA_ZyNv877oc1niP2FGu0pU8&_nc_ohc=i5FDvQML9X8Q7kNvwE36DPE&_nc_gid=HYMxoMEOL88wtBqpo0M7lg&edm=AP4sbd4BAAAA&ccb=7-5&oh=00_AfyLfu3mboBAeWeFuq_Jm0oS7-uq98g7TEDRQLJE7kBiQQ&oe=69AED101&_nc_sid=7a9f4b",
                        contentDescription = null,
                        placeholder = painterResource(R.drawable.baseline_10mp_24),
                        error = painterResource(R.drawable.baseline_10mp_24),
                        modifier = Modifier.width(110.dp).height(110.dp)
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    AsyncImage(
                        model = "https://instagram.fmlg1-1.fna.fbcdn.net/v/t51.82787-15/619585371_18507765127075824_8828382966917717720_n.jpg?stp=dst-jpg_s150x150_tt6&efg=eyJ2ZW5jb2RlX3RhZyI6InByb2ZpbGVfcGljLmRqYW5nby4xMDgwLmMyIn0&_nc_ht=instagram.fmlg1-1.fna.fbcdn.net&_nc_cat=100&_nc_oc=Q6cZ2QFAsoqEyCAQSqronvjFbERU27Ohfqo9nSNXe5pQB6uCL_mrOMU0nK9Ust_30fmxeBU&_nc_ohc=xyrXm2Q-Z14Q7kNvwG9l6zL&_nc_gid=njRjYWRtsGCAnxG3l55G4A&edm=AHzjunoBAAAA&ccb=7-5&oh=00_AfzU7Jh7jujkPis5CmWtZ52DwLzNuycmaVASItxmCTx5sw&oe=69AEEDBF&_nc_sid=ba8368",
                        contentDescription = null,
                        placeholder = painterResource(R.drawable.baseline_10mp_24),
                        error = painterResource(R.drawable.baseline_10mp_24),
                        modifier = Modifier.width(110.dp).height(110.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    AsyncImage(
                        model = "https://picsum.photos/300/300",
                        contentDescription = null,
                        placeholder = painterResource(R.drawable.baseline_10mp_24),
                        error = painterResource(R.drawable.baseline_10mp_24)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween
                )
                {
                    Text(
                        text = "I Gusti Ngurah Anantawijaya Mahardika",
                        fontSize = 12.sp,
                        textAlign = TextAlign.Start
                    )
                    Spacer(modifier = Modifier.width(60.dp))
                    Text(
                        text = "245150700111027",
                        fontSize = 12.sp,
                        textAlign = TextAlign.End
                    )

                }

                Spacer(modifier = Modifier.height(16.dp))
                TextField(
                    value = "",
                    onValueChange = {}
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = {}) {
                    Text(text = "Click")
                }


            }
            ContactUsScreen()
        }


    }
}

data class Message (val author: String, val body: String)
@Composable
fun MessageCard(msg : Message){
    Text(text = msg.author)
    Spacer(modifier = Modifier.width(12.dp))
    Text(text = msg.body)
}

@Preview
@Composable
fun PreviewMessageCard(){
    Box() {
        MessageCard(
            msg = Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!")
        )
    }
    }
@Composable
fun MyAsyncImage(
    model: String,
    contentDescription: String?,
    placeholder: Painter
) {
    // Gunakan Image bawaan atau library Coil di sini
    // Contoh sederhana menggunakan Placeholder saja karena AsyncImage asli butuh library:
    Image(
        painter = placeholder,
        contentDescription = contentDescription,
        modifier = Modifier.height(200.dp)
    )
}

@Composable
fun TimerText(
    seconds: Int,
    modifier: Modifier = Modifier
) {
    Text(text = "Elapsed: $seconds seconds", modifier)
}