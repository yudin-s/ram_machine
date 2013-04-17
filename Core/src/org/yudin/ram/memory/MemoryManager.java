package org.yudin.ram.memory;

import java.util.HashMap;
import java.util.Map;

public class MemoryManager implements IMemory {

	private static MemoryManager manager = new MemoryManager();

	private Map<Integer, Double> memory = new HashMap<Integer, Double>();

	public static MemoryManager getInstance() {
		return manager;
	}

	@Override
	public double loadByID(Integer id) {
		Double val =  memory.get(id);
		return val != null ? val.doubleValue() : 0;
	}

	@Override
	public void saveToID(Integer id, Double val) {
		memory.put(id, val);
	}

}
