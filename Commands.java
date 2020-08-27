package com.company;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class commands extends ListenerAdapter {

    @Override
     public void onGuildMessageReceived(GuildMessageReceivedEvent event){

if(event.getMessage().getContentRaw().equalsIgnoreCase("!hi")){
event.getChannel().sendMessage("Hi!").queue();
}


        if(event.getMessage().getContentRaw().equalsIgnoreCase("!dailygif")){
            event.getChannel().sendMessage("https://media.giphy.com/media/mFqsIXucjR7GcqRb2c/giphy.gif").queue();
        }

        if(event.getMessage().getContentRaw().equalsIgnoreCase("!help")){
            event.getChannel().sendMessage("List of commands: !dailygif, !hi, !help.").queue();
        }





     }
























}











