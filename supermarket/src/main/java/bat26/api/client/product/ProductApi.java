package bat26.api.client.product;

import java.util.List;

/**
 * API methods specific to Product domain in Supermarket
 */
public interface ProductApi {

    /**
     * Retrieves a list of all Products
     * @return list of products
     */
    List<ProductDto> getAllProducts();

    /**
     * Retrieves one product by its code
     * @return ProductDto
     */
    ProductDto getProductByCode();

    /**
     * Updates a product by its code
     * @return ProductDto
     */
    ProductDto updateProductByCode();

}
