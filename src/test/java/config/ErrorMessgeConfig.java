package config;

import org.aeonbits.owner.Config;

@Config.Sources("file:src/test/resources/ErrorMessages.config")
public interface ErrorMessgeConfig extends Config {

    @Key("messagesNotEquals")
    public String messagesNotEquals();
}
