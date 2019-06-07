package swing.evolution.extensions

import javax.swing.JPanel

class Example : View() {
    override val root: JPanel = boxLayoutLine {
        boxLayoutXAxis {

        }
    }

}