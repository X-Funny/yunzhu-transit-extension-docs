package top.xfunny;

import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.BlockRegistryObject;
import org.mtr.mod.CreativeModeTabs;
import org.mtr.mod.screen.TicketMachineScreen;
import top.xfunny.blocks.LiftScreen;

public class Blocks {
    static {
        LIFTSCREEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "lift_screen"), () -> new Block(new LiftScreen()));

    }
    public static final BlockRegistryObject LIFTSCREEN;
    public static void init(){
        Init.LOGGER.info("注册方块中");
    }
}
