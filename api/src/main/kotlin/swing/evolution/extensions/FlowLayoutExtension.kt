package swing.evolution.extensions

import java.awt.FlowLayout
import javax.swing.JPanel

fun JPanel.flowLayout() {
    val panel = JPanel()
    val layout = FlowLayout()
    panel.layout = layout
}