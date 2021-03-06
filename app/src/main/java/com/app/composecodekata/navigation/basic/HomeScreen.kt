package com.app.composecodekata.navigation.basic

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

/**
 * Problem - 1: We need to navigate from Home Screen to Detail screen
 *
 * Problem - 2: We need to navigate from Details Screen to Home screen explicitly without the back button
 *
 * Problem - 3: How do we fix the backstack problem?
 *
 * Hint: https://developer.android.com/jetpack/compose/navigation
 */
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            // Hint: To add a click event make use of a Modifier
            text = "Home",
            color = MaterialTheme.colors.primaryVariant,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen()
}