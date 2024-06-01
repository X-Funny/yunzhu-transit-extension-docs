package top.xfunny;


import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.BlockEntityTypeRegistryObject;
import top.xfunny.Blocks;
import org.mtr.mod.block.BlockLiftPanelEven1;
import top.xfunny.blocks.LiftScreen;
@SuppressWarnings("unchecked")
public class BlockEntity {
    static {
        LIFTSCREEN = Init.REGISTRY.registerBlockEntityType(new Identifier(Init.MOD_ID, "lift_screen"), LiftScreen.BlockEntity::new, Blocks.LIFTSCREEN::get);

    }
    public static final BlockEntityTypeRegistryObject<LiftScreen.BlockEntity> LIFTSCREEN;
    public static void init(){
        Init.LOGGER.info("注册方块实体中");
    }




}
