package top.xfunny.blocks;


import org.jetbrains.annotations.NotNull;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.CompoundTag;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.BlockLiftPanelBase;

import java.util.List;

public class LiftScreen extends BlockLiftPanelBase {

    public LiftScreen() {
        super(false, false);
        System.out.println("LiftScreen已创建");
    }


    @Override
    public @NotNull BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockEntity(blockPos, blockState);
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        properties.add(FACING);
        properties.add(SIDE);
    }

    public static class BlockEntity extends BlockEntityBase {

        public BlockEntity(BlockPos pos, BlockState state) {
            super(top.xfunny.BlockEntity.LIFTSCREEN.get(), pos, state, false);
        }


    }
}
