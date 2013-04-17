package org.yudin.ram.inter.commands.memory;

import org.yudin.ram.inter.IRunnerComand;
import org.yudin.ram.memory.MemoryManager;
import org.yudin.ram.system.Reader;
import org.yudin.ram.system.Worker;

public class Read implements IRunnerComand {

	@Override
	public boolean run(boolean isCubicle, int value) {
		int readed = Reader.readNext();
		MemoryManager manager = MemoryManager.getInstance();
		if (isCubicle) {
			manager.saveToID(0, (double) readed);
		} else {
			throw new UnsupportedOperationException("Only cubicle operation");
		}
		return Worker.getInstance().nextLine();
	}

}
