package bat26.api.client.promotion;

import bat26.api.client.product.ProductDto;
import io.swagger.annotations.ApiModel;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Defines rules and attributes for promotions on Supermarket products
 */
@ApiModel(description = "Promotion")
public class PromotionDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String name;
    private BigDecimal discount;
    private DateTime startDate;
    private DateTime endDate;

    /**
     * Minimum quantity of products for promotion to be applied
     */
    private int minimumQuantity;


    private List<ProductDto> products;

    public PromotionDto(final Builder builder) {
        code = builder.code;
        name = builder.name;
        discount = builder.discount;
        startDate = builder.startDate;
        endDate = builder.endDate;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public List<ProductDto> getProducts() {
        return products;
    }


    public class Builder {

        private String code;
        private String name;
        private BigDecimal discount;
        private DateTime startDate;
        private DateTime endDate;
        private int minimumQuantity;

        public Builder code(final String code) {
            this.code = code;
            return this;
        }

        public Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Builder discount(final BigDecimal discount) {
            this.discount = discount;
            return this;
        }

        public Builder startDate(final DateTime startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(final DateTime endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder minimumQuantity(final int minimumQuantity) {
            this.minimumQuantity = minimumQuantity;
            return this;
        }

        public PromotionDto build() {
            return new PromotionDto(this);
        }

    }
}
