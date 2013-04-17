package org.yudin.ram.system;

import org.yudin.ram.inter.Command;

public interface ICodeWorker {

	public boolean nextLine();

	public int currentLine();

	public Command currentCommand();

	public boolean moveToLine(int line);

	public boolean reset();

}
