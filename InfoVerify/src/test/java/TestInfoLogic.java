import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Info;
import model.InfoBusLogic;

public class TestInfoLogic {
	InfoBusLogic infBL = new InfoBusLogic();
	Info info = new Info();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testZipLength() {
		info.setZip(50201);
		assertTrue(infBL.zipLengthLess5(info));
	}
	
	@Test
	public void testStateInit() {
		info.setStateIntial("IA");
		assertTrue(infBL.stateInit(info));
	}
	
	@Test
	public void testInfoString() {
		info.setNumber(7823);
		info.setStreet("10th Street");
		info.setZip(50201);
		info.setStateIntial("IA");
		infBL.printInfo(info);
	}
}
