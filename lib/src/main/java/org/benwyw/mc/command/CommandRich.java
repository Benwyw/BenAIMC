package org.benwyw.mc.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandRich implements CommandExecutor{
	
	// This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	if (sender instanceof Player) {
            Player player = (Player) sender;
            
         // Create a new ItemStack (type: diamond)
            ItemStack diamond = new ItemStack(Material.DIAMOND, 64*9);

            // Create a new ItemStack (type: brick)
            //ItemStack bricks = new ItemStack(Material.BRICK);

            // Set the amount of the ItemStack
            //bricks.setAmount(20);

            // Give the player our items (comma-seperated list of all ItemStack)
            //player.getInventory().addItem(bricks, diamond);
            player.getInventory().addItem(diamond);
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}
