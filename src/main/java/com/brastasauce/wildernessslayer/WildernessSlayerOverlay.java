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

import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;

import javax.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class WildernessSlayerOverlay extends OverlayPanel
{
    private final WildernessSlayerPlugin plugin;
    private final WildernessSlayerConfig config;

    @Inject
    public WildernessSlayerOverlay(WildernessSlayerPlugin plugin, WildernessSlayerConfig config)
    {
        this.plugin = plugin;
        this.config = config;
        setPosition(OverlayPosition.BOTTOM_LEFT);
        setPreferredSize(new Dimension(25, 350));
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        if (!config.displayInfo() || plugin.getTask() == null)
        {
            return null;
        }

        panelComponent.getChildren().add(LineComponent.builder().left(plugin.getTask().getLocation()).build());

        for (String teleport : plugin.getTask().getTeleports())
        {
            panelComponent.getChildren().add(LineComponent.builder().left("- " + teleport).leftColor(Color.LIGHT_GRAY).build());
        }

        if (!plugin.getTask().getInfo().isEmpty())
        {
            panelComponent.getChildren().add(LineComponent.builder().left(plugin.getTask().getInfo()).leftColor(Color.LIGHT_GRAY).build());
        }

        return super.render(graphics);
    }
}
