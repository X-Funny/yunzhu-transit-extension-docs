package top.xfunny;

import org.mtr.mapping.holder.RenderLayer;
import org.mtr.mapping.registry.RegistryClient;
import org.mtr.mod.BlockEntityTypes;
import org.mtr.mod.render.RenderLiftButtons;
import org.mtr.mod.render.RenderLiftPanel;

public class InitClient {
    public static final RegistryClient REGISTRY_CLIENT = new RegistryClient(Init.REGISTRY);
    public static void init(){
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.LIFTSCREEN);
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntity.LIFTSCREEN, dispatcher -> new RenderLiftPanel<>(dispatcher, false, false));
        REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntity.LIFT_BUTTONS_2, RenderLiftButtons::new);


        REGISTRY_CLIENT.init();
    }

}
