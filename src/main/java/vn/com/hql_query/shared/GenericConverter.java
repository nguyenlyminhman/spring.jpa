package vn.com.hql_query.shared;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class GenericConverter extends AbstractGenericConverter {

    protected ModelMapper modelMapper;

    @Override
    public <Entity, DTO> DTO toSingleModel(Entity entity, Class<DTO> dtoClass) {

        DTO dto = modelMapper.map(entity, dtoClass);

        return dto;
    }

    @Override
    public <Entity, DTO> Entity toListModel(DTO dto, Class<Entity> entityClass) {
        Entity entity = modelMapper.map(dto, entityClass);
        return entity;
    }

}

