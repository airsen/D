package com.designpattern.strategy;

/**
 * <p>枚举策略类</p>
 * <p>该类封装了所有的策略，扩展的时候只需要在后面继续添加需要的算法，并实现统一的接口。</p>
 *
 * @author airsen
 * @since 12-12-16 下午1:02
 */
public enum Strategy {

	SOLDIER() {
		@Override
		public void attack() {
			System.out.println("士兵攻击，对方丢失5生命值");
		}

		@Override
		public void defensive() {
			System.out.println("士兵防御，损失20生命值");
		}

		@Override
		public void vitality() {
			System.out.println("士兵回血，恢复20生命值");
		}
	},
	GENERAL() {
		@Override
		public void attack() {
			System.out.println("将军攻击，对方丢失15生命值");
		}

		@Override
		public void defensive() {
			System.out.println("将军防御，损失5生命值");
		}

		@Override
		public void vitality() {
			System.out.println("将军回血，恢复5生命值");
		}
	},
	WIZARD() {
		@Override
		public void attack() {
			System.out.println("巫师攻击，丢失10生命值");
		}

		@Override
		public void defensive() {
			System.out.println("巫师防御，损失20生命值");
		}

		@Override
		public void vitality() {
			System.out.println("巫师回血，恢复30生命值");
		}
	};

	public abstract void attack();

	public abstract void defensive();

	public abstract void vitality();

}
