package service.interr;

import bean.Config;
import service.interr.Process;

public interface SaveableProcess extends Process {
    public default void process(){
        processLogic();
        Config.save();
    }
}
