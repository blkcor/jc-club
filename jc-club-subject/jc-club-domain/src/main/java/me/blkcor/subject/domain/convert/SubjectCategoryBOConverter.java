package me.blkcor.subject.domain.convert;

import me.blkcor.subject.domain.entity.SubjectCategoryBO;
import me.blkcor.subject.infra.basic.entity.SubjectCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectCategoryBOConverter {
    SubjectCategoryBOConverter INSTANCE = Mappers.getMapper(SubjectCategoryBOConverter.class);

    SubjectCategoryBO convert(SubjectCategory subjectCategory);

}
