import com.googlecode.lanterna.TerminalSize
import com.googlecode.lanterna.TextColor
import com.googlecode.lanterna.gui2.*
import com.googlecode.lanterna.screen.Screen
import com.googlecode.lanterna.screen.TerminalScreen
import com.googlecode.lanterna.terminal.DefaultTerminalFactory
import com.googlecode.lanterna.terminal.Terminal
import java.util.Arrays.asList

fun main(args: Array<String>) {
	var gui1 = DefaultTerminalFactory().createTerminal()
	var screen = TerminalScreen(gui1)
	screen.startScreen()

	var panel = Panel()
	panel.setLayoutManager(GridLayout(2))

	panel.addComponent(Label("kys?"))
	panel.addComponent(TextBox())

	panel.addComponent(EmptySpace(TerminalSize(0,0)))
	panel.addComponent(Button("okhe"))

	var okno = BasicWindow()
	okno.component = panel
	okno.setHints(asList(Window.Hint.CENTERED))

	var finalgui = MultiWindowTextGUI(screen, DefaultWindowManager(), EmptySpace(TextColor.ANSI.BLUE))
	finalgui.addWindowAndWait(okno)




}