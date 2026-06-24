package com.example.listajuegos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.listajuegos.model.Game
import com.example.listajuegos.ui.GameCard
import com.example.listajuegos.ui.theme.ListaJuegosTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            ListaJuegosTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val games = listOf(

                        Game("The Witcher 3", "PC", "🎮"),
                        Game("God of War", "PlayStation", "⚔️"),
                        Game("Halo Infinite", "Xbox", "🚀"),
                        Game("Minecraft", "Multiplataforma", "⛏️"),
                        Game("Zelda TOTK", "Nintendo Switch", "🏹"),
                        Game("FIFA 25", "PlayStation", "⚽"),
                        Game("Cyberpunk 2077", "PC", "🌆"),
                        Game("Mario Kart 8", "Nintendo Switch", "🏎️"),
                        Game("Elden Ring", "PC", "👑"),
                        Game("Resident Evil 4", "PlayStation", "🧟")
                    )

                    LazyColumn {

                        items(games) { game ->

                            GameCard(game)

                        }
                    }
                }
            }
        }
    }
}