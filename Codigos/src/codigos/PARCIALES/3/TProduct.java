
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jechague
 */
public class TProduct implements Comparable {

    private String uniq_id;
    private Date timestampt;
    private String url;

    public String getUniq_id() {
        return uniq_id;
    }

    public String getName() {
        return name;
    }
    private String name;
    private String categoryTree;
    private String pId;
    private Double retailPrice;
    private Double salePrice;
    private String[] imageUrl;
    private Boolean isFKAvailable;
    private String description;
    private String rating;
    private String overallRating;
    private String brand;
    private String specifications;
    
    private final DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
    
    TProduct(String fileLine) throws Exception {
        String[] stringParts = fileLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        
        if (stringParts.length == 15) {
            try {
                this.uniq_id = stringParts[0];
                this.timestampt = dateFormatter.parse(stringParts[1]);
                this.url = stringParts[2];
                this.name = stringParts[3];
                this.categoryTree = stringParts[4];
                this.pId = stringParts[5];
                this.retailPrice = Double.parseDouble(stringParts[6].trim());
                this.salePrice = Double.parseDouble(stringParts[7].trim());
                this.imageUrl = stringParts[8].split(",");
                this.isFKAvailable = Boolean.parseBoolean(stringParts[9].trim());
                this.description = stringParts[10];
                this.rating = stringParts[11];
                this.overallRating = stringParts[12];
                this.brand = stringParts[13];
                this.specifications = stringParts[14];
            }  catch (NumberFormatException | ParseException e) {}
        }
    }
    
    public boolean isValid() {
        return this.uniq_id != null && this.name != null;
    }
    
    @Override
    public int compareTo(Object o) {
        if (o.getClass().equals(TProduct.class)) {
            return this.uniq_id.compareTo(((TProduct)o).uniq_id);
        } else {
            return -1;
        }
    }
}
