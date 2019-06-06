package swing.evolution.extensions

import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JPanel

fun JPanel.boxLayoutX(op: JPanel.() -> Unit = {}) {
    val panel = JPanel()
    val layout = BoxLayout(panel, BoxLayout.X_AXIS)
    panel.layout = layout
    panel.apply(op)
    //TODO add to tree this node
}

fun JPanel.boxLayoutY(op: JPanel.() -> Unit = {}) {
    val panel = JPanel()
    val layout = BoxLayout(panel, BoxLayout.Y_AXIS)
    panel.layout = layout
    panel.apply(op)
    //TODO add to tree this node
}

fun JPanel.boxLayoutL(op: JPanel.() -> Unit = {}) {
    val panel = JPanel()
    val layout = BoxLayout(panel, BoxLayout.LINE_AXIS)
    panel.layout = layout
    panel.apply(op)
    //TODO
}

fun JPanel.boxLayoutP(op: JPanel.() -> Unit) {
    val panel = JPanel()
    val layout = BoxLayout(panel, BoxLayout.PAGE_AXIS)
    panel.layout = layout
    panel.apply(op)
    //TODO
}

