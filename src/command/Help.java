package command;

import java.awt.Event;

import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Help extends ListenerAdapter{
    public void onMessageReceived(MessageReceivedEvent event){
        String msg = event.getMessage().getContent();
        if(msg.equalsIgnoreCase("Hi")){
        	if(event.isFromType(ChannelType.PRIVATE)){
	        	event.getChannel().sendMessage("Hi").queue();
	        	System.out.println(event.getMessageId());
        	}
        	else{
        		event.getChannel().sendMessage("Hello").queue();
	        	System.out.println(event.getMessageId());
        	}
        	
        }
    }
}
