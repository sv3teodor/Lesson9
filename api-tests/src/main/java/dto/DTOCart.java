package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DTOCart {
    private List<DTOProducts> cart;
    @JsonProperty("total_discount")
    private float totalDiscount;
    @JsonProperty("total_price")
    private float totalPrice;
}
