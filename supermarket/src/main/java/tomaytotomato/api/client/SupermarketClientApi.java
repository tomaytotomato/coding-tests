package tomaytotomato.api.client;

import tomaytotomato.api.client.product.ProductApi;
import io.swagger.annotations.Api;

/**
 * Client API for running Supermarket API
 * <p>
 * These operations will be publicly accessible.
 */
@Api(description = "supermarket client api")
public interface SupermarketClientApi extends ProductApi {
}
