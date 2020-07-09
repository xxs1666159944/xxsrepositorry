package one;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
//import org.easymock.IAnswer;
import org.junit.BeforeClass;
import org.junit.Test;

public class TimeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		Time t=EasyMock.createMock(Time.class);
		t.run();
		EasyMock.expectLastCall().anyTimes();
		EasyMock.replay(t);
		EasyMock.verify(t);
	    
	}

}
