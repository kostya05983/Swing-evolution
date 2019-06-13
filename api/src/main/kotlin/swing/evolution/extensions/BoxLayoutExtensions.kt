package swing.evolution.extensions

import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JPanel

fun JPanel.boxLayoutXAxis(op: JPanel.() -> Unit = {}): JPanel {
    val panel = JPanel()
    val layout = BoxLayout(panel, BoxLayout.X_AXIS)
    panel.layout = layout
    panel.apply(op)
    addToParent(panel)
    return panel
}

fun JPanel.boxLayoutYAxis(op: JPanel.() -> Unit = {}): JPanel {
    val panel = JPanel()
    val layout = BoxLayout(panel, BoxLayout.Y_AXIS)
    panel.layout = layout
    panel.apply(op)
    addToParent(panel)
    return panel
}

fun JPanel.boxLayoutLine(op: JPanel.() -> Unit = {}): JPanel {
    val panel = JPanel()
    val layout = BoxLayout(panel, BoxLayout.LINE_AXIS)
    panel.layout = layout
    panel.apply(op)
    addToParent(panel)
    return panel
}

fun JPanel.boxLayoutPage(op: JPanel.() -> Unit): JPanel {
    val panel = JPanel()
    val layout = BoxLayout(panel, BoxLayout.PAGE_AXIS)
    panel.layout = layout
    panel.apply(op)
    addToParent(panel)
    return panel
}

