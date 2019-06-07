package swing.evolution.extensions

import java.awt.Component
import javax.swing.JPanel

class Example : View() {
    override val root: JPanel = boxLayoutLine {
        boxLayoutXAxis {
            button {
                alignmentX = Component.BOTTOM_ALIGNMENT
            }
        }

    }

}