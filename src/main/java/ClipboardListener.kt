import java.awt.Toolkit

class ClipboardListener {
    fun copy() {
        Toolkit.getDefaultToolkit().systemClipboard.addFlavorListener { event -> println("ClipBoard UPDATED: " + event.source + " " + event.toString()) }
    }
}