package by.htp.web.command;

import by.htp.web.command.impl.DefaultActionImpl;
import by.htp.web.command.impl.OneActionImpl;
import by.htp.web.command.impl.TwoActionImpl;

public class CommandManager {

	public static BasicAction defineAction(String action) {

		switch (action) {
		case "1":
			return new OneActionImpl();
		case "2":
			return new TwoActionImpl();
		default:
			return new DefaultActionImpl();
		}
	}

}
