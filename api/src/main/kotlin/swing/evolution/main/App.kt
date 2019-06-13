package swing.evolution.main

import javax.swing.JFrame
import javax.swing.JPanel
import kotlin.reflect.KClass

abstract class App<T : View> {
    private lateinit var frame: JFrame

    abstract val root: KClass<T>

    init {
        frame = JFrame()
//        val instance = root.objectInstance as JPanel
//        frame.contentPane = instance
    }
}