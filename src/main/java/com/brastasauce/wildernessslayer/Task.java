/*
 * Copyright (c) 2023, BrastaSauce
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.brastasauce.wildernessslayer;

import com.google.common.collect.ImmutableMap;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

import javax.annotation.Nullable;
import java.util.Map;

@Getter
public enum Task
{
    ABYSSAL_DEMONS("Abyssal Demons", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3341,10162,0)}, "Slayer Cave", new String[]{"Burning Amulet: Chaos Temple"}, ""),
    ANKOU("Ankou", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3359,10079,0)}, "Slayer Cave", new String[]{"Burning Amulet: Chaos Temple"}, ""),
    AVIANSIES("Aviansies", new WorldPoint[]{new WorldPoint(3013,3736,0)}, "Wilderness God Wars Dungeon", new String[]{"Cemetery teleport","Obelisk to 27"}, ""),
    BANDITS("Bandits", new WorldPoint[]{new WorldPoint(3039,3693,0)}, "Bandit Camp", new String[]{"Burning Amulet: Bandit Camp"}, ""),
    BEARS("Bears", new WorldPoint[]{new WorldPoint(3081,3602,0)}, "Southwest of Ferox Enclave", new String[]{"Ring of Dueling: Ferox Enclave"}, "Callisto/Artio optional"),
    BLACK_DEMONS("Black Demons", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3362,10119,0)}, "Slayer Cave", new String[]{"Burning Amulet: Chaos Temple"}, ""),
    BLACK_DRAGONS("Black Dragons", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3362,10158,0)}, "Slayer Cave", new String[]{"Burning Amulet: Chaos Temple"}, "Bring super anti-fire"),
    BLACK_KNIGHTS("Black Knights", new WorldPoint[]{new WorldPoint(3311,3770,0)}, "Northeast of Slayer Cave", new String[]{"Dark Crab teleport","Burning Amulet: Chaos Temple"}, ""),
    BLOODVELD("Bloodveld", new WorldPoint[]{new WorldPoint(3013,3736,0)}, "Wilderness God Wars Dungeon", new String[]{"Cemetery teleport","Obelisk to 27"}, ""),
    CHAOS_DRUIDS("Chaos Druids", new WorldPoint[]{new WorldPoint(3093,3471,0),new WorldPoint(3115, 9928,0)}, "Edgeville Dungeon", new String[]{"Paddewwa teleport"}, "Switch to blowpipe"),
    DARK_WARRIORS("Dark Warriors", new WorldPoint[]{new WorldPoint(3029,3631,0)}, "Dark Warriors' Fortress", new String[]{"Burning Amulet: Bandit Camp"}, "Prioritise level 8's. Run laps killing upstairs. Attack downstairs while waiting for spawns."),
    DUST_DEVILS("Dust Devils", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3439,10123,0)}, "Slayer Cave", new String[]{"Burning Amulet: Chaos Temple"}, ""),
    EARTH_WARRIORS("Earth Warriors", new WorldPoint[]{new WorldPoint(3093, 3471,0),new WorldPoint(3120, 9991,0)}, "Edgeville Dungeon", new String[]{"Paddewwa Teleport"}, ""),
    ENTS("Ents", new WorldPoint[]{new WorldPoint(3207,3681,0)}, "Outside Corporeal Beast Cave", new String[]{"Games Necklace: Corporeal Beast"}, "Kill 3-4 and hop worlds"),
    FIRE_GIANTS("Fire Giants", new WorldPoint[]{new WorldPoint(3049,3925,0),new WorldPoint(3047,10342,0)}, "Deep Wilderness Dungeon", new String[]{"Ice Plateau teleport","Edgeville lever"}, ""),
    GREATER_DEMONS("Greater Demons", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3429,10149,0)}, "Slayer Cave", new String[]{"Burning Amulet: Chaos Temple"}, ""),
    GREEN_DRAGONS("Green Dragons", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3400,10124,0)}, "Slayer Cave", new String[]{"Burning Amulet: Chaos Temple"}, "Bring super anti-fire"),
    HELLHOUNDS("Hellhounds", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3443,10081,0)}, "Slayer Cave", new String[]{"Burning Amulet: Chaos Temple"}, ""),
    HILL_GIANTS("Hill Giants", new WorldPoint[]{new WorldPoint(3049,3925,0),new WorldPoint(3044,10317,0)}, "Deep Wilderness Dungeon", new String[]{"Ice Plateau teleport","Edgeville lever"}, ""),
    ICE_GIANTS("Ice Giants", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3341,10056,0)}, "Slayer Cave", new String[]{"Burning Amulet: Chaos Temple"}, ""),
    ICE_WARRIORS("Ice Warriors", new WorldPoint[]{new WorldPoint(2952,3869,0)}, "Frozen Waste Plateau", new String[]{"Ghorrock teleport","Obelisk"}, ""),
    JELLIES("Jellies", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3431,10103,0)}, "Slayer Cave", new String[]{"Burning Amulet: Chaos Temple"}, ""),
    LAVA_DRAGONS("Lava Dragons", new WorldPoint[]{new WorldPoint(3198,3829,0)}, "Lava Dragon Isle", new String[]{"Revenant Cave teleport","Annakarl teleport"}, ""),
    LESSER_DEMONS("Lesser Demons", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3336,10134,0)}, "Slayer cave", new String[]{"Burning Amulet: Chaos Temple"}, "Can bring bulwark for spec"),
    MAGIC_AXES("Magic Axes", new WorldPoint[]{new WorldPoint(3190,3960,0)}, "Magic Axe Hut", new String[]{"Edgeville lever"}, "Switch to blowpipe and bring a lockpick"),
    MAMMOTHS("Mammoths", new WorldPoint[]{new WorldPoint(3167,3594,0)}, "Southeast of Ferox Enclave", new String[]{"Ring of Dueling: Ferox Enclave"}, ""),
    MOSS_GIANTS("Moss Giants", new WorldPoint[]{new WorldPoint(3141,3817,0)}, "Outside Revenant Cave", new String[]{"Revenant Cave teleport"}, ""),
    NECHRYAEL("Nechryael", new WorldPoint[]{new WorldPoint(3263,3662,0),new WorldPoint(3334,10104,0)}, "Slayer Cave", new String[]{"Burning Amulet: Chaos Temple"}, ""),
    PIRATES("Pirates", new WorldPoint[]{new WorldPoint(3041,3954,0)}, "Pirates' Hideout", new String[]{"Ice Plateau teleport","Edgeville lever"}, "Bring a lockpick"),
    REVENANTS("Revenants", new WorldPoint[]{new WorldPoint(3127,3834,0)}, "Revenant Caves", new String[]{"Revenant Cave teleport"}, ""),
    ROGUES("Rogues", new WorldPoint[]{new WorldPoint(3286,3931,0)}, "Rogues' Castle", new String[]{"Obelisk to 50"}, ""),
    SCORPIONS("Scorpions", new WorldPoint[]{new WorldPoint(3232,3944,0)}, "Scorpia Cave", new String[]{"Edgeville lever","Obelisk to 50"}, "Scorpia optional. Can bring bulwark for spec."),
    SKELETONS("Skeletons", new WorldPoint[]{new WorldPoint(3017,3591,0)}, "Northwest of Edgeville", new String[]{"Amulet of Glory: Edgeville"}, "Vetion/Calvarion optional"),
    SPIDERS("Spiders", new WorldPoint[]{new WorldPoint(3167,3884,0)}, "Northeast of Revenant Caves", new String[]{"Revenant Cave teleport"}, "Venenatis/Spindel optional. Can bring bulwark for spec."),
    SPIRITUAL_CREATURES("Spiritual Creatures", new WorldPoint[]{new WorldPoint(3013,3736,0)}, "Wilderness God Wars Dungeon", new String[]{"Cemetery teleport","Obelisk to 27"}, ""),
    ZOMBIES("Zombies", new WorldPoint[]{new WorldPoint(3161,3675,0)}, "Graveyard of Shadows", new String[]{"Carrallangar teleport"}, "");

    private static final Map<String, Task> tasks;

    private final String name;
    private final WorldPoint[] worldPoints; // Both surface and underground
    private final String location;
    private final String[] teleports;
    private final String info;

    static
    {
        ImmutableMap.Builder<String, Task> builder = new ImmutableMap.Builder<>();

        for (Task task : values())
        {
            builder.put(task.getName().toLowerCase(), task);
        }

        tasks = builder.build();
    }

    Task(String name, WorldPoint[] worldPoints, String location, String[] teleports, String info)
    {
        this.name = name;
        this.worldPoints = worldPoints;
        this.location = location;
        this.teleports = teleports;
        this.info = info;
    }

    @Nullable
    static Task getTask(String taskName)
    {
        return tasks.get(taskName.toLowerCase());
    }
}
