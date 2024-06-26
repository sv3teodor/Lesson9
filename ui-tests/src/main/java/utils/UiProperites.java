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

    @Config.Key("SELENIDE_SERVER")
    String selenideServer();

    @Config.Key("BROWSER")
    String browser();

    @Config.Key("BROWSER_VERSION")
    String browserVersion();

}


