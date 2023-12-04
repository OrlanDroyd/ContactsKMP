import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import di.AppModule

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App(darkTheme = false, dynamicColor = false, appModule = AppModule())
    }
}