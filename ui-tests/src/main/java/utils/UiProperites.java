package utils;

import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:src/test/resources/config.properties"
})

public interface UiProperites extends Config {
    @Config.Key("BASE_URL")
    String baseUrl();
}
