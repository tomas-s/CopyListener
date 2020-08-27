import java.awt.FlowLayout
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.SwingUtilities


fun main() {
    SwingUtilities.invokeLater { createAndShowGUI() }
}

fun createAndShowGUI() {
    val f = JFrame()
    f.layout = FlowLayout()


    val label = JLabel()
    label.text = "Ahoj svet"
    f.add(label)

    f.setSize(400, 500)
    f.isVisible = true

}
