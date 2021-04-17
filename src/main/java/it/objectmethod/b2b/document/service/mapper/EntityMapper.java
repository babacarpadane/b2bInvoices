package it.objectmethod.b2b.document.service.mapper;

import java.util.List;

public interface EntityMapper<D, E> { // D=dto E=entity
	D toDto(E entity);

	List<D> toDto(List<E> entity);

	E toEntity(D dto);

	List<E> toEntity(List<D> entity);
}
