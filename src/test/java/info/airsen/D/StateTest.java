package info.airsen.D;

import info.airsen.D.state.Context;
import info.airsen.D.state.State;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * <p>状态模式测试类</p>
 *
 * @author airsen
 * @since 13-1-13 下午4:30
 */
public class StateTest {

	private Context context;

	@Before
	public void init(){
		context = new Context(State.NORMAL);
	}

	@Test
	public void eat(){
		context.setState(State.HEALTH);
		Assert.assertEquals(State.NORMAL,context.eat());
		context.setState(State.NORMAL);
		Assert.assertEquals(State.FULL,context.eat());
		context.setState(State.FULL);
		Assert.assertEquals(State.SICK,context.eat());
		context.setState(State.SICK);
		Assert.assertEquals(State.SICK,context.eat());
		context.setState(State.HUNGRY);
		Assert.assertEquals(State.NORMAL,context.eat());
	}

	@Test
	public void play(){
		context.setState(State.HEALTH);
		Assert.assertEquals(State.NORMAL,context.play());
		context.setState(State.NORMAL);
		Assert.assertEquals(State.HUNGRY,context.play());
		context.setState(State.HUNGRY);
		Assert.assertEquals(State.SICK,context.play());
		context.setState(State.FULL);
		Assert.assertEquals(State.NORMAL,context.play());
		context.setState(State.SICK);
		Assert.assertEquals(State.SICK,context.play());
	}

	@Test
	public void takePills(){
		context.setState(State.HUNGRY);
		Assert.assertEquals(State.NORMAL,context.takePills());
		context.setState(State.FULL);
		Assert.assertEquals(State.NORMAL,context.takePills());
		context.setState(State.SICK);
		Assert.assertEquals(State.NORMAL,context.takePills());
		context.setState(State.NORMAL);
		Assert.assertEquals(State.HEALTH,context.takePills());
		context.setState(State.HEALTH);
		Assert.assertEquals(State.HEALTH,context.takePills());
	}

//	@Test
	public void client(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int input;
		try {
			System.out.println("输入：1、吃一顿；2、玩一阵；3、万能恢复");
			while ((input = Integer.valueOf(reader.readLine())) != 0) {
				switch (input) {
					case 1:
						context.eat();
						break;
					case 2:
						context.play();
						break;
					case 3:
						context.takePills();
						break;
					default:
						continue;
				}
				System.out.println("输入：1、吃一顿；2、玩一阵；3、万能恢复");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
