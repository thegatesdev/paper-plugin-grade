package io.github.username.template;

import io.github.username.template.command.*;
import io.papermc.paper.plugin.bootstrap.*;
import io.papermc.paper.plugin.lifecycle.event.*;
import io.papermc.paper.plugin.lifecycle.event.handler.configuration.*;
import io.papermc.paper.plugin.lifecycle.event.types.*;
import org.bukkit.plugin.java.*;
import org.jetbrains.annotations.*;

import java.util.concurrent.*;

@SuppressWarnings({"UnstableApiUsage", "unused"})
public final class Bootstrap implements PluginBootstrap {

    @Override
    public void bootstrap(@NotNull BootstrapContext context) {
        var lifecycleManager = context.getLifecycleManager();
        lifecycleManager.registerEventHandler(commandsHandler());
    }

    @Override
    public @NotNull JavaPlugin createPlugin(@NotNull PluginProviderContext context) {
        return new Main(context.getLogger());
    }


    private static LifecycleEventHandlerConfiguration<@NotNull LifecycleEventOwner> commandsHandler() {
        var command = CompletableFuture.supplyAsync(Command::create);
        return LifecycleEvents.COMMANDS.newHandler(event -> event.registrar().register(command.join()));
    }
}
