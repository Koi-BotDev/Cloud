package com.company;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class filter extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String[] LIST_OF_BAD_WORDS = {"anal", "anus", "arse", "ass", "motherfucker", "balls", "bastard", "bitch", "blowjob", "blow job", "buttplug","cock","coon","cunt","dildo","fag","dyke","fuck","fucking","nigger","Goddamn","jizz","nigga","pussy","shit","whore"};
        String[] message = e.getMessage().getContentRaw().split(" ");
        for(int i = 0;i < message.length;i++){
            boolean badWord = false;
            //Check each message for each bad word
            for(int b = 0; b < LIST_OF_BAD_WORDS.length;b++){
                if (message[i].equalsIgnoreCase(LIST_OF_BAD_WORDS[b])){
                    e.getMessage().delete().queue();
                    badWord = true;

                    e.getChannel().sendMessage("Do not swear " + e.getMember().getUser().getName()).queue();
                }
            }
        }

    }
}

