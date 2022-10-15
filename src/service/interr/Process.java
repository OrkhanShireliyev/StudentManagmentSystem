package service.interr;

public interface Process {
    public abstract void processLogic();
    public default void process(){
        processLogic();
    }
}
