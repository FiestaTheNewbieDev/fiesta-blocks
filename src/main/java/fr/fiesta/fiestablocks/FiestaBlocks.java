package fr.fiesta.fiestablocks;

import fr.fiesta.fiestablocks.block.ModBlocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FiestaBlocks.MODID)
public class FiestaBlocks {
    public static final String MODID = "fiestablocks";

    public FiestaBlocks(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(eventBus);
        ModBlocks.BLOCKS.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);
    }

    private void setup(FMLCommonSetupEvent event){
    }

    private void clientSetup(FMLClientSetupEvent event){
    }

}
