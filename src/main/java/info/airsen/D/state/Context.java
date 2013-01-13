package info.airsen.D.state;

import lombok.Getter;

/**
 * <p>状态模式中的上下文环境类，客户端操作的就是该上下文环境类。</p>
 * <p>它隔离了调用者和状态间的关联，状态类不包含当前的情况，它们只知道遇见这种情况应该如何解决。
 * 而保持着这些信息的就是该类。</p>
 *
 * @author airsen
 * @since 12-12-16 下午12:59
 */

public class Context {

	@Getter
	private State state;

	public Context(State state) {
		this.state = state;
		state.setContext(this);
	}

	public void setState(State state) {
		this.state = state;
		this.state.setContext(this);
	}

	// 事件（状态转移条件）：吃了个饭
	public State eat() {
		System.out.println("吃了个饭:" + state);
		return state.eat();
	}

	// 事件（状态转移条件）：玩了一会
	public State play() {
		System.out.println("玩了一会:" + state);
		return state.play();
	}

	// 事件（状态转移条件）：吃万能恢复药
	public State takePills() {
		System.out.println("吃万能恢复药:" + state);
		return state.takePills();
	}

}
