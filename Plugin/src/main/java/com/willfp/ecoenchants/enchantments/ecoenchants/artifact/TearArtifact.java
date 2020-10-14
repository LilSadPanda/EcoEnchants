package com.willfp.ecoenchants.enchantments.ecoenchants.artifact;

import com.willfp.ecoenchants.enchantments.itemtypes.Artifact;
import com.willfp.ecoenchants.util.optional.Prerequisite;
import org.bukkit.Particle;

public final class TearArtifact extends Artifact {
    public TearArtifact() {
        super(
                "tear_artifact",
                5.0,
                Particle.DRIPPING_OBSIDIAN_TEAR,
                new Prerequisite[]{Prerequisite.MinVer1_16}
        );
    }
}