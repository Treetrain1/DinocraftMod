package com.dinocrew.dinocraft.registry.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class StegoraptorEntity extends PathAwareEntity {
    public StegoraptorEntity(EntityType<? extends PathAwareEntity> entityType, World world) { super(entityType, world);}
        protected void initGoals() {
            this.goalSelector.add(7, new WanderAroundFarGoal(this, 0.4D));

    }
}