package Bot;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.security.auth.login.LoginException;

import org.json.JSONException;
import org.json.JSONObject;

import command.*;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class main {
	public static void main(String[] args) {
		try{
            String config = new String(Files.readAllBytes(Paths.get("config\\bot.json")));
            JSONObject configJson = new JSONObject(config);
            String botToken = configJson.getString("botToken");
            String game = configJson.getString("game");
            String clientID = configJson.getString("clientID");
            JDA api = new JDABuilder(AccountType.BOT)
            		.removeEventListener(new Help())
                    .setToken(botToken)
                    .addEventListener(new Help())
                    .addEventListener(new Shutdown())
                    
                    .setBulkDeleteSplittingEnabled(false)
                    .buildBlocking();
            
            
    }   catch (IOException ex) {
    
    } catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (LoginException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RateLimitedException e) {
		System.out.println("อิอิ");
	}
	}

}
