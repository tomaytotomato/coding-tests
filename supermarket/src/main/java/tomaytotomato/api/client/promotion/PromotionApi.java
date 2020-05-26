package tomaytotomato.api.client.promotion;

import java.util.List;

/**
 * API methods for Promotion domain
 */
public interface PromotionApi {

    /**
     * Fetch all promotions in the supermarket
     * @return List
     */
    List<PromotionDto> getAllPromotions();



}
