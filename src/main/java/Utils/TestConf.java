package Utils;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadPolicy;
import static org.aeonbits.owner.Config.Sources;

@Sources({"file:src/main/resources/resource.properties"})
public interface TestConf extends Config {
    @Key("baseUrl")
    String baseURL();
}
