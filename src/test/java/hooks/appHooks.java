package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class appHooks 
{
@Before
public void beforeHooks()
{
	System.out.println("Before hooks");
}
@BeforeStep
public void beforestep1()
{
	System.out.println("before step 1");
}

@BeforeStep
public void beforestep2()
{
	System.out.println("before step 2");
}

@AfterStep
public void afterstep1()
{
	System.out.println("after step 1");
}
@AfterStep
public void afterstep2()
{
	System.out.println("after step 2");
}
@After
public void afterhooks()
{
	System.out.println("afterhooks8125");
}
}
