package github.PixelRupi.WDaLUR.entity;

import github.PixelRupi.WDaLUR.init.EntityInit;
import github.PixelRupi.WDaLUR.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.ServerLevelAccessor;
import org.jetbrains.annotations.Nullable;

public class Juri extends Animal {

    public Juri(EntityType<Juri> type, Level level){
        super(type, level);
    }

    public Juri(Level level, double x, double y, double z){
        this(EntityInit.JURI.get(), level);
        setPos(x, y ,z);
    }

    public Juri(Level level, BlockPos position){
        this(level, position.getX(), position.getY(), position.getZ());
    }

    @Nullable
    @Override

    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return new Juri(level, this.blockPosition());
    }

    @Override
    protected void registerGoals(){
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(9, new TemptGoal(this, 1.0D, Ingredient.of(ItemInit.EXAMPLE_BLOCK_ITEM.get()), false));
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Pig.createAttributes();
    }

    public static boolean canSpawn(EntityType<Juri> entityType, ServerLevelAccessor level, MobSpawnType spawnType, BlockPos position, RandomSource random){
        return Animal.checkAnimalSpawnRules(entityType, level, spawnType, position, random) && level.getLevelData().isRaining();
        // Jeżeli na prezentacji będzie problem ze znalezieniem na dziko moba trzeba usunąć warunek spawnu na deszcz
    }
}
