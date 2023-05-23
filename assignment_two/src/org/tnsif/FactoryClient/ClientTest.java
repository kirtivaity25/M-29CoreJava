package org.tnsif.FactoryClient;
/**
 *
 *Client program which makes use of Factory Design Pattern
 */
import org.tnsif.factorydesignpattern.Computer;
import org.tnsif.factorydesignpattern.ComputerFactory;
import org.tnsif.factorydesignpattern.ComputerType;

public class ClientTest {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(ComputerType.PC,"16GB","120GB","2.23HGZ",true,true);
		System.out.println("PC Config::"+pc);
		
		Computer server = ComputerFactory.getComputer(ComputerType.SERVER,"18GB","128GB","2.34HGZ",true,true);
		System.out.println("SERVER Config::"+server);
		
		Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP,"19GB","256GB","2.45HGZ",true,true);
		System.out.println("LAPTOP Config::"+laptop);
	}

}