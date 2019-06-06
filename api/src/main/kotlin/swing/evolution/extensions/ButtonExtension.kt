package swing.evolution.extensions

import javax.swing.JButton
import javax.swing.JPanel

fun JPanel.button(op: JButton.() -> Unit = {}) {
    val button = JButton()
    button.apply(op)
}

fun JPanel.button(label: String, op: JButton.() -> Unit = {}) {
    val button = JButton()
    button.apply(op)
}
