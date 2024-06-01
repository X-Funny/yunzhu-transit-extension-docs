package top.xfunny;

import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mapping.registry.BlockRegistryObject;
import org.mtr.mod.CreativeModeTabs;
import org.mtr.mod.block.BlockLiftPanelEven1;
import org.mtr.mod.block.BlockTicketMachine;


public class Blocks {
    static {
        LIFTSCREEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "lift_screen"), () -> new Block(new BlockLiftPanelEven1()));
        TICKET_MACHINE1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "ticket_machine1"), () -> new Block(new BlockTicketMachine(BlockHelper.createBlockSettings(true, blockState -> 5))), CreativeModeTabs.RAILWAY_FACILITIES);

    }
    public static final BlockRegistryObject LIFTSCREEN;
    public static final BlockRegistryObject TICKET_MACHINE1;
    public static void init(){
        Init.LOGGER.info("注册方块中");
    }
}

