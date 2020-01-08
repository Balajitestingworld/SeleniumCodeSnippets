package testNG;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public	class FactoryTest {
		@Factory
		public Object[] factoryMethod() {
			return new Object[] { new PriorityTest(), new PriorityTest() };
		}
	}
