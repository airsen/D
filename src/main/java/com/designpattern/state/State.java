package com.designpattern.state;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>枚举状态类，比起以往的抽象类接口类，让子类继承并实现更加优雅，解决了类膨胀的问题。其次，枚举更适用于开发工作。</p>
 * <p>该版本中，节点的转移条件只取决于末次输入，有时间写一个根据上下文条件和输入条件转移的版本。</p>
 *
 * @author airsen
 * @since 12-12-16 下午12:58
 */
enum State {

	HEALTH {
		@Override
		public void eat() {
			context.setState(NORMAL);
		}

		@Override
		public void play() {
			context.setState(NORMAL);
		}
	},
	FULL {
		@Override
		public void eat() {
			context.setState(SICK);
		}

		@Override
		public void play() {
			context.setState(NORMAL);
		}

		@Override
		public void takePills() {
			context.setState(NORMAL);
		}
	},
	HUNGRY {
		@Override
		public void eat() {
			context.setState(NORMAL);
		}

		@Override
		public void play() {
			context.setState(SICK);
		}

		@Override
		public void takePills() {
			context.setState(NORMAL);
		}
	},
	SICK {
		@Override
		public void takePills() {
			context.setState(NORMAL);
		}
	},
	NORMAL {
		@Override
		public void eat() {
			context.setState(FULL);
		}

		@Override
		public void play() {
			context.setState(HUNGRY);
		}

		@Override
		public void takePills() {
			context.setState(HEALTH);
		}
	};

	@Setter
	@Getter
	protected Context context;

	// 用protected修饰，并且不定义成抽象方法，子类可以选择性地继承。
	// 因为实际上不是所有的状态都有各种转移条件，每个状态只实现自己关系的转移条件就行，
	// 其他的交给父亲方法来执行一个空操作，表示没有这个操作，执行完还是在这个状态。
	protected void eat() {
	}

	protected void play() {
	}

	protected void takePills() {
	}
}