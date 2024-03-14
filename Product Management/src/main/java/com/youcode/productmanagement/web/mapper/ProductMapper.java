package com.youcode.productmanagement.web.mapper;
import com.youcode.productmanagement.domain.Product;
import com.youcode.productmanagement.web.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product productDTOToProduct(ProductDTO productDTO);

    ProductDTO productToProductDTO(Product product);
}

