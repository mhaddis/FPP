package lesson5Prb5;

import java.util.Objects;

public class Computer {

	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;

	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {

		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}

	int getRamSize() {

		return ramSize;

	}

	double getProcessorSpeed() {
		return processorSpeed;
	}

	double computePower() {

		return (ramSize * processorSpeed);
	}

	@Override

	public String toString() {

		return "Manufacturer Name: " + this.manufacturer + "Processor: " + this.processor + "RAM size: " + this.ramSize
				+ "Processor Speed: " + this.processorSpeed;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (ob == this)
			return true;
		if (!(ob instanceof Computer))
			return false;

		Computer c = (Computer) ob;
		return (c.manufacturer.equals(this.manufacturer) && c.processor.equals(this.processor)
				&& c.ramSize == this.ramSize && c.ramSize == this.ramSize && c.processorSpeed == this.processorSpeed);
	}

	/*
	 * java 7
	 * 
	 * @Override public int hashCode() { int x=1;
	 * 
	 * x += manufacturer.hashCode(); x += processor.hashCode();
	 * 
	 * long lo = Double.doubleToLongBits(processorSpeed); int hh = (int) (lo * (lo
	 * >>> 32)); x += hh; x += ramSize;
	 * 
	 * return x; }
	 */

	// java 8
	@Override
	public int hashCode() {

		return Objects.hash(manufacturer, processor, processorSpeed, ramSize);
	}
}
