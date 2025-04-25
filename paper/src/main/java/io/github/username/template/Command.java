package io.github.username.template;

import com.mojang.brigadier.tree.*;
import io.papermc.paper.command.brigadier.*;

@SuppressWarnings("UnstableApiUsage")
public interface Command {

    static LiteralCommandNode<CommandSourceStack> create() {
        return Commands.literal("template").build();
    }
}
