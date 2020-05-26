package tomaytotomato;

import tomaytotomato.configuration.component.CoreModule;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.paradoxical.dropwizard.swagger.AppSwaggerConfiguration;
import io.paradoxical.dropwizard.swagger.bundles.SwaggerUIBundle;
import io.swagger.models.Info;

public class SupermarketApplication extends Application<SupermarketConfiguration> {

    public static void main(final String[] args) throws Exception {
        new SupermarketApplication().run(args);
    }

    @Override
    public String getName() {
        return "Supermarket";
    }

    /**
     * Tasks that are done during Dropwizards initalisation
     * @param bootstrap
     */
    @Override
    public void initialize(final Bootstrap<SupermarketConfiguration> bootstrap) {
        bootstrap.addBundle(createSwaggerUIBundle());
    }

    @Override
    public void run(final SupermarketConfiguration configuration,
                    final Environment environment) {


        // Dependency Injection component
        final CoreModule coreModule = new CoreModule(configuration);

        environment.jersey().register(coreModule.provideClientService());

    }

    private SwaggerUIBundle createSwaggerUIBundle() {
        return new SwaggerUIBundle(environment -> new AppSwaggerConfiguration(environment) {
            {
                setBasePath("/");
                setResourcePackage(SupermarketApplication.class.getName());

                final Info info = new Info();
                info.setTitle("Supermarket Service");
                info.setDescription("Endpoints for supporting Supermarket users");
                setInfo(info);
            }
        });
    }


}
