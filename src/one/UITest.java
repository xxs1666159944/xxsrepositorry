package one;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class UITest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testDrow_color() {
		UI ui=EasyMock.createMock(UI.class);
		ui.Draw_color(100, 100);
		EasyMock.expectLastCall().anyTimes();   
		EasyMock.replay(ui);
		EasyMock.verify(ui);
	}
	
	@Test
	public void testInitialize() {
		UI ui=EasyMock.createMock(UI.class);
		ui.initialize();
		EasyMock.expectLastCall().anyTimes();
		EasyMock.replay(ui);
		EasyMock.verify(ui);
	}

}

