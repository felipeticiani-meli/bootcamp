package bootcampspring.bootcampspring.calorias.repository;

import java.util.List;

public interface Dao<T> {

    List<T> getAll();
    T getFirstByName(String name);
    List<T> getListByName(String name);
}
