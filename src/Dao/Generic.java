package Dao;

import java.util.List;
import java.util.Optional;

public interface Generic<T>{


    public void insert(T t);
    public List<T> getall();
    public Optional<T>getById(long id);
    public void Update(T t);
    public void Delete(T t);

}
