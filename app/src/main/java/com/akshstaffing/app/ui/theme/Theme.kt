package com.akshstaffing.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val ColorScheme = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = Color.White,
    primaryContainer = PrimaryDark,
    secondary = AccentColor,
    onSecondary = Color.White,
    background = BackgroundColor,
    surface = Color.White,
    onSurface = TextColor
)

@Composable
fun AkshStaffingTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = ColorScheme,
        content = content
    )
}
