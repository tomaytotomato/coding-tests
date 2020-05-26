package tomaytotomato.api.client.product;

import io.swagger.annotations.ApiModel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Defines a Product in the Supermarket
 */
@ApiModel(description = "Country")
public class ProductDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String name;
    private BigDecimal price;
    private Type type;

    /**
     * @param builder enforces the creation of new objects in this class to ensure immutability
     */
    public ProductDto(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.price = builder.price;
        this.type = builder.type;
    }


    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("code", code)
                .append("name", name)
                .append("price", price)
                .append("type", type)
                .toString();
    }

    /**
     * Builder.
     */
    public static class Builder {

        private String code;
        private String name;
        private BigDecimal price;
        private Type type;

        public Builder code(final String code) {
            this.code = code;
            return this;
        }

        public Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Builder price(final BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder type(final Type type) {
            this.type = type;
            return this;
        }

        public ProductDto build() {
            return new ProductDto(this);
        }
    }

    private enum Type {
        DAIRY,
        FRUIT,
        VEG,
        MEAT,
        DRYGOOD,
        BAKERY,
        DRINK
    }
}
