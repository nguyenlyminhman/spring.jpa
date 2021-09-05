package vn.com.hql_query.shared;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public abstract class AbstractGenericConverter {

    @Autowired
    protected ModelMapper modelMapper;

    public abstract <Entity, DTO> DTO toSingleModel(Entity entity, Class<DTO> modelClass);

    public abstract <Entity, DTO> Entity toListModel(DTO dto, Class<Entity> entityClass);

    public <Entity, DTO> List<DTO> toSingleModel(final List<Entity> entityList, Class<DTO> modelClass) {
        return entityList.stream().filter(Objects::nonNull).map(entity -> toSingleModel(entity, modelClass))
                .collect(Collectors.toList());
    }

    public <Entity, DTO> List<Entity> toListModel(final List<DTO> modelList, Class<Entity> entityClass) {
        return modelList.stream().filter(Objects::nonNull).map(dto -> toListModel(dto, entityClass))
                .collect(Collectors.toList());
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
