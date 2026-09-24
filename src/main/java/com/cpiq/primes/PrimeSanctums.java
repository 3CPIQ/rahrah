package com.cpiq.primes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.ServerCommandSource;
import static net.minecraft.server.command.CommandManager.literal;
import com.mojang.brigadier.context.CommandContext;

public class PrimeSanctums implements ModInitializer {
    @Override public void onInitialize() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) ->
            dispatcher.register(literal("primes").requires(source -> source.hasPermissionLevel(2))
                .then(literal("p1")
                    .then(literal("start").executes(ctx -> run(ctx, "p1:start")))
                    .then(literal("reset").executes(ctx -> run(ctx, "p1:reset")))
                    .then(literal("status").executes(ctx -> run(ctx, "p1:status")))
                    .then(literal("music_stop").executes(ctx -> run(ctx, "p1:music_stop"))))
                .then(literal("p2")
                    .then(literal("start").executes(ctx -> run(ctx, "p2:start")))
                    .then(literal("reset").executes(ctx -> run(ctx, "p2:reset")))
                    .then(literal("music_stop").executes(ctx -> run(ctx, "p2:music_stop"))))));
    }

    private static int run(CommandContext<ServerCommandSource> context, String function) {
        return context.getSource().getServer().getCommandManager()
            .executeWithPrefix(context.getSource(), "function " + function);
    }
}
