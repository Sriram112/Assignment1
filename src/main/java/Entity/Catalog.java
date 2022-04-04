package Entity;

import javax.persistence.*;

@Entity
@Table(name = "Catalog")
public class Catalog {
        @Id
        @GeneratedValue
        private int catalog_Id;
        private String catalog_Name;

    public int getCatalog_Id() {
        return catalog_Id;
    }

    public void setCatalog_Id(int catalog_Id) {
        this.catalog_Id = catalog_Id;
    }

    public String getCatalog_Name() {
        return catalog_Name;
    }

    public void setCatalog_Name(String catalog_Name) {
        this.catalog_Name = catalog_Name;
    }

    @ManyToOne
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}