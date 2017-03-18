package bat26.resource;

import bat26.api.client.SupermarketClientApi;
import bat26.api.client.product.ProductDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This is the controller for the Supermarket API which is consumed as a resource by Dropwizard
 *
 */
@Path("/api/supermarket/client/v1")
@Produces(MediaType.APPLICATION_JSON)
@Api(tags = "client", produces = MediaType.APPLICATION_JSON)
public class SupermarketClientApiResource implements SupermarketClientApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(SupermarketClientApiResource.class);

    private final SupermarketClientApi delegate;

    /**
     * Constructor.
     *
     * @param delegate          Service delegate (required)
     */
    @Inject
    public SupermarketClientApiResource(final SupermarketClientApi delegate) {
        this.delegate = checkNotNull(delegate, "delegate required");
    }

    @GET
    @Path("/product/getAllProducts")
    @ApiOperation("Create a new sample pack order")
    @Override
    public List<ProductDto> getAllProducts() {
        return null;
    }

    @GET
    @Path("product/getProductByCode")
    @Override
    public ProductDto getProductByCode() {
        return null;
    }

    @Override
    public ProductDto updateProductByCode() {
        return null;
    }
}
