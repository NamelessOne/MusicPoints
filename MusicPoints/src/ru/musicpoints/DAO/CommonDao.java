package ru.musicpoints.DAO;

import java.util.Collection;
import java.util.List;

import ru.musicpoints.logic.ModelEntity;

public interface CommonDao<T extends ModelEntity> {
	
	T get(Class<T> classz, Long id);
	List<T> get(Class<T> classz);
	
	void save(T modelEntity);
	void save(Collection<T> modelEntitie);
	void delete(T modelEntity);
	void delete(Collection<T> modelEntities);
	
}
