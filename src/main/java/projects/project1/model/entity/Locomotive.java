package projects.project1.model.entity;

import projects.project1.model.entity.enums.Engine;
import projects.project1.model.entity.interfaces.RailConst;
import projects.project1.model.entity.interfaces.Traction;

public class Locomotive extends RailTransport implements Traction{
    private int speed;
    private Engine engine;

    private Locomotive() { }

    public static BuilderSub newLocomotive() {
        return new Locomotive().new BuilderSub();
    }

    public class BuilderSub extends RailTransport.BuilderBase<BuilderSub> {

        public BuilderSub speed(int speed) {
            Locomotive.this.speed = speed;
            return this;
        }

        public BuilderSub engine(Engine engine) {
            Locomotive.this.engine = engine;
            return this;
        }

        @Override
        BuilderSub This() {
            return this;
        }

        @Override
        public Locomotive build() {
            return Locomotive.this;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String getIdentifierName() {
        return getName() + "-" + engine.toString();
    }

    @Override
    public int capacity() {
        return RailConst.LOCOMOTIVE_LOAD_CAPACITY;
    }

    // in kN
    @Override
    public int tractionForce() {
        return engine.getPower() * 3600 / speed;
    }

    @Override
    public String toString() {
        return "Locomotive " + getIdentifierName();
    }
}
