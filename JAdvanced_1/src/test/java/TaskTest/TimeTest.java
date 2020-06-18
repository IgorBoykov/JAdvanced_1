package TaskTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import Task.Time;

public class TimeTest {

	public Time time;

	@Rule
	public TestWatcher testWatcher = new TestWatcher() {

		protected void failed(Throwable e, org.junit.runner.Description description) {
			System.out.println("FAILED --> " + description.getMethodName());
		};

		protected void succeeded(org.junit.runner.Description description) {
			System.out.println("SUCCEED --> " + description.getMethodName());
		};

	};

	@Before
	public void beforeTest() {
		time = new Time(12, 21);
	}

	@After
	public void afterTest() {
		time = null;
	}

	@Test
	public void timeTest1() {
		new Time(15, 20);
	}

	@Test
	public void sumTimeTest() {
		Time realSum = Time.sumTime(new Time(10, 11), new Time(2, 10));
		Time expectedSum = new Time(21, 12);
		Assert.assertEquals(expectedSum, realSum);
	}
}