package bitmap.bitmap_backend.repositories;

import bitmap.bitmap_backend.dto.Product;
import bitmap.bitmap_backend.mappers.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import bitmap.bitmap_backend.repositories.sql.ProductSql;

import java.util.List;

@Repository
public class ProductRepository  {

        @Autowired
       private NamedParameterJdbcTemplate jdbcTemplate;

        public int insertProduct(Product dto){
            SqlParameterSource params = new MapSqlParameterSource()
            .addValue("name", dto.getName())
            .addValue("description", dto.getDescription())
            ;
            int updateCnt = jdbcTemplate.update(ProductSql.INSERT_PRODUCT, params);
            return updateCnt;
        }

        public Product getProductById(String name){
            MapSqlParameterSource parameterSource = new MapSqlParameterSource();
            parameterSource.addValue("name", name);
            try {
                Product dto = jdbcTemplate.queryForObject(ProductSql.SELECT_PRODUCT, parameterSource, new ProductRowMapper());
                return dto;
            } catch (EmptyResultDataAccessException ex){
                return null;
            }

        }

    public List<Product> getAllProducts(){
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
           try {
            List<Product> dto = jdbcTemplate.query(ProductSql.SELECT_ALL_PRODUCT,  new ProductRowMapper());
               return dto;
        } catch (EmptyResultDataAccessException ex){
            return null;
        }

    }

}

