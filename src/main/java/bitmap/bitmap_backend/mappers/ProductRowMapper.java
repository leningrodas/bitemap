package bitmap.bitmap_backend.mappers;

import bitmap.bitmap_backend.dto.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
//    @Override
//    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//        var dto = new Product();
//        ResultSetMetaData rsmd = rs.getMetaData();
//        int columnCount = rsmd.getColumnCount();
//        for(int i = 1; i <= columnCount; i++) {
//            switch (rsmd.getColumnName(i).toUpperCase()) {
//                case "name":
//                    dto.setName(rs.getString("name"));
//                    break;
//                case "description":
//                    dto.setDescription(rs.getString("description"));
//                    break;
//                default:
//                    break;
//            }
//        }
//
//        return dto;
//    }

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product dto = new Product();
        dto.setId(rs.getLong("id"));
        dto.setName(rs.getString("name"));
        dto.setDescription(rs.getString("description"));
        dto.setPrice(rs.getDouble("price"));
        dto.setCreatedAt(rs.getObject("created_at", java.time.OffsetDateTime.class));
        dto.setUpdatedAt(rs.getObject("updated_at", java.time.OffsetDateTime.class));
        return dto;
    }
}
