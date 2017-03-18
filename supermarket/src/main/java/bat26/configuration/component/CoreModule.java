package bat26.configuration.component;

import bat26.SupermarketConfiguration;
import bat26.api.client.SupermarketClientApi;
import bat26.service.SupermarketClientService;
import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;
import javax.inject.Singleton;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Core dependencies.
 */
@Module
public class CoreModule {

    private final SupermarketConfiguration supermarketConfiguration;

    /**
     * Constructor.
     *
     * @param supermarketConfiguration Service configurationa
     */
    public CoreModule(final SupermarketConfiguration supermarketConfiguration) {
        this.supermarketConfiguration =
                checkNotNull(supermarketConfiguration, "supermarketConfiguration required");
    }

    /**
     * Client service: processes requests
     *
     * @return SupermarketClientService service
     */
    @Provides
    @Singleton
    @Inject
    public SupermarketClientApi provideClientService() {
        return new SupermarketClientService();
    }
}
