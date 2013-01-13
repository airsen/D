package info.airsen.D;

import info.airsen.D.template.Player.Saya;
import info.airsen.D.template.Player.Shualu;
import org.junit.Test;

/**
 * <p>模板模式</p>
 *
 * @author airsen
 * @since 13-1-13 下午7:37
 */
public class TemplateTest {

	@Test
	public void client() {
		Saya wukongSun = new Saya();
		Shualu shualu = new Shualu();
		wukongSun.init("孙悟空");
		shualu.init("沙鲁");
		int round = 1;
		while (true) {
			System.out.println("======  Round : " + round++ + "  ======");
			if (wukongSun.getHP() < 0 || shualu.getHP() < 0)
				break;
			wukongSun.setUp(shualu);
			shualu.setUp(wukongSun);
			System.out.println(wukongSun);
			System.out.println(shualu);
		}
		System.out.println(wukongSun);
		System.out.println(shualu);
	}

}
