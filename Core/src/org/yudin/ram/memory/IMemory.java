package org.yudin.ram.memory;

public interface IMemory {

	public double loadByID(Integer id);

	public void saveToID(Integer id, Double val);

}
