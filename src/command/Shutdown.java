package command;

import Bot.main;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Shutdown extends ListenerAdapter{
    public void onMessageReceived(MessageReceivedEvent event){
        String msg = event.getMessage().getContent();
        
        if(msg.equals("Shutdown")){
        	event.getChannel().sendMessage("Hi").queue();
        }
    }
}
