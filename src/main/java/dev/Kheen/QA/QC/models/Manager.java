package dev.Kheen.QA.QC.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "ProductReviews")
@Data  //Lombok depandecy
@AllArgsConstructor
@NoArgsConstructor

public class Manager {
    @Id
    private String id;
    private String reviewId;
    private String productId;
    @Field("checkedReview")
    private boolean checkedReview;
    private String email;
    @Field("sentMail")
    private boolean sentMail;

    public void checkReview(String string){
        this.checkedReview = true;
    }
    public void sentMail(String string){
        this.sentMail = true;
    }
}

