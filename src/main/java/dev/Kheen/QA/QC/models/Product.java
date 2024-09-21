package dev.Kheen.QA.QC.models;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "ProdustsDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String _id;
    private String productId;
    private String productName;
    private String description;
    private int price;
    private int stock;
    @Field("comments")
    private List<String> comments;
}
