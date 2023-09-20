package com.myapp.creativeartwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myapp.creativeartwork.ui.theme.CreativeArtWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreativeArtWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    ArtWork()
                }
            }
        }
    }
}

data class ArtFormat(
    val painter: Painter,
    val text: String,
    val author: String,
)

@Composable
fun ArtWork() {
    val artFormats: List<ArtFormat> = listOf(
        ArtFormat(painterResource(R.drawable.team_work), "Team Works Together", "At. Jonas"),
        ArtFormat(
            painterResource(R.drawable.work_together), "Work Together Always Suceed", "African"
        ),
        ArtFormat(painterResource(R.drawable.work_png_pic), "Together, we are an ocean", "St. Poll")
    )
    var currentIndex: Int by remember { mutableStateOf(0) }
    val currentArtWork = artFormats[currentIndex]
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
            .shadow(10.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = currentArtWork.painter,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = currentArtWork.text, fontSize = 30.sp, modifier = Modifier.padding(start = 20.dp)
        )
        Text(
            text = currentArtWork.author, fontSize = 30.sp, modifier = Modifier.padding(10.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))
        Row {
            if (currentIndex != 0) {
                Button(onClick = {
                    currentIndex = currentIndex - 1
                }) {
                    Text(text = "Previous")
                }
            }

            Spacer(modifier = Modifier.width(25.dp))
            if (currentIndex != 2) {
                Button(onClick = { currentIndex += 1 }) {
                    Text(text = "Next")

                }

            }

        }
    }
}

        @Preview(showBackground = true)
        @Composable
        fun CreativeArtPreview() {
            CreativeArtWorkTheme {
                ArtWork()
            }
        }
