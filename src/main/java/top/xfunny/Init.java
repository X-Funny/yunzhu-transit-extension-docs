package top.xfunny;

import org.mtr.mapping.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Init {
    public static final String MOD_ID = "elevatortest";
    public static final Logger LOGGER = LoggerFactory.getLogger("MLE");
    public static final Registry REGISTRY = new Registry();
    public static void init(){
        Blocks.init();
        BlockEntity.init();
        //用于输出一条日志

        REGISTRY.init();

    }

}
