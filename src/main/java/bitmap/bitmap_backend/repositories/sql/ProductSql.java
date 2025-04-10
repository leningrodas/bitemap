package bitmap.bitmap_backend.repositories.sql;

public class ProductSql {

    public static final String INSERT_PRODUCT =
            "insert into product(" +
                    "name, " +
                    "description," +
                    "price " +
                    ") values(" +
                    ":name," +
                    ":description," +
                    ":price" +
                    ")";

    public static final String SELECT_PRODUCT =
            "Select "
                    + " name" +
                    ", description" +
                    "FROM PRODUCT " +
                    "WHERE name = :name";

    public static final String SELECT_ALL_PRODUCT =
            "SELECT id, name, description, price, created_at, updated_at FROM product";
}
