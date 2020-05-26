package tomaytotomato.service;

import tomaytotomato.api.client.SupermarketClientApi;
import tomaytotomato.api.client.product.ProductDto;

import java.util.List;

/**
 * Service implementation of SupermarketClientApi
 */
public class SupermarketClientService implements SupermarketClientApi {

    @Override
    public List<ProductDto> getAllProducts() {
        return null;
    }

    @Override
    public ProductDto getProductByCode() {
        return null;
    }

    @Override
    public ProductDto updateProductByCode() {
        return null;
    }
}
