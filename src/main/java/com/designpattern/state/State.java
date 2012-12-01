package com.designpattern.state;

import lombok.Getter;
import lombok.Setter;

/**
 * Project: D
 * User: airsen
 * Date: 12-11-30
 * Time: 上午7:54<br/>
 * 枚举状态类，比起以往的抽象类接口类，让子类继承并实现更加优雅，解决了类膨胀的问题。<br/>
 * 其次，枚举更适用于开发工作。<br/>
 * 该版本中，节点的转移条件只取决于末次输入，有时间写一个根据上下文条件和输入条件转移的版本。<br/>
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

        @Override
        public void takePills() {
            context.setState(HEALTH);
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
        public void eat() {
            context.setState(SICK);
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

    public abstract void eat();

    public abstract void play();

    public abstract void takePills();

}
