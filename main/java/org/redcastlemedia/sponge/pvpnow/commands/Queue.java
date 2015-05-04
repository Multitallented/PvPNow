package org.redcastlemedia.sponge.pvpnow.commands;

import com.google.common.base.Optional;
import java.util.List;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.Text.Translatable;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.util.command.CommandCallable;
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandResult;
import org.spongepowered.api.util.command.CommandSource;

/**
 *
 * @author Multi
 */
public class Queue implements CommandCallable {
    

    @Override
    public Optional<CommandResult> process(CommandSource cs, String string) throws CommandException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> getSuggestions(CommandSource cs, String string) throws CommandException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean testPermission(CommandSource cs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Text> getShortDescription(CommandSource cs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Text> getHelp(CommandSource cs) {
        return Optional.of(Texts.of());
    }

    @Override
    public Text getUsage(CommandSource cs) {
        return Texts.of("/queue");
    }
    
}
