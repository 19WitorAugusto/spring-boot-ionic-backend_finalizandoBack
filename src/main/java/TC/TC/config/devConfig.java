package TC.TC.config;

import TC.TC.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;


@Configuration
@Profile("dev")
public class devConfig {
    @Autowired
    private DBService dbService;
    @Bean
    public boolean instatiateDatabase() throws ParseException {
        dbService.instatiateTestDatabase();
        return true;
    }
}
