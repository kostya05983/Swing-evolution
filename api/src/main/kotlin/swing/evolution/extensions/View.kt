package swing.evolution.extensions

import javax.swing.JComponent
import javax.swing.JPanel

abstract class View : JPanel() {
    abstract val root: JPanel
}

fun JPanel.addToParent(component: JComponent) {
    if (parent != null) {
        parent.add(component)
    }
}