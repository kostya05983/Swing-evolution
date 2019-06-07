package swing.evolution.extensions

import java.awt.GridLayout
import javax.swing.JPanel

fun JPanel.girdLayout() {
    val panel = JPanel()
    val layout = GridLayout()
    panel.layout = layout
}

fun JPanel.gridLayout(rows: Int, columns: Int) {
    val panel = JPanel()
    val layout = GridLayout(rows, columns)
    panel.layout = layout
}

fun main() {
    val panel = JPanel()
    panel.boxLayoutLine {
        button {
            text = "Trampapam"
        }
        boxLayoutYAxis {
            button {
                text = "TestTest"
            }
        }
    }

}