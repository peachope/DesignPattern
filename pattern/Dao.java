package com.pattern;

import java.util.List;
import java.util.Optional;

public interface Dao <T> {
	
   List<T> getAll();
   Optional <T> get(int id);
   
   void save(T u);
   void update(T u);
   void delete(T u);
}
