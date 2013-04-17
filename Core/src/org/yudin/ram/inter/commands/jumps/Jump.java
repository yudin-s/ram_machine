package org.yudin.ram.inter.commands.jumps;

import org.yudin.ram.inter.IRunnerComand;
import org.yudin.ram.memory.MemoryManager;
import org.yudin.ram.system.Worker;

public class Jump implements IRunnerComand {

	@Override
	public boolean run(boolean isCubicle, int value) {
		MemoryManager manager = MemoryManager.getInstance();
		if (isCubicle) {
			Worker worker = Worker.getInstance();
			return worker.moveToLine(value);
		} else {
			throw new UnsupportedOperationException("Only cubicle");
		}
	}

}
