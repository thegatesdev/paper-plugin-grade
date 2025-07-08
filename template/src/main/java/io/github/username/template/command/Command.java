package io.github.username.template.command;

import com.mojang.brigadier.builder.*;
import com.mojang.brigadier.tree.*;
import io.papermc.paper.command.brigadier.*;

public interface Command {

    static LiteralArgumentBuilder<CommandSourceStack> root() {
        return Commands.literal("template");
    }

    static LiteralCommandNode<CommandSourceStack> create() {
        return root().build();
    }
}
