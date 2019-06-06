package swing.evolution.extensions

import javax.swing.JLabel
import javax.swing.JPanel

fun JPanel.label(text: String, op: JLabel.() -> Unit = {}) {
    val label = JLabel(text)
    label.apply(op)
    //TODO add to parent
}

fun JPanel.label(op: JLabel.() -> Unit = {}) {
    val label = JLabel()
    label.apply(op)
    //TODO add to parent
}

