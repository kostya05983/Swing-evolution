package swing.evolution.extensions

import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.JButton
import javax.swing.JPanel

fun JPanel.button(op: JButton.() -> Unit = {}) {
    val button = JButton()
    button.apply(op)
    addToParent(button)
}

fun JPanel.button(label: String, op: JButton.() -> Unit = {}) {
    val button = JButton()
    button.apply(op)
    addToParent(button)
}

fun JButton.mouseAction(op: MouseListener.() -> Unit = {}) {
    val obj = object: MouseListener {
        override fun mouseReleased(e: MouseEvent?) {

            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun mouseEntered(e: MouseEvent?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun mouseClicked(e: MouseEvent?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun mouseExited(e: MouseEvent?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun mousePressed(e: MouseEvent?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}

fun MouseListener.onRelease(e: (it: MouseEvent) -> Unit = {}) {

}

fun MouseListener.onEntered(e: (it: MouseEvent) -> Unit = {}) {

}

fun MouseEvent.onClick(e: (it: MouseEvent) -> Unit = {}) {

}

fun MouseEvent.onExit(e: (it: MouseEvent) -> Unit = {}) {

}

fun MouseEvent.onPressed(e: (it: MouseEvent) -> Unit = {}) {

}
