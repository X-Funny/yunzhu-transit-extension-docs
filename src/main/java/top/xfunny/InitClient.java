package top.xfunny;

import org.mtr.mapping.holder.RenderLayer;
import org.mtr.mapping.registry.RegistryClient;

public class InitClient {
    public static final RegistryClient REGISTRY_CLIENT = new RegistryClient(Init.REGISTRY);
    public static void init(){
        REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(),Blocks.LIFTSCREEN);

        //REGISTRY_CLIENT.registerBlockEntityRenderer(BlockEntity.LIFTSCREEN, dispatcher -> new LiftScreenRender<>(dispatcher, false, false));

    }
}
