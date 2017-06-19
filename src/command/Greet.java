package command;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Greet extends ListenerAdapter{
    public void onMessageReceived(MessageReceivedEvent event){
        String msg = event.getMessage().getContent();
        
        if(msg.equals("Greet")){
        	event.getChannel().sendMessage("Hi"+event.getAuthor().getName());
        }
    }
}

