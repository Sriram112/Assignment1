package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

    @Entity
    @Table(name = "Category")
    public class Category {

        @Id
        @GeneratedValue

        private int category_Id;
        private String category_Name;
        private String status;

        public int getCategory_Id() {
            return category_Id;
        }

        public void setCategory_Id(int category_Id) {
            this.category_Id = category_Id;
        }

        public String getCategory_Name() {
            return category_Name;
        }

        public void setCategory_Name(String category_Name) {
            this.category_Name = category_Name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @OneToMany(cascade = CascadeType.PERSIST)
        private List<Catalog> catalogList = new ArrayList<>();

        public List<Catalog> getCatalogList() {
            return catalogList;
        }

        public void setCatalogList(List<Catalog> catalogList) {
            this.catalogList = catalogList;
        }
    }