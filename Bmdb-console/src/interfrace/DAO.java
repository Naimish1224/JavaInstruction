package interfrace;

import java.util.List;

import business.Item;

public interface DAO<T> {
	T get(int id);
	List<T> getAll();
	boolean add(T t);
	boolean update(T t);
	boolean delete(T t);
	boolean uptade(Item item);

}
